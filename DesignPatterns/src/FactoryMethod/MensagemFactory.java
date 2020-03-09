/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author user
 */
public class MensagemFactory {
    
    public static Mensagem getMensagem(int i){
        if (i == 1){
            return new MensagemSMS();
        }else if (i == 2){
            return new MensagemEmail();
        }else{
            return new MensagemSMS();
        }
    }
    
}
