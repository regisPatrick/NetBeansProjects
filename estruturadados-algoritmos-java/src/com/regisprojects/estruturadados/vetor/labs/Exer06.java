/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.vetor.labs;

import com.regisprojects.estruturadados.vetor.Lista;
import com.regisprojects.estruturadados.vetor.teste.Contato;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exer06 {
    
    public static void main(String[] args) {
        
        // Criação das variáveis
        Scanner scan = new Scanner(System.in);
        
        // Criar o vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<Contato>(20);
        
        // Criar e adicionar 30 contatos
        
        // criar um menu para que o usuário escolha a opção
        
    }
    
    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){
        
        Contato contato;
        
        for(int i = 1; i <= quantidade; i++){
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111-2222" + i);
            contato.setEmail("contato" + i + "@email.com");
            
            lista.adiciona(contato);
        }
        
    }
    
}
