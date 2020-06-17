/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.vetor.labs;

import com.regisprojects.estruturadados.vetor.Lista;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Exer02 {
    
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");
        
        System.out.println(arrayList.lastIndexOf("A"));
        
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        
        System.out.println(lista.ultimoIndice("A"));
        
    }
    
}
