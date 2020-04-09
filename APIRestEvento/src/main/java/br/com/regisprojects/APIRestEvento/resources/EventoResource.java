/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.APIRestEvento.resources;

import br.com.regisprojects.APIRestEvento.models.Evento;
import br.com.regisprojects.APIRestEvento.repository.EventoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    
    @ApiOperation(value="Retorna uma lista de eventos")
    @GetMapping(produces="application/json")
    public @ResponseBody Iterable<Evento> listaEventos(){
        Iterable<Evento> listaEventos = er.findAll();
        return listaEventos;
    }
    
    @ApiOperation("Salva um evento")
    @PostMapping()
    public Evento cadastraEvento(@RequestBody @Valid Evento evento){
        return er.save(evento);
    }
    
    @ApiOperation("Deleta um evento")
    @DeleteMapping()
    public Evento deletaEvento(@RequestBody Evento evento){
        er.delete(evento);
        return evento; 
    }
}
