/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.repository;

import br.com.regisprojects.sispetshop.model.entity.Cachorro;
import br.com.regisprojects.sispetshop.model.entity.Dono;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface CachorroRepository extends CrudRepository<Cachorro, String>{
    
    Cachorro findById(Long id);
    
    Iterable<Cachorro> findByDono(Dono dono);
    
}
