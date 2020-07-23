/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.webserviceeventoapirest.resources;

import com.regisprojects.webserviceeventoapirest.models.Evento;
import com.regisprojects.webserviceeventoapirest.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/evento")
public class EventoResource {
    
    @Autowired
    private EventoRepository er;
    
    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<Evento> listaEventos(){
        Iterable<Evento> listaEventos = er.findAll();
        return listaEventos;
    }
    
}
