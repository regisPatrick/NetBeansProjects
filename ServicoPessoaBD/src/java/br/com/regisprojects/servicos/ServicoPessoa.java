/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.servicos;

import br.com.regisprojects.dao.PessoaDAO;
import br.com.regisprojects.modelo.Pessoa;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author user
 */
@WebService
public class ServicoPessoa {
    
    @EJB
    private PessoaDAO dao;
    
    public ServicoPessoa(){
        
    }
    
    @WebMethod
    public List<Pessoa> listaPessoas(){
        return dao.getLista();
    }
    
    @WebMethod
    public Pessoa inserir(@WebParam(name = "pessoa") @XmlElement(required = true) Pessoa obj){
        return dao.inserir(obj);
    }
    
    @WebMethod
    public Pessoa alterar(@WebParam(name = "pessoa") @XmlElement(required = true) Pessoa obj){
        return dao.alterar(obj);
    }
    
    @WebMethod
    public boolean remover(@WebParam(name = "id") @XmlElement(required = true) Integer id){
        return dao.remover(id);
    }
    
}
