/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.appevento.appevento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
public class EventoController {
    
    @RequestMapping("/cadastrarEvento")
    public String form(){
        return "evento/formEvento";
    }
    
}
