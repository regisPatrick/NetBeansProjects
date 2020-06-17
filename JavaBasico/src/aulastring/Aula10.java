/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulastring;

import java.util.StringTokenizer;

/**
 *
 * @author user
 */
public class Aula10 {

    public static void main(String[] args) {
        
        String doArquivo = "1;Antônio;30;";
        
        StringTokenizer st = new StringTokenizer(doArquivo, ";");
        
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
    }
    
}
