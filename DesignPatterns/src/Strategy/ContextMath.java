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
public class ContextMath {

    private StrategyMath strategy;

    public ContextMath(StrategyMath strategy) {
        this.strategy = strategy;
    }
    
    public int calcular(int numero1, int numero2){
        
        return strategy.operacao(numero1, numero2);
        
    }
    
}
