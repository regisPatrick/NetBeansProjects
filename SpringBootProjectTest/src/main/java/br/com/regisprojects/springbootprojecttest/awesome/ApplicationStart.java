/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.springbootprojecttest.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */
//@EnableAutoConfiguration
//@ComponentScan// (basePackages = "br.com.regisprojects.springbootprojecttest.awesome.endpoint")
//@Configuration
@SpringBootApplication // @Configuration @EnableAutoConfiguration @ComponentScan
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
