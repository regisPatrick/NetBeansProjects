/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.enumeradores.aula55;

import com.regisprojects.enumeradores.DiaSemana;

/**
 *
 * @author user
 */
public class TesteEnum2 {

    public static void main(String[] args) {
        
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
        
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        
        System.out.println(dia);
        
    }
    
}
