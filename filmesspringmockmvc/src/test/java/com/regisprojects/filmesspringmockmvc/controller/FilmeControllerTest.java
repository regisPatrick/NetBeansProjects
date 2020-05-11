/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.filmesspringmockmvc.controller;

import com.regisprojects.filmesspringmockmvc.model.Filme;
import com.regisprojects.filmesspringmockmvc.service.FilmeService;
import io.restassured.http.ContentType;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

/**
 *
 * @author user
 */
@WebMvcTest
public class FilmeControllerTest {

    @Autowired
    private FilmeController filmeController;
    
    @MockBean
    private FilmeService filmeService;
    
    @BeforeEach
    public void setup(){
        standaloneSetup(this.filmeController);
    }
    
    @Test
    public void deveRetornarSucesso_QuandoBuscarFilme(){
        
        when(this.filmeService.obterFilme(1L))
            .thenReturn(new Filme(1L, "O Poderoso Chefão", "Sem descrição"));
        
        given()
            .accept(ContentType.JSON)
        .when()
            .get("/filmes/{codigo}", 1L)
        .then()
            .statusCode(HttpStatus.OK.value());
    }
}
