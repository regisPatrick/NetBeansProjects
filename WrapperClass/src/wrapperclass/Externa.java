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
public class Externa {
    
    public void metodoQualquer(){
        
        class ClasseLocal {
            
            private String texto = "texto classe local";
            
            public void imprimeTexto(){
                System.out.println(texto);
            }
            
        }
        ClasseLocal local = new ClasseLocal();
        
        local.imprimeTexto();
    }
    
    public static void main(String[] args) {
        
        Externa externa = new Externa();
        
        externa.metodoQualquer();
        
    }
    
}
