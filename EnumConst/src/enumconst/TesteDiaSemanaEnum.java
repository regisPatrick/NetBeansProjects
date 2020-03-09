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
public class TesteDiaSemanaEnum {
    
    public static void main(String[] args) {
        
        DiaSemanaEnum dia = DiaSemanaEnum.DOMINGO;
        
        System.out.println(dia.toString() + " - " + dia.getValor());
        
        Data data = new Data(15, 01, 2020, DiaSemanaEnum.QUARTA);
        System.out.println(data.getDia() + " / " + data.getMes() + " / " + data.getAno() + " - " + data.getDiaSemanaEnum());
        
    }
    
}
