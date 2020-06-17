/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.repository;

import br.com.regisprojects.cursospringbootessentials.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author user
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
    
    User findByUsername(String username);
    
}
