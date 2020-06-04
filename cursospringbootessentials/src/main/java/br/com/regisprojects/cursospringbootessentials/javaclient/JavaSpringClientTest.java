/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.javaclient;

import br.com.regisprojects.cursospringbootessentials.model.Student;
import java.util.Arrays;
import java.util.List;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author user
 */
public class JavaSpringClientTest {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri("http://localhost:8080/v1/protected/students")
                .basicAuthentication("pegasus", "123")
                .build();
        
        Student student = restTemplate.getForObject("/{id}", Student.class, 5);
        ResponseEntity<Student> forEntity = restTemplate.getForEntity("/{id}", Student.class, 5);
        System.out.println(student);
        System.out.println(forEntity.getBody());
        
        Student[] students = restTemplate.getForObject("/", Student[].class);
        System.out.println(Arrays.toString(students));
        ResponseEntity<List<Student>> exchange = restTemplate.exchange("/", HttpMethod.GET, null, 
                new ParameterizedTypeReference<List<Student>>() {});
        System.out.println(exchange.getBody());
    }
    
}
