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
public class Aula8 {
    
    public static void main(String[] args) {
        
        String alfabeto = String.join(", ", "A", "B", "C", "D");
        System.out.println(alfabeto);
        
        String[] letras = alfabeto.split(", ");
        for(String letra : letras){
            System.out.println(letra);
        }
        
        String doArquivo = "1;Antônio;30;";
        String[] infos = doArquivo.split(";");
//        for(String info : infos){
//            System.out.println(info);
//        }
        Aula8Pessoa pessoa = new Aula8Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa);
    }
    
}
