/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.javaclient;

import br.com.regisprojects.cursospringbootessentials.model.PageableResponse;
import br.com.regisprojects.cursospringbootessentials.model.Student;
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
            .basicAuthentication("pegasus", "123")
            .build();

    private RestTemplate restTemplateAdmin = new RestTemplateBuilder()
            .rootUri("http://localhost:8080/v1/admin/students")
            .basicAuthentication("pegasus", "123")
            .build();

    public Student findById(long id) {
//        Student student = 
        return restTemplate.getForObject("/{id}", Student.class, id);
//        ResponseEntity<Student> forEntity = restTemplate.getForEntity("/{id}", Student.class, 5);
    }

    public List<Student> listAll() {
//        Student[] students = restTemplate.getForObject("/", Student[].class);
//        System.out.println(Arrays.toString(students));
//        ResponseEntity<List<Student>> exchange = restTemplate.exchange("/", HttpMethod.GET, null, 
//                new ParameterizedTypeReference<List<Student>>() {});
//        System.out.println(exchange.getBody());
        ResponseEntity<PageableResponse<Student>> exchange = restTemplate.exchange("/", HttpMethod.GET, null, 
                new ParameterizedTypeReference<PageableResponse<Student>>() {});
        return exchange.getBody().getContent();
                                                                                    // ?sort=id,desc&sort=name,asc

    }
    
    public Student save(Student student){
//        System.out.println(exchange);
//        Student studentPost = new Student();
//        studentPost.setName("John Wick");
//        studentPost.setEmail("john@pencil.com");
        
        ResponseEntity<Student> exchangePost = restTemplateAdmin.exchange("/", 
                HttpMethod.POST, new HttpEntity<>(student, createJSONHeader()), Student.class);
        
//        Student studentPostForObject = restTemplateAdmin.postForObject("/", studentPost, Student.class);
//        
//        ResponseEntity<Student> studentResponseEntity = restTemplateAdmin.postForEntity("/", studentPost, Student.class);
//        
//        System.out.println(exchangePost);
//        
//        System.out.println(studentPostForObject);
//        
//        System.out.println(studentResponseEntity);

        return exchangePost.getBody();
    }
    
    public void update(Student student){
        restTemplateAdmin.put("/", student);
    }
    
    public void delete(long id){
        restTemplateAdmin.delete("/{id}", id);
    }
    
    private static HttpHeaders createJSONHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

}
