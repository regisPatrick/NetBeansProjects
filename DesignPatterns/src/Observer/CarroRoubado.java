/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.Observable;

/**
 *
 * @author user
 */
public class CarroRoubado extends Observable implements Carro{

    private String acao = "";
    
    @Override
    public void frente() {
        acao = "frente";
        System.out.println("Carro roubado segue em frente.");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        acao = "direita";
        System.out.println("Carro roubado vira a direita.");
        this.mudaEstado();
    }

    @Override
    public void esquerda() {
        acao = "esquerda";
        System.out.println("Carro roubado vira a esquerda.");
        this.mudaEstado();
    }

    @Override
    public void para() {
        acao = "para";
        System.out.println("Carro roubado para.");
        this.mudaEstado();
    }
    
    public void mudaEstado(){
        setChanged(); // Mudou o estado
        notifyObservers(acao); // Notifica os observadores
    }
    
}
