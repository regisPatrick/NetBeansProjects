/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

/**
 *
 * @author user
 */
public class TesteAutoboxing {
   
    public static void main(String[] args) {
        
        //autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 10000L;
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        Character b = 'b';
        
        //auto un-boxing
        int num13 = num9; //num9.intValue();
        
        //autoboxing em expressões
        num9 ++;
        
        System.out.println(num9);
        
        //auto unboxing num9 -> autoboxing num13/num9 -> num14
        Integer num14 = num13/num9;
    }
    
}
