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
public interface VendaFactory {
	
	public NFE criarNFE();
	
	public Boleto criarBoleto();

}