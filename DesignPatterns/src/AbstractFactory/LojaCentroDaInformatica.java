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
public class LojaCentroDaInformatica implements VendaFactory{

	@Override
	public NFE criarNFE() {
		
		NFE notaFiscal = new NFESaoPaulo();
		
		return notaFiscal;
	}

	@Override
	public Boleto criarBoleto() {
		
		Boleto boleto = new BoletoBancoBrasil();		
		
		return boleto;
	}

}