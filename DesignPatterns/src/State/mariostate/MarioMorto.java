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
public class MarioMorto implements State {

	@Override
	public State pegarCogumelo() {

		return this;

	}

	@Override
	public State pegarEstrela() {

		return this;

	}

	@Override
	public State pegarFlorDeFogo() {

		return this;

	}

	@Override
	public State colidirComInimigo() {

		return this;

	}

	@Override
	public String retornarTipo() {

		return "Morto";

	}

}
