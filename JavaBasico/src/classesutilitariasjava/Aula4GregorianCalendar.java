/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class Aula4GregorianCalendar {
    
    public static void main(String[] args) {
        
        Calendar hoje1 = Calendar.getInstance();
        System.out.println(hoje1.getTime());
        
        GregorianCalendar hoje = new GregorianCalendar();
        
        //System.out.println(hoje);
        
        imprimirData(hoje);
        
        System.out.println(hoje.isLeapYear(2020));//Método da classe Gregorian Calendar para verificar ano bissexto.
        
        GregorianCalendar hoje2 = new GregorianCalendar(2020, 1, 18);
        
        imprimirData(hoje2);
        
        GregorianCalendar hoje3 = new GregorianCalendar(2020, 1, 18, 16, 13, 56);
        
        imprimirData(hoje3);
    }
    
    private static void imprimirData(Calendar hoje){
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int horaMilitar = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        
        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d",
                dia,(mes+1), ano, horaMilitar, minutos, segundos);
        
        System.out.println();
        
    }
    
}
