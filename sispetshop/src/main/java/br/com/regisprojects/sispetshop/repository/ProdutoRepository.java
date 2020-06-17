/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.repository;

import br.com.regisprojects.sispetshop.model.entity.ClinicaPetShop;
import br.com.regisprojects.sispetshop.model.entity.Produto;
import br.com.regisprojects.sispetshop.model.entity.Venda;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface ProdutoRepository extends CrudRepository<Produto, String>{
    
    Iterable<Produto> findByClinica(ClinicaPetShop clinicaPetShop);
    
    Iterable<Produto> findByVenda(Venda venda);
    
    Produto findById(Long id);
    
}
