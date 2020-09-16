/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesdefault;

/**
 *
 * @author user
 */
public interface A {
    
    default void oi(){
        System.out.println("Dentro do oi de A");
    }
    
}
