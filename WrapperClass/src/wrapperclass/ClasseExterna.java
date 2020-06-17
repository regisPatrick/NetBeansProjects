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
public class ClasseExterna {
    
    private String texto = "Texto externo";
    
    public class Interno {
        
        private String texto = "Texto interno";
        
        public void imprimeTexto(){
            System.out.println(texto);
            
            //Consegue ver menbros da classe externa
            System.out.println(ClasseExterna.this.texto);
        }
    }
    
    public static void main(String[] args) {
        
        ClasseExterna externa = new ClasseExterna();
        Interno interna = externa.new Interno();
        
        interna.imprimeTexto();
        
    }
}
