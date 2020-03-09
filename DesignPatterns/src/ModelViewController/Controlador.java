 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelViewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class Controlador {
    
    private Visao visao;
    
    private Modelo modelo;

    public Controlador(Visao visao, Modelo modelo) {
        this.visao = visao;
        this.modelo = modelo;
        
        this.visao.adicionaListener(new Listener());
    }
    
    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            int numero1, numero2 = 0;
            
            try {
                numero1 = visao.getPrimeiroNumero();
                numero2 = visao.getSegundoNumero();
                
                modelo.somaNumeros(numero1, numero2);
                
                visao.setResultado(modelo.getValor());
                
            } catch (Exception exception) {
                
                visao.mensagemErro("Insira dois números inteiros");
                
            }
            
        }
        
    }
    
}
