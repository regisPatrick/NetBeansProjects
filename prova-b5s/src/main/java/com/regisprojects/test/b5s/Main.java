/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.test.b5s;

import com.regisprojects.test.b5s.util.QuestionsB5s;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String[] args) {
        
        QuestionsB5s qb = new QuestionsB5s();
        
        System.out.println("Digite um número entre 1 e 12 para retornar o mês correspondente por extenso: ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        System.out.println(qb.correspondingMonth(month));   
        
        System.out.println("Digite no mínimo 3 números inteiros para retornar a média simples desses números: ");
        scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList();
        boolean flag = true;
        String resposta;
     
        while(flag){
            System.out.println("Digite um número: ");
            numeros.add(scan.nextInt());
            System.out.println("Deseja passar mais um número?(s/n): ");
            resposta = scan.next();
            
            while(!resposta.equals("s") && !resposta.equals("n")){
                System.out.println("Digite s para sim ou n para não: ");
                resposta = scan.next();
            }
            
            if(resposta.equals("n")){
                flag = false;
            }
       
        }
        System.out.println(qb.arithmeticAverage(numeros));
        
    }
    
}
