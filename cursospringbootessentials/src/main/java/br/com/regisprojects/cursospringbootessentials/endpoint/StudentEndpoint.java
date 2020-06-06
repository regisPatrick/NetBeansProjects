/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.endpoint;

import br.com.regisprojects.cursospringbootessentials.error.CustomErrorType;
import br.com.regisprojects.cursospringbootessentials.error.ResourceNotFoundException;
import br.com.regisprojects.cursospringbootessentials.model.Student;
import br.com.regisprojects.cursospringbootessentials.repository.StudentRepository;
import br.com.regisprojects.cursospringbootessentials.util.DateUtil;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Arrays.asList;
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
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author user
 */
@RestController
@RequestMapping("v1")
public class StudentEndpoint {
    
//    private final DateUtil dateUtil;
    
    private final StudentRepository studentDAO;
    
//    @Autowired
//    public StudentEndpoint(DateUtil dateUtil) {
//        this.dateUtil = dateUtil;
//    }
    
    @Autowired
    public StudentEndpoint(StudentRepository studentDAO) {
        this.studentDAO = studentDAO;
    }
    
//    @RequestMapping(method = RequestMethod.GET)
//    @GetMapping
//    public ResponseEntity<?> listAll(){
////        System.out.println("------------" + dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
//        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
//    }
    
//    Com Paginação
    @GetMapping(path = "protected/students")
    public ResponseEntity<?> listAll(Pageable pageable){
        return new ResponseEntity<>(studentDAO.findAll(pageable), HttpStatus.OK);
    }
    
//    @GetMapping(path = "protected/students")
//    public ResponseEntity<?> listAll(Pageable pageable){
//        return new ResponseEntity<>(studentDAO.findAll(), HttpStatus.OK);
//    }
    
//    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
//    @GetMapping(path = "/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable("id") int id){
//        Student student = new Student();
//        student.setId(id);
//        int index = Student.studentList.indexOf(student);
//        if(index == -1)
//            return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
//        return new ResponseEntity<>(Student.studentList.get(index), HttpStatus.OK);
//    }
    
//    @GetMapping(path = "/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable("id") Long id){
//        Student student = studentDAO.findById(id).get();
//        if(student == null)
//            return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
//        return new ResponseEntity<>(student, HttpStatus.OK);
//    }
    
    @GetMapping(path = "protected/students/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") Long id, 
                                            @AuthenticationPrincipal UserDetails userDetails){
        System.out.println(userDetails);
        verifyIfStudentExists(id);
        Student student = studentDAO.findStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    
    @GetMapping(path = "protected/students/findByName/{name}")
    public ResponseEntity<?> findStudentsByName(@PathVariable String name){
        return new ResponseEntity<>(studentDAO.findByNameIgnoreCaseContaining(name), HttpStatus.OK);
    }
    
//    @RequestMapping(method = RequestMethod.POST)
//    @PostMapping
//    public ResponseEntity<?> save(@RequestBody Student student){
//        Student.studentList.add(student);
//        return new ResponseEntity<>(student, HttpStatus.OK);
//    }
    
    @PostMapping(path = "admin/students")
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> save(@Valid @RequestBody Student student){
        return new ResponseEntity<>(studentDAO.save(student), HttpStatus.OK);
    }
    
//    @RequestMapping(method = RequestMethod.DELETE)
//    @DeleteMapping
//    public ResponseEntity<?> delete(@RequestBody Student student){
//        Student.studentList.remove(student);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
    
    @DeleteMapping(path = "admin/students/{id}")
//    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> delete(@PathVariable Long id){
        verifyIfStudentExists(id);
        studentDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
//    @RequestMapping(method = RequestMethod.PUT)
//    @PutMapping
//    public ResponseEntity<?> update(@RequestBody Student student){
//        Student.studentList.remove(student);
//        Student.studentList.add(student);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
    
    @PutMapping(path = "admin/students")
    public ResponseEntity<?> update(@RequestBody Student student){
        verifyIfStudentExists(student.getId());
        studentDAO.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    private void verifyIfStudentExists(Long id){
        if(studentDAO.findStudentById(id) == null)
            throw new ResourceNotFoundException("Student not found for ID: " + id);
    }
    
}
