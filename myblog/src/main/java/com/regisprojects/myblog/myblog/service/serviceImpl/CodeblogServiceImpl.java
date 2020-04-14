/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.myblog.myblog.service.serviceImpl;

import com.regisprojects.myblog.myblog.model.Post;
import com.regisprojects.myblog.myblog.repository.CodeblogRepository;
import com.regisprojects.myblog.myblog.service.CodeblogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class CodeblogServiceImpl implements CodeblogService{

    @Autowired
    private CodeblogRepository codeblogRepository;
    
    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
    
}
