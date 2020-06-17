/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumconst;

/**
 *
 * @author user
 */
public class TesteEnum {
    
    public static void main(String[] args) {
        
        DiaSemanaEnum[] dias = DiaSemanaEnum.values();
        
        for(int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
        }
        
        for(DiaSemanaEnum dia : DiaSemanaEnum.values()){
            System.out.println(dia);
        }
        
    }
    
}
