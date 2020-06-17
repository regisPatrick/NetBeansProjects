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
public class MensagemEmail implements Mensagem{
    
    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null, "E-mail: " + mensagem);
    }
    
}
