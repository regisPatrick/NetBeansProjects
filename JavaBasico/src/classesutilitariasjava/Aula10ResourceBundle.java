/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author user
 */
public class Aula10ResourceBundle {
    
    public static void main(String[] args) {
        
        System.out.println("Locale atual " + Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
        
        System.out.println("Olá pt_BR: " + rb.getString("hello"));
        System.out.println("Mundo pt_BR: " + rb.getString("world"));
        
        //Locale.setDefault(new Locale("en_US", "en_US"));
        rb = ResourceBundle.getBundle("meu-texto", new Locale("en_US", "en_US"));
        
        System.out.println("Hello en_US: " + rb.getString("hello"));
        System.out.println("World en_US: " + rb.getString("world"));
    }
    
}
