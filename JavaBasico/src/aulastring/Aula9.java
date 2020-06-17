/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulastring;

/**
 *
 * @author user
 */
public class Aula9 {

    public static void main(String[] args) {
        
        String[] letras = {"B", "C", "D", "E", "F"};
        
        String alfabeto = "";
        
        for(String letra : letras){
            alfabeto += letra;
        }
        System.out.println(alfabeto);
        
        StringBuffer sb = new StringBuffer();
        for(String letra : letras){
            sb.append(letra);
        }
        alfabeto = sb.toString();
        
        System.out.println(alfabeto);
        
        alfabeto = new String(sb);
        System.out.println(alfabeto);
        
        System.out.println(sb.reverse());//coloca a String ao contrario
        
        StringBuilder sb_ = new StringBuilder();
        for(String letra : letras){
            sb_.append(letra);
        }
        alfabeto = sb_.toString();
        
        System.out.println(alfabeto);
    }
    
}
