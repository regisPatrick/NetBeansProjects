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
public class C implements A, B{

    public static void main(String[] args) {
        
        new C().oi();
        
    }
    
    public void oi(){
        B.super.oi();
    }
    
}
