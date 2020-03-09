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
public class NFESaoPaulo implements NFE {

	@Override
	public double calcularImposto(Produto produto) {

		BigDecimal imposto = new BigDecimal("0.18");
		
		imposto = imposto.multiply(produto.getValorUnitario());
		
		return imposto.doubleValue();
	
	}

}
