/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springwebfluxessentials.config;

import com.regisprojects.springwebfluxessentials.service.WebfluxUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 *
 * @author user
 */
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class SecurityConfig {
 
    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http){
        //@formatter:off
        return http
                .csrf().disable()
                .authorizeExchange()
                    .pathMatchers(HttpMethod.POST, "/animes/**").hasRole("ADMIN")
                    .pathMatchers(HttpMethod.PUT, "/animes/**").hasRole("ADMIN")
                    .pathMatchers(HttpMethod.DELETE, "/animes/**").hasRole("ADMIN")
                    .pathMatchers(HttpMethod.GET, "/animes/**").hasRole("USER")
                    .pathMatchers("/webjars/**", "/v3/api-docs/**", "/swagger-ui.html").permitAll()
                .anyExchange().authenticated()
                .and()
                    .formLogin()
                .and()
                    .httpBasic()
                .and()
                    .build();
        //@formatter:on
    }
    
//    @Bean
//    public MapReactiveUserDetailsService userDetailsService(){
//        
//        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//        
//        UserDetails user = User.withUsername("user")
//            .password(passwordEncoder.encode("regis"))
//            .roles("USER")
//            .build();
//        
//        UserDetails admin = User.withUsername("admin")
//            .password(passwordEncoder.encode("regis"))
//            .roles("USER", "ADMIN")
//            .build();
//        
//        return new MapReactiveUserDetailsService(user, admin);
//    }
    
    @Bean
    ReactiveAuthenticationManager authenticationManager(WebfluxUserDetailsService webfluxUserDetailsService){
        return new UserDetailsRepositoryReactiveAuthenticationManager(webfluxUserDetailsService);
    }
    
}
