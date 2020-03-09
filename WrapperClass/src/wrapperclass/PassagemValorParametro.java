/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

/**
 *
 * @author user
 */
public class PassagemValorParametro {
    
    
    public static void main(String[] args) {
        
        Contato contato = new Contato("Contato 1", "1234-1234", "ëfsdfs@sdfsfd.com");
        int valor = 10;
        
        System.out.println("**********Valores Originais***********");
        
        System.out.println(contato);
        System.out.println(valor);
        
        testePassagemValorReferencia(valor, contato);
        
        System.out.println("**********Exemplo 1***********");
        
        System.out.println(contato);
        System.out.println(valor);
        
        testePassagemValorReferencia2(valor, contato);
        
        System.out.println("**********Exemplo 2***********");
        
        System.out.println(contato);
        System.out.println(valor);
    }
    
    private static void testePassagemValorReferencia(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        
        contato = new Contato("Contato 2", "9876-0987", "blabla@bla.com");
              
    }
    
    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        
        contato.setNome("Contato" + novoValor);
    }
    
}
