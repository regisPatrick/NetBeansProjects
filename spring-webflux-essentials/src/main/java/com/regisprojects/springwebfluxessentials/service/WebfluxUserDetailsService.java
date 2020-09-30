/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.service;

import com.regisprojects.springwebfluxessentials.repository.WebfluxUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 *
 * @author user
 */
@RequiredArgsConstructor
@Service
public class WebfluxUserDetailsService implements ReactiveUserDetailsService{
    
    private final WebfluxUserRepository webfluxUserRepository;
    
    @Override
    public Mono<UserDetails> findByUsername(String username) {
        
        return webfluxUserRepository.findByUsername(username)
                .cast(UserDetails.class);
        
    }
    
}
