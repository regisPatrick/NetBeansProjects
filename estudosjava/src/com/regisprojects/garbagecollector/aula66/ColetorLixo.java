/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.garbagecollector.aula66;

import com.regisprojects.passagemparametrovalorreferencia.aula61.Contato;

/**
 *
 * @author user
 */
public class ColetorLixo {
    
    public static void obterMemoriaUsada(){
        
        final int MB = 1024 * 1024;
        
        Runtime runtime = Runtime.getRuntime(); // Singleton
        
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }
    
    public static void main(String[] args) {
        
        Contato[] contatos = new Contato[10000];
        Contato contato;
        
        for (int i=0; i<contatos.length; i++){
            contato = new Contato("Contato"+i, "1234-5678"+i, "contato"+i+"@email.com");
            contatos[i] = contato;
        }
        
        System.out.println("Contatos criados");
        
        obterMemoriaUsada();
        
        contatos = null;
        
        Runtime.getRuntime().runFinalization();
        
        Runtime.getRuntime().gc();
        
        System.out.println("Contatos remmovidos da memória");
        
        obterMemoriaUsada();
    }
    
}
