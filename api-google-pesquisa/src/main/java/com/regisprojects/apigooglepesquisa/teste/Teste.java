/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.apigooglepesquisa.teste;

import com.regisprojects.apigooglepesquisa.service.PesquisaService;

/**
 *
 * @author user
 */
public class Teste {
    
    public static void main(String[] args) {
        PesquisaService ps = new PesquisaService();
        ps.getConnection("maringa");
    }
    
}
