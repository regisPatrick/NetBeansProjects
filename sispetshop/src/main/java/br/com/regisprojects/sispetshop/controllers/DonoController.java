/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.controllers;

import br.com.regisprojects.sispetshop.model.entity.Dono;
import br.com.regisprojects.sispetshop.repository.DonoRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author user
 */
@Controller
public class DonoController {

    @Autowired
    private DonoRepository dr;

    @RequestMapping("/donos")
    public ModelAndView listaDonos() {
        ModelAndView mv = new ModelAndView("sispet/dono/lista_donos");
        Iterable<Dono> donos = dr.findAll();
        mv.addObject("donos", donos);
        return mv;
    }

    @RequestMapping(value="/cadastrar_dono", method = RequestMethod.GET)
    public String formCadastraDonoPetShop(){
        return "sispet/dono/form_dono";
    }
    
    @RequestMapping(value="/cadastrar_dono", method = RequestMethod.POST)
    public String formCadastraDono(@Valid Dono dono, BindingResult result, RedirectAttributes attributes){
        dr.save(dono);
        return "redirect:/cadastrar_dono";
    }
    
    @RequestMapping(value="/sispet/dono/detalhes/{iddono}", method = RequestMethod.GET)
    public ModelAndView detalhesDono(@PathVariable("iddono") String id){
        Dono dono = dr.findByCpf(id);
        ModelAndView mv = new ModelAndView("sispet/dono/detalhes/detalhes_dono");
        mv.addObject("dono", dono);
        return mv;
    }

    @RequestMapping(value = "/alterar_dono", method = RequestMethod.GET)
    public ModelAndView alterarDono(String id){
        Dono dono = dr.findByCpf(id);
        ModelAndView mv = new ModelAndView("sispet/dono/alteracao/alterar_dono");
        mv.addObject("dono", dono);
        return mv;
    }
    
    @RequestMapping(value="/alterar_dono", method = RequestMethod.POST)
    public String alterarDonoPet(@Valid Dono dono, BindingResult result, RedirectAttributes attributes){
        dr.save(dono);
        return "redirect:/donos";
    }
    
    @RequestMapping("/deletarDono")
    public String deletarDono(String id){
        Dono dono = dr.findByCpf(id);
        dr.delete(dono);
        return "redirect:/donos";
    }
    
}
