/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.sispetshop.repository;

import br.com.regisprojects.sispetshop.model.entity.Cachorro;
import br.com.regisprojects.sispetshop.model.entity.Consulta;
import br.com.regisprojects.sispetshop.model.entity.Veterinario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface ConsultaRepository extends CrudRepository<Consulta, String>{
    
    Consulta findById(Long Id);
    
    Iterable<Consulta> findByVeterinario(Veterinario veterinario);
    
    Iterable<Consulta> findByCachorro(Cachorro cachorro);
}
