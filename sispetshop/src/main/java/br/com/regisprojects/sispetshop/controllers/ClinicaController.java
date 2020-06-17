/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.controllers;

import br.com.regisprojects.sispetshop.model.entity.ClinicaPetShop;
import br.com.regisprojects.sispetshop.repository.ClinicaPetRepository;
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
public class ClinicaController {
    
    @Autowired
    private ClinicaPetRepository cpr;
    
    @RequestMapping("/cadastrar_cachorro")
    public String formCachorro(){
        return "cachorro/form_cachorro";
    }
    
    @RequestMapping(value="/cadastrar_clinica_pet", method = RequestMethod.GET)
    public String formCadastraClinicaPetShop(){
        return "clinica_pet_shop/form_clinica_pet";
    }
    
    @RequestMapping(value="/cadastrar_clinica_pet", method = RequestMethod.POST)
    public String formCadastraClinica(@Valid ClinicaPetShop clinicaPetShop, BindingResult result, RedirectAttributes attributes){
        cpr.save(clinicaPetShop);
        return "redirect:/cadastrar_clinica_pet";
    }
    
    
    @RequestMapping(value = "/alterar", method = RequestMethod.GET)
    public ModelAndView alterarClinica(Long id){
        ClinicaPetShop clinicaPetShop = cpr.findById(id);
        ModelAndView mv = new ModelAndView("clinica_pet_shop/alterar_clinica");
        mv.addObject("clinicaPetShop", clinicaPetShop);
        return mv;
    }
    
    @RequestMapping(value="/alterar", method = RequestMethod.POST)
    public String alterarClinicaPet(@Valid ClinicaPetShop clinicaPetShop, BindingResult result, RedirectAttributes attributes){
        cpr.save(clinicaPetShop);
        return "redirect:/clinicas";
    }
    
    @RequestMapping("/clinicas")
    public ModelAndView listaClinicaPetShopController(){
        ModelAndView mv = new ModelAndView("clinica_pet_shop/lista_clinicas");
        Iterable<ClinicaPetShop> clinicaPetShops = cpr.findAll();
        mv.addObject("clinicaPetShops", clinicaPetShops);
        return mv;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView detalhesClinica(@PathVariable("id") Long id){
        ClinicaPetShop clinicaPetShop = cpr.findById(id);
        ModelAndView mv = new ModelAndView("clinica_pet_shop/detalhesClinica");
        mv.addObject("clinicaPetShop", clinicaPetShop);
        return mv;
    }
    
    @RequestMapping("/deletarClinica")
    public String deletarClinica(Long id){
        ClinicaPetShop clinicaPetShop = cpr.findById(id);
        cpr.delete(clinicaPetShop);
        return "redirect:/clinicas";
    }
}
