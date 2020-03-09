/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.controllers;

import br.com.regisprojects.sispetshop.model.entity.ClinicaPetShop;
import br.com.regisprojects.sispetshop.model.entity.Produto;
import br.com.regisprojects.sispetshop.model.entity.Venda;
import br.com.regisprojects.sispetshop.repository.ClinicaPetRepository;
import br.com.regisprojects.sispetshop.repository.ProdutoRepository;
import br.com.regisprojects.sispetshop.repository.VendaRepository;
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
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository pr;
    
    @Autowired
    private ClinicaPetRepository cpr;
    
    @Autowired
    private VendaRepository ver;
    
    @RequestMapping(value="/sispet/produto/{idp}", method = RequestMethod.POST)
    public String listaProdutosPost(@PathVariable("idp") Long idp, @Valid Produto produto, BindingResult result, RedirectAttributes attributes){
        ClinicaPetShop clinicaPetShop = cpr.findById(idp);
        produto.setClinica(clinicaPetShop);
        pr.save(produto);
        return "redirect:/sispet/produto/{idp}";
    }
    
    @RequestMapping(value="/sispet/produto/{idp}", method = RequestMethod.GET)
    public ModelAndView listaProdutos(@PathVariable("idp") Long idp){
        ClinicaPetShop clinicaPetShop = cpr.findById(idp);
        ModelAndView mv = new ModelAndView("sispet/produto/lista_produtos");
        Iterable<Produto> produtos = pr.findByClinica(clinicaPetShop);
        mv.addObject("produtos", produtos);
        return mv;
    }
    
    @RequestMapping(value = "/sispet/produto/detalhes/{idp}", method = RequestMethod.GET)
    public ModelAndView detalhesProduto(@PathVariable("idp") Long idp){
        Produto produto = pr.findById(idp);
        ModelAndView mv = new ModelAndView("sispet/produto/detalhes/detalhes_produto");
        mv.addObject("produto", produto);
        return mv;
    }
    
    @RequestMapping(value = "/alterarProduto", method = RequestMethod.GET)
    public ModelAndView alterarProduto(Long id){
        Produto produto = pr.findById(id);
        ClinicaPetShop clinicaPetShop = produto.getClinica();
        ModelAndView mv = new ModelAndView("sispet/produto/alteracao/alterar_produto");
        mv.addObject("produto", produto);
        mv.addObject("clinicaPetShop", clinicaPetShop);
        return mv;
    }
    
    @RequestMapping(value="/alterarProduto", method = RequestMethod.POST)
    public String alterarProdutoPet(@RequestParam(value="clinicaPetShop", required = true) Long clinicaPetShopId, @Valid Produto produto, BindingResult result, RedirectAttributes attributes){
        ClinicaPetShop clinicaPetShop = cpr.findById(clinicaPetShopId);
        produto.setClinica(clinicaPetShop);
        pr.save(produto);
        
        Long idLong = produto.getClinica().getId();
        String idStr = "" + idLong;
        return "redirect:/sispet/produto/" + idStr;
    }
    
    @RequestMapping("/deletarProduto")
    public String deletarProduto(Long id){
        Produto produto = pr.findById(id);
        pr.delete(produto);
        
        ClinicaPetShop clinicaPetShop = produto.getClinica();
        Long idLong = clinicaPetShop.getId();
        String idStr = "" + idLong;
        return "redirect:/sispet/produto/" + idStr;
    }
            
}
