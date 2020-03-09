/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.util.Date;

/**
 *
 * @author user
 */
public class Aula2Data {
    
    public static void main(String[] args) {
        
        Date hoje = new Date();
        
        System.out.println(hoje);
        
        System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());
        
        System.out.println(hoje.getDate());
        
    }
    
}
