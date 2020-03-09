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
public class MarioInvencivel implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Seu estado ainda é invencível");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou uma estrela: Mario está invencível");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma flor: Mario atira fogo e ainda está invencível");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com um inimigo: O inimigo morreu");
		return this;
	}

	@Override
	public String retornarTipo() {

		return "Mario invencível";

	}

}
