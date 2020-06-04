/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.javaclient;

import br.com.regisprojects.cursospringbootessentials.model.Student;
import org.springframework.boot.web.client.RestTemplateBuilder;
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
    }
    
}
