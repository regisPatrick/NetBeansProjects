/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventoapp.repository;

import com.eventoapp.models.Convidado;
import com.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
    
    Iterable<Convidado> findByEvento(Evento evento);
    
    Convidado findByRg(String rg);
    
}
