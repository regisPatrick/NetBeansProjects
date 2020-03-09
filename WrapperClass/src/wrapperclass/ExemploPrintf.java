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
public class ExemploPrintf {
    
    public static void main(String[] args) {
        
        System.out.printf("Hello %s", "Olá, Mundo!");
        System.out.println();
        System.out.printf("%S", "Olá, Mundo!");//tudo em caixa alta
        System.out.println();
        System.out.printf("%c", 'c');// caso você queira fazer a saída só de um caracter
        System.out.println();
        System.out.printf("%C", 'c');// um caracter em caixa alta
        System.out.printf("%n"); // pula linha, quando usar printf fazer assim, não usar \n
        
        int valor = 123456789;
        System.out.printf("%d", valor);// numero inteiro usamos %d
        System.out.println();
        
        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante);// para numero ponto flutuante usamos %f
        System.out.println();
        
        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s", olaMundo); // espaço limitado de vinte caracteres, a frase aparece começando do final do espaço definido, ou seja, por padrão o alinhamento é a direita
        System.out.println();
        System.out.printf("%-20s", olaMundo);//alinhamento a esquerda com o sinal -
        System.out.println();
        System.out.printf("%+d", valor);//Ele imprime com sinal de + na frente, ele imprime se o numero é positivo ou negativo
        System.out.println();
        System.out.printf("%015d", valor);// colocando assim eu estou dizendo que o valor terá que ter 15 dígitos, porém ele completa com zero
        System.out.println();
        System.out.printf("%,d", valor);//ele vai separar em milhares usando a virgula ou o ponto, depende da formatação do seu computador
        System.out.println();
        
        int valor2 = -123456789;
        
        System.out.printf("% d", valor2);//se eu deixo espaço antes do d ele vai imprimir o sinal de -
        System.out.println();
        System.out.printf("% d", valor);// se o número é positivo não aparece o sinal, mesmo deixando espaço, mas ele deixa um espaço em branco antes caso o número seja positivo
        System.out.println();
        System.out.printf("%.3f", pontoFlutuante);//o .3 diz que eu quero três casas depois da virgula
        System.out.println();
        System.out.printf("R$%10.2f", pontoFlutuante);//Ele coloca o símbolo do real, reserva dez casas alinhando à direita, e coloca duas casas depois da virgula
        System.out.println();
        
        testeMaisCompleto();
        
    }
    
    private static void testeMaisCompleto(){
        
        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
        
        for(int i = 0; i < precos.length; i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }
    }
    
}
