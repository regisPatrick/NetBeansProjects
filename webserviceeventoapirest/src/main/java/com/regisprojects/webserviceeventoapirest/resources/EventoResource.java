/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.webserviceeventoapirest.resources;

import com.regisprojects.webserviceeventoapirest.models.Evento;
import com.regisprojects.webserviceeventoapirest.repository.EventoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
/**
 *
 * @author user
 */
@Api(value="API REST Eventos")
@RestController
@RequestMapping("/evento")
public class EventoResource {
    
    @Autowired
    private EventoRepository er;
    
    @ApiOperation(value="Retorna uma lista de Eventos")
    @GetMapping(produces = "application/json")
    public @ResponseBody ArrayList<Evento> listaEventos(){
        Iterable<Evento> listaEventos = er.findAll();
        ArrayList<Evento> eventos = new ArrayList<>();
        for(Evento evento : listaEventos){
            long codigo = evento.getCodigo();
            evento.add(linkTo(methodOn(EventoResource.class).evento(codigo)).withSelfRel());
            eventos.add(evento);
        }
        return eventos;
    }
    
    @ApiOperation(value="Retorna um Evento específico")
    @GetMapping(value = "/{codigo}", produces = "application/json")
    public @ResponseBody Evento evento(@PathVariable(value = "codigo") long codigo){
        Evento evento = er.findByCodigo(codigo);
        evento.add(linkTo(methodOn(EventoResource.class).listaEventos()).withRel("Lista de Eventos"));
        return evento;
    }
    
    @ApiOperation(value="Salva um Evento")
    @PostMapping()
    public Evento cadastraEvento(@RequestBody @Valid Evento evento){
        return er.save(evento);
    }
    
    @ApiOperation(value="Deleta um Evento")
    @DeleteMapping
    public Evento deletaEvento(@RequestBody Evento evento){
        er.delete(evento);
        return evento;
    }
    
}
