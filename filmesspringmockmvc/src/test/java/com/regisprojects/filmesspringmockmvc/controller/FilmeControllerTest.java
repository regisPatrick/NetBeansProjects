/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.filmesspringmockmvc.controller;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

/**
 *
 * @author user
 */
@WebMvcTest
public class FilmeControllerTest {

    @Autowired
    private FilmeController filmeController;
    
    @BeforeEach
    public void setup(){
        RestAssuredMockMvc.standaloneSetup(this.filmeController);
    }
    
    @Test
    public void deveRetornarSucesso_QuandoBuscarFilme(){
        RestAssuredMockMvc.given();
    }
}
