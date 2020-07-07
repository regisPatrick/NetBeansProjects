/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.appevento.appevento.repository;

import br.com.regisprojects.appevento.appevento.model.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface EventoRepository extends CrudRepository<Evento, String>{
    
    Evento findByCodigo(long codigo);
    
}
