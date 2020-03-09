/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author user
 */
public interface State {

	public State pegarCogumelo();

	public State pegarEstrela();
	
	public State pegarFlorDeFogo();

	public State colidirComInimigo();

	public String retornarTipo();

}
