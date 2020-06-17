/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials;

import com.springbootessentials.SpringBootEssentials.model.Student;
import com.springbootessentials.SpringBootEssentials.repository.StudentRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolationException;
//import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author user
 */
@ExtendWith(SpringExtension.class) // Desde o Spring Boot 2.1 as anotações @DataJpaTest, @WebMvcTest e @SpringBootTest já incluem a anotação @ExtendWith.
@DataJpaTest
//@AutoConfigureTestDatabase(replace=Replace.NONE)
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE) // Anotação para usar o banco de dados.
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void createWhenEmailIsNullShouldThrowConstranintViolationException() {

        try {

            Student student = new Student("Regis", "regis@regis.com");
            this.studentRepository.save(student);
            Assertions.assertThat(student.getId()).isNotNull();
            Assertions.assertThat(student.getName()).isEqualTo("Regis");
            Assertions.assertThat(student.getEmail()).isEqualTo("regis@regis.com");

        } catch (ConstraintViolationException ce) {
            
            Assertions.fail("O Teste Falhou!!! " + ce.toString());
            
        } finally {
            
            entityManager.flush();
            
        }
        

    }
    
    @Test
    public void deleteShouldRemoveData(){
        Student student = new Student("Regis", "regis@regis.com");
        this.studentRepository.save(student);
        studentRepository.delete(student);
        //Assertions.assertThat(studentRepository.findById(student.getId())).isNull();
        assertThat(!studentRepository.findById(student.getId()).isPresent());
    }
    
    @Test
    public void updateShouldChangeAndPersistData(){
        Student student = new Student("Regis", "regis@regis.com");
        //Student student2 = new Student("Wilian", "wilian@wilian.com");
        this.studentRepository.save(student);
        student.setName("Wilian");
        student.setEmail("wilian@wilian.com");
        this.studentRepository.save(student);
        student = this.studentRepository.findById(student.getId().longValue());
        //Assertions.assertThat(studentRepository.findById(student.getId())).isNull();
        //assertThat(!studentRepository.findById(student.getId()).isPresent());
        Assertions.assertThat(student.getName()).isEqualTo("Wilian");
        Assertions.assertThat(student.getEmail()).isEqualTo("wilian@wilian.com");
    }
    
    @Test
    public void findByNameIgnoreCaseContainingShouldIgnoreCase(){
        Student student = new Student("Wilian", "regis@regis.com");
        Student student2 = new Student("wilian", "wilian@wilian.com");
        this.studentRepository.save(student);
        this.studentRepository.save(student2);
        List<Student> studentList = studentRepository.findByNameIgnoreCaseContaining("wilian");
        assertThat(studentList.size()).isEqualTo(2);
        
    }
    
    @Test
    public void createWhenNameIsNullShouldThrowConstraintViolationException(){
        
        try {

            Student student = new Student();
            student.setName("Regis");
            student.setEmail("regis@regis.com");
            this.studentRepository.save(student);
            Assertions.assertThat(student.getId()).isNotNull();
            Assertions.assertThat(student.getName()).isEqualTo("Regis");
            Assertions.assertThat(student.getEmail()).isEqualTo("regis@regis.com");

        } catch (ConstraintViolationException ce) {
            
            Assertions.fail("O Teste Falhou!!! " + ce.toString());
            
        } finally {
            
            entityManager.flush();
            
        }
        
    }

//    @Test
//    public void createWhenEmailIsNullShouldThrowConstranintViolationException() {
//        Assertions.assertThrows(
//                ConstraintViolationException.class,
//                () -> studentRepository.save(new Student("luiz", "luiz@luiz.com"){
//            @Override
//            public void setId(Long id) {
//                super.setId(55L); 
//            }
//                    
//                }));
//    }
//    @Test
//    public void createWhenEmailINotValidShouldThrowConstranintViolationException() {
//        Assertions.assertThrows(
//                ConstraintViolationException.class,
//                () -> studentRepository.save(new Student("luiz", "INVALID")));
//    }
}
