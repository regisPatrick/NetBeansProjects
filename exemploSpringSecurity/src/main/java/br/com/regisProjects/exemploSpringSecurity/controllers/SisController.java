/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisProjects.exemploSpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
public class SisController {
    
    @RequestMapping("/helloworld")
    public String index(){
        return "spring_security/testeSpringSecurity";
    }
    
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String teste(){
        return "spring_security/testeAdminSpringSecurity";
    }
    
}
