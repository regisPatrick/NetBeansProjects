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
public class Aula75 {
    
    public static void main(String[] args) {
        
        String vazia = new String(); // ""
        System.out.println(vazia);
        
        String java = new String("JAVA");
        System.out.println(java);
        
        String java1 = new String(java);
        System.out.println(java1);
        
        char[] charsJava = {'J', 'A', 'V', 'A'};
        String java2 = new String(charsJava);
        System.out.println(charsJava);
        
        char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abc = new String(abcdef, 0, 3);
        System.out.println(abc);
        
        byte[] ascii = {65, 66, 67, 68, 69};
        String abcde = new String(ascii);
        System.out.println(abcde);
    }
    
}
