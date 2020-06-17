/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.myblog.myblog.service;

import com.regisprojects.myblog.myblog.model.Post;
import java.util.List;

/**
 *
 * @author user
 */
public interface CodeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
    
}
