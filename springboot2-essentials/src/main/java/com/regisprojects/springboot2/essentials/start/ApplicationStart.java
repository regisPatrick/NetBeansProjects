/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.springboot2.essentials.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author user
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.regisprojects.springboot2.essentials")
public class ApplicationStart {
    
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
    
}
