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
public class Subtrair implements StrategyMath{

    @Override
    public int operacao(int numero1, int numero2) {
        
        return numero1 - numero2;
        
    }
    
}
