/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author user
 */
public class CalculoPrecoComBrinde implements CalculoPreco{

    private CalculoPreco calculo;

    public CalculoPrecoComBrinde(CalculoPreco calculo) {
        this.calculo = calculo;
    }
    
    @Override
    public BigDecimal valorFinal(Produto produto) {
        
        BigDecimal valorFinal = calculo.valorFinal(produto);
        
        BigDecimal brinde = new BigDecimal("100.00");
        
        valorFinal = valorFinal.add(brinde);
        
        return valorFinal;
    }
    
    
    
}
