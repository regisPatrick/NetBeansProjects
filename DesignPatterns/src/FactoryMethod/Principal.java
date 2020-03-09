/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Principal {
    
    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog(null);
        
        Mensagem mensagem = MensagemFactory.getMensagem(1);
        mensagem.enviar(texto);
        
    }
    
}
