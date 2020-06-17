/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.controllers;

import br.com.regisprojects.sispetshop.model.entity.Atendente;
import br.com.regisprojects.sispetshop.model.entity.ClinicaPetShop;
import br.com.regisprojects.sispetshop.model.entity.Dono;
import br.com.regisprojects.sispetshop.model.entity.Produto;
import br.com.regisprojects.sispetshop.model.entity.Venda;
import br.com.regisprojects.sispetshop.repository.AtendenteRepository;
import br.com.regisprojects.sispetshop.repository.ClinicaPetRepository;
import br.com.regisprojects.sispetshop.repository.DonoRepository;
import br.com.regisprojects.sispetshop.repository.ProdutoRepository;
import br.com.regisprojects.sispetshop.repository.VendaRepository;
import java.util.ArrayList;
import java.util.List;
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
public class AtendenteController {
    
    @Autowired
    private AtendenteRepository ar;
    
    @Autowired
    private ClinicaPetRepository cpr;
    
    @Autowired
    private VendaRepository ver;
    
    @Autowired
    private ProdutoRepository pr;
    
    @Autowired
    private DonoRepository dr;
    
    @RequestMapping(value="/sispet/atendente/{idlista}", method = RequestMethod.POST)
    public String listaAtendentesPost(@PathVariable("idlista") Long idlista, @Valid Atendente atendente, BindingResult result, RedirectAttributes attributes){
        ClinicaPetShop clinicaPetShop = cpr.findById(idlista);
        atendente.setClinica(clinicaPetShop);
        ar.save(atendente);
        return "redirect:/sispet/atendente/{idlista}";
    }
    
    @RequestMapping(value="/sispet/atendente/{idlista}", method = RequestMethod.GET)
    public ModelAndView listaAtendentes(@PathVariable("idlista") Long idlista){
        ClinicaPetShop clinicaPetShop = cpr.findById(idlista);
        ModelAndView mv = new ModelAndView("sispet/atendente/listaAtendentes");
        Iterable<Atendente> atendentes = ar.findByClinica(clinicaPetShop);
        mv.addObject("atendentes", atendentes);
        return mv;
    }
    
    @RequestMapping(value = "/sispet/atendente/detalhes/{ida}", method = RequestMethod.GET)
    public ModelAndView detalhesAtendente(@PathVariable("ida") Long ida){
        Atendente atendente = ar.findById(ida);
        ModelAndView mv = new ModelAndView("sispet/atendente/detalhes/detalhes_atendente");
        mv.addObject("atendente", atendente);
        return mv;
    }
    
    @RequestMapping("/deletarAtendente")
    public String deletarAtendente(Long id){
        Atendente atendente = ar.findById(id);
        ar.delete(atendente);
        
        ClinicaPetShop clinicaPetShop = atendente.getClinica();
        Long idLong = clinicaPetShop.getId();
        String idStr = "" + idLong;
        return "redirect:/sispet/atendente/" + idStr;
    }
    
    @RequestMapping(value = "/alterarAtendente", method = RequestMethod.GET)
    public ModelAndView alterarAtendente(Long id){
        Atendente atendente = ar.findById(id);
        ClinicaPetShop clinicaPetShop = atendente.getClinica();
        ModelAndView mv = new ModelAndView("sispet/atendente/alteracao/alterar_atendente");
        mv.addObject("atendente", atendente);
        mv.addObject("clinicaPetShop", clinicaPetShop);
        return mv;
    }
    
    @RequestMapping(value="/alterarAtendente", method = RequestMethod.POST)
    public String alterarAtendentePet(@RequestParam(value = "clinicaPetShop", required = true) Long clinicaPetShopId, @Valid Atendente atendente, BindingResult result, RedirectAttributes attributes){
        
        ClinicaPetShop clinicaPetShop = cpr.findById(clinicaPetShopId);
        atendente.setClinica(clinicaPetShop);
        ar.save(atendente);
        
        Long idLong = atendente.getClinica().getId();
        String idStr = "" + idLong;
        return "redirect:/sispet/atendente/" + idStr;
    }
    
    //------------------------------Controller de Venda----------------------------------------
    
    @RequestMapping(value="/sispet/venda/{idvenda}", method = RequestMethod.GET)
    public ModelAndView listaVendas(@PathVariable("idvenda") Long idvenda){
        Atendente atendente = ar.findById(idvenda);
        ModelAndView mv = new ModelAndView("sispet/venda/lista_vendas");
        Iterable<Venda> vendas = ver.findByAtendente(atendente);
        mv.addObject("vendas", vendas);
        return mv;
    }
    
    @RequestMapping(value="/sispet/venda/{idvenda}", method = RequestMethod.POST)
    public String listaVendasPost(@PathVariable("idvenda") Long idvenda, @RequestParam(value = "coddono", required = true) String coddono, @Valid Venda venda, BindingResult result, RedirectAttributes attributes){
        Atendente atendente = ar.findById(idvenda);
        venda.setAtendente(atendente);
        Dono dono = dr.findByCpf(coddono);
        venda.setDono(dono);
        ver.save(venda);
        return "redirect:/sispet/venda/{idvenda}";
    }
    
    @RequestMapping(value="/sispet/venda/lista_pro_vendido/{idven}", method = RequestMethod.GET)
    public ModelAndView listaProdVendidos(@PathVariable("idven") Long idven){
        Venda venda = ver.findById(idven);
        ModelAndView mv = new ModelAndView("sispet/venda/lista_pro_vendido/lista_produtos_vendidos");
        Iterable<Produto> produtos = pr.findByVenda(venda);
        mv.addObject("produtos", produtos);
        return mv;
    }
    
    @RequestMapping(value="/sispet/venda/lista_pro_vendido/{idven}", method = RequestMethod.POST)
    public String listaProdVendidosPost(@PathVariable("idven") Long idven, @RequestParam(value = "codpro", required = true) Long codpro,@Valid Produto produto, BindingResult result, RedirectAttributes attributes){
        Venda venda = ver.findById(idven);
        produto = pr.findById(codpro);
        produto.setVenda(venda);
        pr.save(produto);
        return "redirect:/sispet/venda/lista_pro_vendido/{idven}";
    }
    
    @RequestMapping(value = "/alterarVenda", method = RequestMethod.GET)
    public ModelAndView alterarVenda(Long id){
        Venda venda = ver.findById(id);
        Atendente atendente = venda.getAtendente();
        Dono dono = venda.getDono();
        ModelAndView mv = new ModelAndView("sispet/venda/alteracao/alterar_venda");
        mv.addObject("venda", venda);
        mv.addObject("atendente", atendente);
        mv.addObject("dono", dono);
        return mv;
    }
    
    @RequestMapping(value="/alterarVenda", method = RequestMethod.POST)
    public String alterarVendaPet(@RequestParam(value = "atendenteid", required = true) Long atendenteid, @RequestParam(value = "donoid", required = true) String donoid, @Valid Venda venda, BindingResult result, RedirectAttributes attributes){
        
        Atendente atendente = ar.findById(atendenteid);
        venda.setAtendente(atendente);
        Dono dono = dr.findByCpf(donoid);
        venda.setDono(dono);
        ver.save(venda);
        
        Long idLong = venda.getAtendente().getId();
        String idStr = "" + idLong;
        return "redirect:/sispet/venda/" + idStr;
    }
    
    @RequestMapping(value = "/sispet/venda/detalhes/{idv}", method = RequestMethod.GET)
    public ModelAndView detalhesVenda(@PathVariable("idv") Long idv){
        Venda venda = ver.findById(idv);
        Atendente atendente = venda.getAtendente();
        Dono dono = venda.getDono();
        ModelAndView mv = new ModelAndView("sispet/venda/detalhes/detalhes_venda");
        mv.addObject("venda", venda);
        mv.addObject("atendente", atendente);
        mv.addObject("dono", dono);
        return mv;
    }
    
    @RequestMapping("/deletarVenda")
    public String deletarVenda(Long id){
        Venda venda = ver.findById(id);
        ver.delete(venda);
        
        Atendente atendente = venda.getAtendente();
        Long idLong = atendente.getId();
        String idStr = "" + idLong;
        return "redirect:/sispet/venda/" + idStr;
    }
 
}