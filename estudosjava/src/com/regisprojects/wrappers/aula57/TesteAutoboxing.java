/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.wrappers.aula57;

/**
 *
 * @author user
 */
public class TesteAutoboxing {
    
    public static void main(String[] args) {
        
        // autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100; // new Integer(100);
        Long num10 = 100l; // new Long(10000l);
        Float num11 = 2.5f; // new Float(3.5f);
        Double num12 = 2.5555; // new Double(3.5555);
        Boolean flag2 = true; // new Boolean(true);
        Character b_ = 'b'; // new Character('b');
        
        // unboxing
        int num13 = num9; // num9.intValue();
        
        // autoboxing em expressões
        num9++;
        
        System.out.println(num9);
        
        // auto unboxing num9 -> autoboxing num13/ num9 para o num14
        Integer num14 = num13 / num9;
        
        // mau uso
        Double a, b, c;
        a = 10.0;
        b = 12.2;
        c = 4.7;
        
        Double media = (a+ b+ c) / 3;
        System.out.println(media);
    }
    
}
