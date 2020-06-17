/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.service;

import com.springbootessentials.SpringBootEssentials.model.UserConsumer;
import com.springbootessentials.SpringBootEssentials.repository.UserConsumerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class CustomUserDetailService implements UserDetailsService{

    private final UserConsumerRepository userConsumerRepository;

    @Autowired
    public CustomUserDetailService(UserConsumerRepository userConsumerRepository) {
        this.userConsumerRepository = userConsumerRepository;
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserConsumer userConsumer = Optional.ofNullable(userConsumerRepository.findByUserName(username))
                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
        List<GrantedAuthority> authorityListAdmin = AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN");
        List<GrantedAuthority> authorityListUser = AuthorityUtils.createAuthorityList("ROLE_USER");
        return new org.springframework.security.core.userdetails.User
            (userConsumer.getUserName(), userConsumer.getPassword(), 
                    userConsumer.isAdministrator() ? authorityListAdmin : authorityListUser);
    }
    
}
