/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.Cursos.controllers;

import com.regisprojects.Cursos.models.Evento;
import com.regisprojects.Cursos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
public class EventoController {
    
    @Autowired
    private EventoRepository er;
    
    @RequestMapping(value="/cadastrarEvento", method = RequestMethod.GET)
    public String form(){
        return "evento/formEvento";
    }
    
    @RequestMapping(value="/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento){
        
        er.save(evento);
        
        return "redirect:/cadastrarEvento";
    }
    
}
