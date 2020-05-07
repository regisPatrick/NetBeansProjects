/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.springbootprojecttest.awesome.endpoint;

import br.com.regisprojects.springbootprojecttest.awesome.model.Student;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Arrays.asList;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author user
 */
@RestController
@RequestMapping("student")
public class StudentEndpoint {
    
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll(){
        return asList(new Student("Deku"), new Student("Todoroki"));
    }
    
}
