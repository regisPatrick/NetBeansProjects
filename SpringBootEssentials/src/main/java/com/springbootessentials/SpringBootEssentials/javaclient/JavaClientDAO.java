/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.javaclient;

import com.springbootessentials.SpringBootEssentials.handler.RestResponseExceptionHandler;
import com.springbootessentials.SpringBootEssentials.model.PageableResponse;
import com.springbootessentials.SpringBootEssentials.model.Student;
import java.util.List;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author user
 */
public class JavaClientDAO {

    private RestTemplate restTemplate = new RestTemplateBuilder()
            .rootUri("http://localhost:8080/v1/protected/students")
            .basicAuthentication("regis", "123")
            .errorHandler(new RestResponseExceptionHandler())
            .build();
    private RestTemplate restTemplateAdmin = new RestTemplateBuilder()
            .rootUri("http://localhost:8080/v1/admin/students")
            .basicAuthentication("regis", "123")
            .errorHandler(new RestResponseExceptionHandler())
            .build();
    
    public Student findById(long id){
        return restTemplate.getForObject("/{id}", Student.class, id);
        //ResponseEntity<Student> forEntity = restTemplate.getForEntity("/{id}", Student.class, 14);
    }
    
    public List<Student> listAll(){
 //       Student[] students = restTemplate.getForObject("/", Student[].class);
//        System.out.println(Arrays.toString(students));
//        ResponseEntity<List<Student>> exchange = restTemplate.exchange("/", HttpMethod.GET, null, 
//                new ParameterizedTypeReference<List<Student>>() {});
//        System.out.println(exchange.getBody());
        ResponseEntity<PageableResponse<Student>> exchange = restTemplate.exchange("/", HttpMethod.GET, null, 
                new ParameterizedTypeReference<PageableResponse<Student>>() {});
        return exchange.getBody().getContent();
    }
    
    public Student save(Student student){
//        Student studentPostForObject = restTemplateAdmin.postForObject("/", studentPost, Student.class);
//        ResponseEntity<Student> studentResponseEntity = restTemplateAdmin.postForEntity("/", studentPost, Student.class);
        ResponseEntity<Student> exchangePost = restTemplateAdmin.exchange("/", HttpMethod.POST,
                new HttpEntity<>(student, createJsonHeader()), Student.class);
        return exchangePost.getBody();
    }
    
    public void update(Student student){
        restTemplateAdmin.put("/", student);
    }
    
    public void delete(long id){
        restTemplateAdmin.delete("/{id}", id);
    }
    
    private static HttpHeaders createJsonHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

}
