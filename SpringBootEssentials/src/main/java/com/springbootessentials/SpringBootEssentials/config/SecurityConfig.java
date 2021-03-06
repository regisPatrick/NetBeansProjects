/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.config;

import static com.springbootessentials.SpringBootEssentials.config.SecurityConstants.*;
import com.springbootessentials.SpringBootEssentials.service.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;

/**
 *
 * @author user
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
      
    @Autowired
    private CustomUserDetailService customUserDetailService;
    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        //super.configure(http);
//        http.authorizeRequests()
//                .antMatchers("/*/protected/**").hasRole("USER")
//                .antMatchers("/*/admin/**").hasRole("ADMIN")
//                .and()
//                .httpBasic()
//                .and()
//                .csrf().disable();
//    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues())
                .and().csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, SIGN_UP_URL).permitAll()
                .antMatchers("/*/protected/**").hasRole("USER")
                .antMatchers("/*/admin/**").hasRole("ADMIN")
                .and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager()))
                .addFilter(new JWTAuthorizationFilter(authenticationManager(), customUserDetailService));
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{ 
        //super.configure(auth);
        auth.userDetailsService(customUserDetailService).passwordEncoder(new BCryptPasswordEncoder());
    }
    
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("regis").password("{noop}123").roles("USER")
//                .and()
//                .withUser("admin").password("{noop}123").roles("USER", "ADMIN");
//    }
    
}
