/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelViewController;

/**
 *
 * @author user
 */
public class Modelo {
    
    private int valor;
    
    public void somaNumeros(int numero1, int numero2){
        
        this.valor = numero1 + numero2;
        
    }
    
    public int getValor(){
        
        return valor;
        
    }
    
}
