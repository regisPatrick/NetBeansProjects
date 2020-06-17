/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.math.BigDecimal;

/**
 *
 * @author user
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Produto produto = new Produto();
		
		produto.setNome("Smartphone Moto X 2ª geração");
		produto.setQuantidade(1);
		produto.setValorUnitario(new BigDecimal(1000));
		
		VendaFactory factory = new LojaCentroDaInformatica();
		
		Venda venda = new Venda(factory);
		
		venda.realizarVenda(produto);
        
    }
    
}
