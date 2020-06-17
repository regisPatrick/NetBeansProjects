/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.repository;

import br.com.regisprojects.sispetshop.model.entity.Atendente;
import br.com.regisprojects.sispetshop.model.entity.Dono;
import br.com.regisprojects.sispetshop.model.entity.Produto;
import br.com.regisprojects.sispetshop.model.entity.Venda;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface VendaRepository extends CrudRepository<Venda, String>{
 
    Iterable<Venda> findByAtendente(Atendente atendente);
    
    Iterable<Venda> findByProdutos(Produto produto);
    
    Iterable<Venda> findByDono(Dono dono);
    
    Venda findById(Long id);
    
}
