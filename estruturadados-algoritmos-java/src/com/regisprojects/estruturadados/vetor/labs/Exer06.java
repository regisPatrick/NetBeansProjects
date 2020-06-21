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
        criarContatosDinamicamente(5, lista);
        
        // criar um menu para que o usuário escolha a opção
        
    }
    
    private static int obterOpcaoMenu(Scanner scan){
        
        boolean entradaValida = false;
        
        while(!entradaValida){
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se o contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");
            
            String entrada = scan.nextLine();
            int opcao = Integer.parseInt(entrada);
        }
        
        return 0;
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
