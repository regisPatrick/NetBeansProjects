/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author user
 */
public class BoletoBancoBrasil implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("BANCO DO BRASIL");
		System.out.println("==========================================================================");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: R$ " + produto.getValorUnitario());
		System.out.println("Imposto: R$ " + imposto);
		System.out.println("Valor total: R$ " + produto.getValorTotal(imposto));
	}

}