/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.javaclient;

import br.com.regisprojects.cursospringbootessentials.model.PageableResponse;
import br.com.regisprojects.cursospringbootessentials.model.Student;
import java.util.Arrays;
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
public class JavaSpringClientTest {
    public static void main(String[] args) {
      
        Student studentPost = new Student();
        studentPost.setName("John Wick 2");
        studentPost.setEmail("john@pencil.com");
//        studentPost.setId(25L);
        
        JavaClientDAO dao = new JavaClientDAO();
//        System.out.println(dao.findById(111));
//        System.out.println(dao.findById(1));
//        System.out.println(dao.listAll());
//        System.out.println(dao.save(studentPost));

//        List<Student> students = dao.listAll();
//        System.out.println(students);

//        dao.update(studentPost);

//        dao.delete(25);
        dao.delete(56);
        
    }
    
}
