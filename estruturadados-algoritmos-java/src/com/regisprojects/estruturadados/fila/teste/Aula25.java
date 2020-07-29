/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author user
 */
public class Aula25 {
    
    public static void main(String[] args) {
        
//        Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();
//        
//        filaComPrioridade.add(2);
//        filaComPrioridade.add(1);
//        
//        System.out.println(filaComPrioridade);
        
        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente p1, Paciente p2) {
                        
                        /*if(p1.getPrioridade() > p2.getPrioridade()){
                            return 1;
                        } else if(p1.getPrioridade() < p2.getPrioridade()){
                            return -1;
                        }
                        return 0;*/
                        
                        return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
                        
                    }

                }
        );
        
        filaComPrioridade.add(new Paciente("A", 2));
        filaComPrioridade.add(new Paciente("B", 1));
        
        System.out.println(filaComPrioridade);
        
    }
    
}
