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
public class Principal {
 
    public static void main(String[] args) {
        
        Produto produto = new Produto();
        
        produto.setNome("CD Legião Urbana");
        produto.setQuantidade(1);
        produto.setValorUnitario(new BigDecimal("40.00"));
        
        CalculoPreco calculo = new CalculoPrecoComBrinde(new CalculoPrecoComFrete(new CalculoPrecoComum()));
        
        BigDecimal preco = calculo.valorFinal(produto);
        
        System.out.println("R$ " + preco.doubleValue());
        
    }
    
}
