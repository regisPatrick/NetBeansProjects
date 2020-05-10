/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.endpoint;

import br.com.regisprojects.cursospringbootessentials.model.Student;
import br.com.regisprojects.cursospringbootessentials.util.DateUtil;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Arrays.asList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author user
 */
@RestController
@RequestMapping("student")
public class StudentEndpoint {
    
    @Autowired
    private DateUtil dateUtil;
    
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll(){
//        System.out.println("------------" + dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList(new Student("Deku"), new Student("Todoroki"));
    }
    
}
