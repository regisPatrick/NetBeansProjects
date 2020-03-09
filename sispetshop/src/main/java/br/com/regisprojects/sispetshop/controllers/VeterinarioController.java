/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.controllers;

import br.com.regisprojects.sispetshop.model.entity.Cachorro;
import br.com.regisprojects.sispetshop.model.entity.ClinicaPetShop;
import br.com.regisprojects.sispetshop.model.entity.Consulta;
import br.com.regisprojects.sispetshop.model.entity.Dono;
import br.com.regisprojects.sispetshop.model.entity.Veterinario;
import br.com.regisprojects.sispetshop.repository.CachorroRepository;
import br.com.regisprojects.sispetshop.repository.ClinicaPetRepository;
import br.com.regisprojects.sispetshop.repository.ConsultaRepository;
import br.com.regisprojects.sispetshop.repository.DonoRepository;
import br.com.regisprojects.sispetshop.repository.VeterinarioRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author user
 */
@Controller
public class VeterinarioController {
    
    @Autowired
    private VeterinarioRepository vr;
    
    @Autowired
    private ClinicaPetRepository cpr;
    
    @Autowired
    private ConsultaRepository cr;
    
    @Autowired
    private CachorroRepository caor;
    
    @Autowired
    private DonoRepository dr;
    
    @RequestMapping(value="/sispet/veterinario/{idclinivet}", method = RequestMethod.POST)
    public String listaVeterinariosPost(@PathVariable("idclinivet") Long idclinivet, @Valid Veterinario veterinario, BindingResult result, RedirectAttributes attributes){
        ClinicaPetShop clinicaPetShop = cpr.findById(idclinivet);
        veterinario.setClinica(clinicaPetShop);
        vr.save(veterinario);
        return "redirect:/sispet/veterinario/{idclinivet}";
    }
    
    @RequestMapping(value="/sispet/veterinario/{idclinivet}", method = RequestMethod.GET)
    public ModelAndView listaVeterinarios(@PathVariable("idclinivet") Long idclinivet){
        ClinicaPetShop clinicaPetShop = cpr.findById(idclinivet);
        ModelAndView mv = new ModelAndView("sispet/veterinario/listaVeterinarios");
        Iterable<Veterinario> veterinarios = vr.findByClinica(clinicaPetShop);
        mv.addObject("veterinarios", veterinarios);
        return mv;
    }
    
    @RequestMapping(value = "/sispet/veterinario/detalhes/{idv}", method = RequestMethod.GET)
    public ModelAndView detalhesVeterinario(@PathVariable("idv") String idv){
        Veterinario veterinario = vr.findByCrmv(idv);
        ModelAndView mv = new ModelAndView("sispet/veterinario/detalhes/detalhes_veterinario");
        mv.addObject("veterinario", veterinario);
        return mv;
    }
    
    @RequestMapping(value = "/alterarVeterinario", method = RequestMethod.GET)
    public ModelAndView alterarVeterinario(String crmv){
        Veterinario veterinario = vr.findByCrmv(crmv);
        ClinicaPetShop clinicaPetShop = veterinario.getClinica();
        ModelAndView mv = new ModelAndView("sispet/veterinario/alteracao/alterar_veterinario");
        mv.addObject("veterinario", veterinario);
        mv.addObject("clinicaPetShop", clinicaPetShop);
        return mv;
    }
    
    @RequestMapping(value="/alterarVeterinario", method = RequestMethod.POST)
    public String alterarVeterinarioPet(@RequestParam(value = "clinicaPetShop", required = true) Long clinicaPetShopId, @Valid Veterinario veterinario, BindingResult result, RedirectAttributes attributes){
        
        ClinicaPetShop clinicaPetShop = cpr.findById(clinicaPetShopId);
        veterinario.setClinica(clinicaPetShop);
        vr.save(veterinario);
        
        Long idLong = veterinario.getClinica().getId();
        String idStr = "" + idLong;
        return "redirect:/sispet/veterinario/" + idStr;
    }
    
    @RequestMapping("/deletarVeterinario")
    public String deletarVeterinario(String crmv){
        Veterinario veterinario = vr.findByCrmv(crmv);
        vr.delete(veterinario);
        
        ClinicaPetShop clinicaPetShop = veterinario.getClinica();
        Long idLong = clinicaPetShop.getId();
        String idStr = "" + idLong;
        return "redirect:/sispet/veterinario/" + idStr;
    }

//    --------------- Abaixo Controller referente à Consultas------------------------
    
    @RequestMapping(value="/sispet/consulta/{idcons}", method = RequestMethod.GET)
    public ModelAndView listaConsultas(@PathVariable("idcons") String idcons){
        Veterinario veterinario = vr.findByCrmv(idcons);
        ModelAndView mv = new ModelAndView("sispet/consulta/listaConsultas");
        Iterable<Consulta> consultas = cr.findByVeterinario(veterinario);
        mv.addObject("consultas", consultas);
        return mv;
    }
    
    @RequestMapping(value="/sispet/consulta/{idcons}", method = RequestMethod.POST)
    public String listaConsultasPost(@PathVariable("idcons") String idcons, @RequestParam(value = "codigo", required = true) Long codcachorro,  @Valid Consulta consulta, BindingResult result, RedirectAttributes attributes){
        Veterinario veterinario = vr.findByCrmv(idcons);
        consulta.setVeterinario(veterinario);
        Cachorro cachorro = caor.findById(codcachorro);
        consulta.setCachorro(cachorro);
        cr.save(consulta);
        return "redirect:/sispet/consulta/{idcons}";
    }
    
    @RequestMapping(value = "/sispet/consulta/detalhes/{idc}", method = RequestMethod.GET)
    public ModelAndView detalhesConsulta(@PathVariable("idc") Long idc){
        Consulta consulta = cr.findById(idc);
        ModelAndView mv = new ModelAndView("sispet/consulta/detalhes/detalhes_consulta");
        mv.addObject("consulta", consulta);
        return mv;
    }
    
    @RequestMapping(value = "/alterarConsulta", method = RequestMethod.GET)
    public ModelAndView alterarConsulta(Long id){
        Consulta consulta = cr.findById(id);
        Cachorro cachorro = consulta.getCachorro();
        Veterinario veterinario = consulta.getVeterinario();
        ModelAndView mv = new ModelAndView("sispet/consulta/alteracao/alterar_consulta");
        mv.addObject("consulta", consulta);
        mv.addObject("cachorro", cachorro);
        mv.addObject("veterinario", veterinario);
        return mv;
    }
    
    @RequestMapping(value="/alterarConsulta", method = RequestMethod.POST)
    public String alterarConsultaPet(@RequestParam(value = "codcachorro", required = true) Long codcachorro, @RequestParam(value = "codveterinario", required = true) String codveterinario, @Valid Consulta consulta, BindingResult result, RedirectAttributes attributes){
        
        Cachorro cachorro = caor.findById(codcachorro);
        Veterinario veterinario = vr.findByCrmv(codveterinario);
        consulta.setCachorro(cachorro);
        consulta.setVeterinario(veterinario);
        cr.save(consulta);
        
        String crmvString = consulta.getVeterinario().getCrmv();
        return "redirect:/sispet/consulta/" + crmvString;
    }
    
    @RequestMapping("/deletarConsulta")
    public String deletarConsulta(Long id){
        Consulta consulta = cr.findById(id);
        cr.delete(consulta);
        
        Veterinario veterinario = consulta.getVeterinario();
        String crmvString = veterinario.getCrmv();
        return "redirect:/sispet/consulta/" + crmvString;
    }
    
    
//-------------------Abaixo Controler referente à Cachorro--------------------------    
    
    @RequestMapping(value = "/sispet/cachorro/{idcao}", method = RequestMethod.GET)
    public ModelAndView listaCachorros(@PathVariable("idcao") String idcao){
        Dono dono = dr.findByCpf(idcao);
        ModelAndView mv = new ModelAndView("sispet/cachorro/listaCachorros");
        Iterable<Cachorro> cachorros = caor.findByDono(dono);
        mv.addObject("cachorros", cachorros);
        return mv;
    }
    
    @RequestMapping(value="/sispet/cachorro/{idcao}", method = RequestMethod.POST)
    public String listaCachorrosPost(@PathVariable("idcao") String idcao ,@Valid Cachorro cachorro, BindingResult result, RedirectAttributes attributes){
        Dono dono = dr.findByCpf(idcao);
        cachorro.setDono(dono);
        caor.save(cachorro);
        return "redirect:/sispet/cachorro/{idcao}";
    }
    
    @RequestMapping(value = "/alterar_cachorro", method = RequestMethod.GET)
    public ModelAndView alterarCachorro(Long id){
        Cachorro cachorro = caor.findById(id);
        Dono dono = cachorro.getDono();
        ModelAndView mv = new ModelAndView("sispet/cachorro/alteracao/alterar_cachorro");
        mv.addObject("cachorro", cachorro);
        mv.addObject("dono", dono);
        return mv;
    }
    
    @RequestMapping(value="/alterar_cachorro", method = RequestMethod.POST)
    public String alterarCachorroPet(@RequestParam(value = "coddono", required = true) String coddono, @Valid Cachorro cachorro, BindingResult result, RedirectAttributes attributes){
        Dono dono = dr.findByCpf(coddono);
        cachorro.setDono(dono);
        caor.save(cachorro);
        
        String idString = cachorro.getDono().getCpf();
        return "redirect:/sispet/cachorro/" + idString;
    }
    
    @RequestMapping("/deletarCachorro")
    public String deletarCachorro(Long id){
        Cachorro cachorro = caor.findById(id);
        caor.delete(cachorro);
        
        Dono dono = cachorro.getDono();
        String idString = dono.getCpf();
        return "redirect:/sispet/cachorro/" + idString;
    }
    
    @RequestMapping(value = "/sispet/cachorro/detalhes/{id}", method = RequestMethod.GET)
    public ModelAndView detalhesCachorro(@PathVariable("id") Long id){
        Cachorro cachorro = caor.findById(id);
        Dono dono = cachorro.getDono();
        ModelAndView mv = new ModelAndView("sispet/cachorro/detalhes/detalhes_cachorro");
        mv.addObject("cachorro", cachorro);
        mv.addObject("dono", dono);
        return mv;
    }
    
}
