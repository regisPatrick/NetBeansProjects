/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class DummyData {
    
    @Autowired
    CodeBlogRepository codeBlogRepository;
    
//    @PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Regis Patrick");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun");
        
        Post post2 = new Post();
        post2.setAutor("Regis Patrick");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun Loren Ipsun");
        
        postList.add(post1);
        postList.add(post2);
        
        for (Post post: postList){
            Post postSaved = codeBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}