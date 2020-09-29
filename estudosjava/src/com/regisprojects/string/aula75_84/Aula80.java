/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.string.aula75_84;

/**
 *
 * @author user
 */
public class Aula80 {

    public static void main(String[] args) {
        
        String teste = "Isso é um teste.";
        
        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));
        
        String ola = "olá";
        String mundo = " mundo!";
//        String olaMundo = ola + mundo;
        String olaMundo = ola.concat(mundo); // ola + mundo
        System.out.println(olaMundo);
        
        String espacos = "i s p a ç o";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);
        
        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);
        
        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());
        
    }
    
}
