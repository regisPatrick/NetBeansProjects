/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventoWebService.repository;

import com.eventoWebService.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author user
 */
public interface EventoRepository extends JpaRepository<Evento, String>{
    
    Evento findByCodigo(long codigo);
    
}
