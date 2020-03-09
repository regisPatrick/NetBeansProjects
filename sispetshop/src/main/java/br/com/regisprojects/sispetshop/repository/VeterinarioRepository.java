/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.repository;

import br.com.regisprojects.sispetshop.model.entity.ClinicaPetShop;
import br.com.regisprojects.sispetshop.model.entity.Veterinario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface VeterinarioRepository extends CrudRepository<Veterinario, String>{
    
    Iterable<Veterinario> findByClinica(ClinicaPetShop clinicaPetShop);
    
    Veterinario findByCrmv(String crmv);
}
