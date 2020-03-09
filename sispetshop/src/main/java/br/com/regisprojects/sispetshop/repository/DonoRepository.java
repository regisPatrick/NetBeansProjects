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
public interface DonoRepository extends CrudRepository<Dono, String>{
    
    Dono findByCpf(String cpf);
    
    Iterable<Dono> findByCachorros(Cachorro cachorro);
    
}
