/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.escopovariaveis.aula60;

/**
 *
 * @author user
 */
public class EscopoVariaveis {
    
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int calculaValor(int valor){
        
        valor = valor + 10;
        
        // this.valor = valor;
        
        return valor;
    }
    
    public int teste(){
        
        int valor = 5;
        
        if(true){
            valor--;
        }
        
        // this.valor = valor; // referencial valor global/atributo da classe
        
        return valor;
    }
    
    public void outroTeste(){
        
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        
        // i++; // erro de compilação
        
        int j;
        for(j = 0; j < 10; j++){
            System.out.println(j);
        }
        
        System.out.println(j); // j tem valor 10
        
    }
    
    public void maisUmTeste(){
        
        boolean flag = true;
        
        if(flag){
            
            int umaVariavel = 10;
            
            umaVariavel++;
            
            System.out.println(umaVariavel);
        }
        // System.out.println(umaVariavel); // Erro de compilação
    }
    
    public void maisUmOutroTeste(int num){
        
        int total = 0;
        
        try{
            int outroNum = 0;
            
            total = num / outroNum;
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            total++;
            // outroNum++; // Erro de compilação
            // e.printStackTrace(); // Erro de compilação
        }
        
        num++;
        
        // outroNum++; // Erro de compilação
        // e.printStackTrace(); // Erro de compilação
    }
    
}
