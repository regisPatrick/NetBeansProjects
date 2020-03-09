/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State.mariostate;

import State.State;

/**
 *
 * @author user
 */
public class Mario implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Tornou-se Super Mario");
		return new SuperMario();
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou uma estrela: Mario está invencível");
		return new MarioInvencivel();
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma flor: Mario atira fogo");
		return new FireMario();
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com um inimigo: Mario morre");
		return new MarioMorto();
	}

	@Override
	public String retornarTipo() {

		return "Mario Comum";

	}

}
