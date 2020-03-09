/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.endpoint;

import com.springbootessentials.SpringBootEssentials.error.CustomErrorType;
import com.springbootessentials.SpringBootEssentials.error.ResourceNotFoundException;
import com.springbootessentials.SpringBootEssentials.model.Student;
import com.springbootessentials.SpringBootEssentials.repository.StudentRepository;
import com.springbootessentials.SpringBootEssentials.util.DateUtil;
import static java.util.Arrays.asList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("v1")
public class StudentEndpoint {
    
//    @Autowired
//    private DateUtil dateUtil;
//    
//    @GetMapping
////    @RequestMapping(method = RequestMethod.GET)
//    public ResponseEntity<?> listAll(){
////        System.out.println("----------**-----------" + dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
//        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
//    }
//    
//    @GetMapping(path = "/{id}")
////    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable("id") int id){
//        Student student = new Student();
//        student.setId(id);
//        int index = Student.studentList.indexOf(student);
//        if (index == -1){
//            return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
//        } else {
//            return new ResponseEntity<>(Student.studentList.get(index), HttpStatus.OK);
//        }
//    }   
//    
//    @PostMapping
////    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<?> save(@RequestBody Student student){
//        Student.studentList.add(student);
//        return new ResponseEntity<>(student, HttpStatus.OK);
//    }
//
//    @DeleteMapping
////    @RequestMapping(method = RequestMethod.DELETE)
//    public ResponseEntity<?> delete(@RequestBody Student student){
//        Student.studentList.remove(student);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }    
//    
//    @PutMapping
////    @RequestMapping(method = RequestMethod.PUT)
//    public ResponseEntity<?> update(@RequestBody Student student){
//        Student.studentList.remove(student);
//        Student.studentList.add(student);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
    
    
    private final StudentRepository studentDAO;
    
    @Autowired
    public StudentEndpoint(StudentRepository studentDAO){
        this.studentDAO = studentDAO;
    }
    
//    @GetMapping
////    @RequestMapping(method = RequestMethod.GET)
//    public ResponseEntity<?> listAll(){
//        return new ResponseEntity<>(studentDAO.findAll(), HttpStatus.OK);
//    }
    
    @GetMapping(path = "protected/students")
//    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listAll(Pageable pageable) {
        //System.out.println(studentDAO.findAll()); // Para ver os resultados do Mock
        return new ResponseEntity<>(studentDAO.findAll(pageable), HttpStatus.OK);
//        return new ResponseEntity<>(studentDAO.findAll(), HttpStatus.OK);
    }
    
    @GetMapping(path = "protected/students/{id}")
//    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") long id, 
                                            @AuthenticationPrincipal UserDetails userDetails){
        System.out.println(userDetails);
        verifyIfStudentExists(id);
        Student student = studentDAO.findById(id);
//        if (student == null)
//            throw new ResourceNotFoundException("Student not found for ID: " + id);
//            return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(student, HttpStatus.OK);
        
    }
    
    @GetMapping(path = "protected/students/findByName/{name}")
    public ResponseEntity<?> findStudentsByName(@PathVariable("name") String name){
        return new ResponseEntity<>(studentDAO.findByNameIgnoreCaseContaining(name), HttpStatus.OK);
    }
    
    @PostMapping(path = "admin/students")
//    @RequestMapping(method = RequestMethod.POST)
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> save(@Valid @RequestBody Student student){
        return new ResponseEntity<>(studentDAO.save(student), HttpStatus.CREATED);
    }
    
//    @PostMapping                                    //Teste de controle transacional com a tabela do banco de dados
//    @Transactional
////    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<?> save(@RequestBody Student student){
//        studentDAO.save(student);
//        student.setId(null);
//        studentDAO.save(student);
//        if (true)
//            throw new RuntimeException("Test Transaction");
//        studentDAO.save(student);
//        return new ResponseEntity<>(studentDAO.save(student), HttpStatus.OK);
//    }
    
      @DeleteMapping(path = "admin/students/{id}")
//    @RequestMapping(method = RequestMethod.DELETE)
//      @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> delete(@PathVariable Long id){
        verifyIfStudentExists(id);
        studentDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
      @PutMapping(path = "admin/students")
//    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Student student){
        verifyIfStudentExists(student.getId());
        studentDAO.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    private void verifyIfStudentExists(Long id){
        if (!studentDAO.findById(id).isPresent())
            throw new ResourceNotFoundException("Student not found for ID: " + id);
    }
    
}

