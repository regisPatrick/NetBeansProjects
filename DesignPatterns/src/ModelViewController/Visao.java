/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelViewController;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Visao extends JFrame{
    
    private JTextField numero1 = new JTextField(3);
    private JTextField numero2 = new JTextField(3);
    private JTextField resultado = new JTextField(6);
    private JButton botao = new JButton("Somar");
    
    public Visao(){
        
        JPanel painel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Quando agente tem esse metodo declarado aqui, quando agente encerra a aplicacao, ele elimina o programa da memória, quando agente não tem isso declarado, mesmo quando agente fecha, clica no x de fechar, ele continua executando em segundo plano, mesmo que agente não esteja mais vendo ele, então é importamte colocar
        this.setSize(400, 100);
        
        painel.add(numero1);
        painel.add(numero2);
        painel.add(botao);
        painel.add(resultado);
        
        this.add(painel);
        
    }
    
    public int getPrimeiroNumero(){
        
        return Integer.parseInt(numero1.getText());
        
    }
    
    public int getSegundoNumero(){
        
        return Integer.parseInt(numero2.getText());
        
    }
    
    public int getResultado(){
        
        return Integer.parseInt(resultado.getText());
        
    }
    
    public void setResultado(int valor){
        
        resultado.setText(Integer.toString(valor));
        
    }
    
    public void adicionaListener(ActionListener listener){
        
        botao.addActionListener(listener);
        
    }
    
    public void mensagemErro(String mensagem){
        
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
