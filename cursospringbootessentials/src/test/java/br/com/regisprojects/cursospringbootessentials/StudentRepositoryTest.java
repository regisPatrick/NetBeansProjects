/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials;

import br.com.regisprojects.cursospringbootessentials.model.Student;
import br.com.regisprojects.cursospringbootessentials.repository.StudentRepository;
import java.util.List;
import javax.validation.ConstraintViolationException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.web.bind.MethodArgumentNotValidException;

/**
 *
 * @author user
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
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
    
    @Test
    public void findByNameIgnoreCaseContainingShouldIgnoreCase(){
        Student student = new Student("Regis", "regis@email.com.br");
        Student student2 = new Student("regis", "regis222@email.com.br");
        this.studentRepository.save(student);
        this.studentRepository.save(student2);
        List<Student> studentList = studentRepository.findByNameIgnoreCaseContaining("regis");
        assertThat(studentList.size()).isEqualTo(2);
    }
    
    @Test
    public void createWhenNameIsNullShouldThrowConstraintViolationException(){
        Exception exception = assertThrows(
                MethodArgumentNotValidException.class,
                () -> studentRepository.save(new Student("", "email@gmail.com")));

        assertTrue(exception.getMessage().contains("O campo nome do estudante é obrigatório"));
    }
    
    @Test
    public void createWhenEmailIsNullShouldThrowConstraintViolationException(){
        Student student = new Student();
        student.setName("regis");
        Exception exception = assertThrows(
                ConstraintViolationException.class,
                () -> studentRepository.save(student));

        assertTrue(exception.getMessage().contains("O campo email é obrigatório"));
    }
    
    @Test
    public void createWhenEmailIsNotValidShouldThrowConstraintViolationException(){
        Exception exception = assertThrows(
                ConstraintViolationException.class,
                () -> studentRepository.save(new Student("regis", "errado.email")));

        assertTrue(exception.getMessage().contains("O email deve ser válido"));
    }
    
}
