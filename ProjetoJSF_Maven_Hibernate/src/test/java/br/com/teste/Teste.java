/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste;

import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class Teste {
    
    public static void main(String[] args) {
         Persistence.createEntityManagerFactory("meuPU");
    }
    
}
