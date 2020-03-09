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
public class CalculoPrecoComum implements CalculoPreco{

    @Override
    public BigDecimal valorFinal(Produto produto) {
        
        BigDecimal imposto = new BigDecimal("0.10");
        BigDecimal valorFinal = produto.getValorUnitario().add(produto.getValorUnitario().multiply(imposto));
        
        return valorFinal;
        
    }
    
}
