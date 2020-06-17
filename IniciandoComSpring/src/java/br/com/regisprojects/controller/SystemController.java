/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.controller;

import br.com.regisprojects.model.dao.CadastroDAO;
import br.com.regisprojects.model.dominio.Cadastro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author user
 */

@Controller 
public class SystemController {
    
/*    @RequestMapping("/index")
    public String iniciando(Model model, @RequestParam("nome") String nome){
        
        model.addAttribute("nome", nome);
        
        return "index";
    }*/
    
    @RequestMapping("/index")
    public String iniciando(Model model, Cadastro cadastro){
        
        CadastroDAO dao = new CadastroDAO();
        
        dao.save(cadastro);
        
        model.addAttribute("nome", cadastro.getNome());
        
        return "index";
    }
    
    
    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
    
    @RequestMapping("/altera")
    public String altera(){
        return "altera";
    }
    
    @RequestMapping("/tela_alteracao")
    public String alteraRegistro(Model model, Cadastro cadastro){
        
        CadastroDAO dao = new CadastroDAO();
        
        dao.save(cadastro);
        
        model.addAttribute("nome", cadastro.getNome());
        
        return "resposta_altera";
    }
    
    @RequestMapping("/consulta_todos")
    public String consultaTodos(){
        return "consulta_todos";
    }
    
    @RequestMapping("/lista")
    public String lista(Model model){
        CadastroDAO dao = new CadastroDAO();
        
        model.addAttribute("lista", dao.findAll());
        
        return "exibir";
    }
    
    
    @RequestMapping("/exclusao")
    public String exclusao(){
        return "exclusao";
    }
    
    
    @RequestMapping("/excluir")
    public String excluir(Model model, Cadastro cadastro){
        
        CadastroDAO dao = new CadastroDAO();
        
        model.addAttribute("id", cadastro.getId());
        
        
        dao.remove(Cadastro.class, cadastro.getId());
        
        return "resposta_exclusao";
    }
    
    @RequestMapping("/consulta_por_id")
    public String consultaId(){
        return "consulta_por_id";
    }
    
    @RequestMapping("/consulta_id")
    public String consultaPorId(Model model, Cadastro cadastro){
        
        CadastroDAO dao = new CadastroDAO();
        
        model.addAttribute("cadastro", dao.findById(Cadastro.class, cadastro.getId()));
        
        return"resposta_consulta_id";
    }
    
    @RequestMapping("/tela_principal")
    public String telaPrincipal(){
        return "tela_principal";
    }
    
    @RequestMapping("/inclusao")
    public String redirecionaInsercao(){
        return"cadastro";
    }
    
    @RequestMapping("/altera_cad")
    public String redirecionaAlteracao(){
        return"altera";
    }
    
    @RequestMapping("/apagar")
    public String redirecionaExclusao(){
        return"exclusao";
    }
    
    @RequestMapping("/cons_por_id")
    public String redirecionaConsultaPorId(){
        return"consulta_por_id";
    }
    
    @RequestMapping("/cons_todos")
    public String redirecionaConsultaTodos(){
        return"consulta_todos";
    }
    
    @RequestMapping("/retorna_tela_principal")
    public String retornaTelaPrincipal(){
        return"tela_principal";
    }
    
}
