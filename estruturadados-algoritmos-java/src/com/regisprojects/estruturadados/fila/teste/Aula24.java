/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.teste;

import com.regisprojects.estruturadados.fila.FilaComPrioridade;

/**
 *
 * @author user
 */
public class Aula24 {

    public static void main(String[] args) {
        
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
        
        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);
        
        System.out.println(fila); // Queremos que fique 1 2 3 e não 1 3 2
        
        FilaComPrioridade<Paciente> pacientes = new FilaComPrioridade<>();
        
        pacientes.enfileira(new Paciente("A", 2));
        pacientes.enfileira(new Paciente("C", 1));
        pacientes.enfileira(new Paciente("B", 3));
        
        System.out.println(pacientes);
        
        System.out.println(pacientes.desenfileira());
        
        System.out.println(pacientes);
    }
    
}
