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
public interface CalculoPreco {
    
    public BigDecimal valorFinal(Produto produto);
    
}
