/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.vetor.teste;

import com.regisprojects.estruturadados.vetor.Lista;
import com.regisprojects.estruturadados.vetor.VetorObjetos;

/**
 *
 * @author user
 */
public class Aula11 {
    
    public static void main(String[] args) {
        
//        VetorObjetos vetor = new VetorObjetos(2);
//        
//        vetor.adiciona(1);
//        vetor.adiciona("Elemento do tipo string");
//        
//        System.out.println(vetor);
        
        Lista<Contato> vetor = new Lista<Contato>(1);
        
        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        
        vetor.adiciona(c1);
        
        System.out.println(vetor);
        
    }
    
}
