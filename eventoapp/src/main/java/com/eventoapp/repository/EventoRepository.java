/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventoapp.repository;

import com.eventoapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface EventoRepository extends CrudRepository<Evento, String>{
    
    Evento findById(Integer id);
    
}
