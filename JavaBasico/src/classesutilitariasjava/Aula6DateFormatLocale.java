/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Aula6DateFormatLocale {
    
    public static void main(String[] args) {
        
        Date hoje = new Date();
        
        System.out.println(Locale.getDefault());
        
        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);
        
        //Locale.setDefault(new Locale("en", "US"));
        
        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);//dd/MM/yyyy
        
        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);
        
        String data = "12/02/2020 19:17";
        try {
            Date dataDate = DateFormat.getInstance().parse(data);
            System.out.println(dataDate);
            
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDate);
            System.out.println(calendario);
        } catch (ParseException ex) {
            Logger.getLogger(Aula6DateFormatLocale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
