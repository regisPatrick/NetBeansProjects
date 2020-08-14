/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.staticimport.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;
/**
 *
 * @author user
 */
public class StaticImport {
    
    public static void main(String[] args) {
        
        double a = 2;
        double b = 3;
        double c = 4;
        
        System.out.println(Math.pow(a, b));
        
        System.out.println(Math.sqrt(c));
        
        System.out.println(pow(a, b));
        
        System.out.println(sqrt(c));
    }
    
}
