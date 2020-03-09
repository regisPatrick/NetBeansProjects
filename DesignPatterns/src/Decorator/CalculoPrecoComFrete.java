/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.math.BigDecimal;

/**
 *
 * @author user
 */
public class CalculoPrecoComFrete implements CalculoPreco{

    private CalculoPreco calculo;

    public CalculoPrecoComFrete(CalculoPreco calculo) {
        this.calculo = calculo;
    }
    
    @Override
    public BigDecimal valorFinal(Produto produto) {
        
        BigDecimal valorFinal = calculo.valorFinal(produto);
        
        BigDecimal frete;
        
        if (produto.getQuantidade() > 3){
            
            frete = new BigDecimal("11.00");
            valorFinal = valorFinal.add(frete);
            
            return valorFinal;
            
        } else {
            
            frete = new BigDecimal("17.00");
            valorFinal = valorFinal.add(frete);
            
            return valorFinal;
            
        }
        
    }
    
    
    
}
