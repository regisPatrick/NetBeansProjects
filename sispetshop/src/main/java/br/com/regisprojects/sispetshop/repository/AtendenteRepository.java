/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.repository;

import br.com.regisprojects.sispetshop.model.entity.Atendente;
import br.com.regisprojects.sispetshop.model.entity.ClinicaPetShop;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface AtendenteRepository extends CrudRepository<Atendente, String>{
    
    Iterable<Atendente> findByClinica(ClinicaPetShop clinicaPetShop);
    
    Atendente findById(Long id);
    
}
