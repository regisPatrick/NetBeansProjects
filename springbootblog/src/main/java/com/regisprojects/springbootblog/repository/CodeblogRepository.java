/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springbootblog.repository;

import com.regisprojects.springbootblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface CodeblogRepository extends JpaRepository<Post, Long>{
    
}
