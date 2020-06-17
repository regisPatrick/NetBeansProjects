/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author user
 */
public class Principal {

    public static void main(String[] args) {
        
        ContextMath math = new ContextMath(new Somar());
        
        System.out.println(math.calcular(5, 3));
        
        math = new ContextMath(new Subtrair());
        
        System.out.println(math.calcular(5, 3));
        
    }
    
}
