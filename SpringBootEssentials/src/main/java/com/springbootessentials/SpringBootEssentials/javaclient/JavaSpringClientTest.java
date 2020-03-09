/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.javaclient;

import com.springbootessentials.SpringBootEssentials.model.Student;
import java.util.List;

/**
 *
 * @author user
 */
public class JavaSpringClientTest {
    
    public static void main(String[] args) {   
        
        Student studentPost = new Student();
        studentPost.setName("Jhon Rambo Stallone");
        studentPost.setEmail("jhon@rambo.com");
        studentPost.setId(39L);
        
        JavaClientDAO dao = new JavaClientDAO();
//        System.out.println(dao.findById(14));
//        System.out.println(dao.listAll());
//        System.out.println(dao.save(studentPost));
//        
//        List<Student> students = dao.listAll();
//        System.out.println(students);

//        dao.update(studentPost);

//        dao.delete(39L);

//        System.out.println(dao.findById(111)); // Teste para RestResponseExceptionHandler com id inexistente.
        dao.delete(39L); // Teste para RestResponseExceptionHandler com id inexistente.
        
    }
}
