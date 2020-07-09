/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.appevento.appevento.controller;

import br.com.regisprojects.appevento.appevento.model.Convidado;
import br.com.regisprojects.appevento.appevento.model.Evento;
import br.com.regisprojects.appevento.appevento.repository.ConvidadoRepository;
import br.com.regisprojects.appevento.appevento.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author user
 */
@Controller
public class EventoController {
    
    @Autowired
    private EventoRepository er;
    
    @Autowired
    private ConvidadoRepository cr;
    
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String form(){
        return "evento/formEvento";
    }
    
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento){
        
        er.save(evento);
        
        return "redirect:/cadastrarEvento";
    }
    
    @RequestMapping(value = "/eventos", method = RequestMethod.GET)
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = er.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }
    
    @RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
    public ModelAndView detalhesEvento(@PathVariable("codigo") long codigo){
        Evento evento = er.findByCodigo(codigo);
        ModelAndView mv = new ModelAndView("evento/detalhesEvento");
        mv.addObject("evento", evento);
        return mv;
    }
    
    @RequestMapping(value = "/{codigo}", method = RequestMethod.POST)
    public String detalhesEventoPost(@PathVariable("codigo") long codigo, Convidado convidado){
        Evento evento = er.findByCodigo(codigo);
        convidado.setEvento(evento);
        cr.save(convidado);
        return "redirect:/{codigo}";
    }
    
}
