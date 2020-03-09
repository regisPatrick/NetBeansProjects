/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.util.Calendar;

/**
 *
 * @author user
 */
public class Aula3Calendar {
    
    public static void main(String[] args) {
        
        Calendar hoje = Calendar.getInstance(); //Singleton
        
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int diaSemana = hoje.get(Calendar.DAY_OF_WEEK);
        int diaSemanaMes = hoje.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int diaAno = hoje.get(Calendar.DAY_OF_YEAR);
        
        int hora = hoje.get(Calendar.HOUR);
        int horaMilitar = hoje.get(Calendar.HOUR_OF_DAY);
        
        int minutos = hoje.get(Calendar.MINUTE);
        
        int segundos = hoje.get(Calendar.SECOND);
        
        System.out.println(hoje);
        
        System.out.println(ano);
        
        System.out.println(mes);
        
        System.out.println(Calendar.JANUARY);
        
        System.out.println(dia);
        
        System.out.println(diaSemana);
        
        System.out.println(diaSemanaMes);
        
        System.out.println(diaAno);
        
        System.out.println(hora);
        
        System.out.println(horaMilitar);
        
        System.out.println(minutos);
        
        System.out.println(segundos);
        
        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", dia,(mes+1), ano, horaMilitar, minutos, segundos);
    
        //hoje.add(Calendar.DAY_OF_MONTH, 15); // Adicionar Data
        
        hoje.add(Calendar.DAY_OF_MONTH, -2); // Subtrair Data
        
        System.out.println();
        
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }
    
}