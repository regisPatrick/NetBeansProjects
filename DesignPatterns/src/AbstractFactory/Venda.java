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
public class Venda {

	private NFE notaFiscal;
	private Boleto boleto;

	public Venda(VendaFactory factory) {

		this.notaFiscal = factory.criarNFE();

		this.boleto = factory.criarBoleto();

	}

	public void realizarVenda(Produto produto) {

		double imposto = notaFiscal.calcularImposto(produto);

		boleto.emitir(produto, imposto);

	}

}
