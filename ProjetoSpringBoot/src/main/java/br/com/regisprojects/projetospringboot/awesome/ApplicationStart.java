/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.projetospringboot.awesome;

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
//@ComponentScan/*(basePackages = "br.com.regisprojects.projetospringboot.awesome.endpoint")*/ //Como eu coloquei essa classe no pacote raiz eu não preciso mais definir o basePackages
//@Configuration
@SpringBootApplication //Mesma coisa que usar as três anotações acima
public class ApplicationStart {

    public static void main(String[] args) {
        
        SpringApplication.run(ApplicationStart.class, args);
        
    }
    
}
