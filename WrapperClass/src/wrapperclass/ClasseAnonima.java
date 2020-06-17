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
public class ClasseAnonima {

    public void imprimeTexto(){
        System.out.println("qualquer texto");
    }
    
    public static void main(String[] args) {
        
        ClasseAnonima anonima = new ClasseAnonima(){
          public void imprimeTexto(){
              System.out.println("qualquer texto que foi sobreescrito");
          }  
        };
        
        anonima.imprimeTexto();
        
        //usando interface
        InterfaceAnonima ia = new InterfaceAnonima(){

            @Override
            public void imprimeTexto() {
                System.out.println("Qualquer texto - Interface");
            }
            
        };
        
        ia.imprimeTexto();
        
    }
    
}
