/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisProjects.exemploSpringSecurity.repository;

import br.com.regisProjects.exemploSpringSecurity.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface UsuarioRepository extends CrudRepository<Usuario, String>{
    
    Usuario findByLogin(String login);
    
}
