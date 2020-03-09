/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import State.mariostate.Mario;
import State.mariostate.MarioInvencivel;
import State.mariostate.SuperMario;

/**
 *
 * @author user
 */
public class Principal {

	public static void main(String[] args) {

		State mario = new MarioInvencivel();

		mario = mario.pegarCogumelo();
		mario = mario.pegarFlorDeFogo();
		mario = mario.pegarCogumelo();
		
		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();

		System.out.println();
		System.out.println("Estado final: " + mario.retornarTipo());

	}

}
