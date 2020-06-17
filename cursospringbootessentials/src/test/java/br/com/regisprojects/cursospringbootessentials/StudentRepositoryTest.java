/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials;

import br.com.regisprojects.cursospringbootessentials.model.Student;
import br.com.regisprojects.cursospringbootessentials.repository.StudentRepository;
import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author user
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void createShouldPersistData(){
        Student student = new Student("Regis", "regis@email.com.br");
        this.studentRepository.save(student);
        
        Assertions.assertThat(student.getId()).isNotNull();
        Assertions.assertThat(student.getName()).isEqualTo("Regis");
        Assertions.assertThat(student.getEmail()).isEqualTo("regis@email.com.br");
    }
    
    @Test
    public void deleteShouldRemoveData(){
        Student student = new Student("Regis", "regis@email.com.br");
        this.studentRepository.save(student);
        studentRepository.delete(student);
        
        assertThat(studentRepository.findStudentById(student.getId())).isNull();
    }
    
    @Test
    public void updateShouldChangeAndPersistData(){
        Student student = new Student("Regis", "regis@email.com.br");
        this.studentRepository.save(student);
        student.setName("Regis222");
        student.setEmail("regis222@email.com.br");
        this.studentRepository.save(student);
        student = this.studentRepository.findStudentById(student.getId());
        assertThat(student.getName()).isEqualTo("Regis222");
        assertThat(student.getEmail()).isEqualTo("regis222@email.com.br");
    }
    
}
