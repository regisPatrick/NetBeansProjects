/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.endpoint;

import br.com.regisprojects.cursospringbootessentials.error.CustomErrorType;
import br.com.regisprojects.cursospringbootessentials.model.Student;
import br.com.regisprojects.cursospringbootessentials.repository.StudentRepository;
import br.com.regisprojects.cursospringbootessentials.util.DateUtil;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Arrays.asList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("students")
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
    
    @GetMapping
    public ResponseEntity<?> listAll(){
        return new ResponseEntity<>(studentDAO.findAll(), HttpStatus.OK);
    }
    
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
    
    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") Long id){
        Student student = studentDAO.findById(id).get();
        if(student == null)
            return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    
    @GetMapping(path = "/findByName/{name}")
    public ResponseEntity<?> findStudentsByName(@PathVariable String name){
        return new ResponseEntity<>(studentDAO.findByNameIgnoreCaseContaining(name), HttpStatus.OK);
    }
    
//    @RequestMapping(method = RequestMethod.POST)
//    @PostMapping
//    public ResponseEntity<?> save(@RequestBody Student student){
//        Student.studentList.add(student);
//        return new ResponseEntity<>(student, HttpStatus.OK);
//    }
    
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student){
        return new ResponseEntity<>(studentDAO.save(student), HttpStatus.OK);
    }
    
//    @RequestMapping(method = RequestMethod.DELETE)
//    @DeleteMapping
//    public ResponseEntity<?> delete(@RequestBody Student student){
//        Student.studentList.remove(student);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
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
    
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Student student){
        studentDAO.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
