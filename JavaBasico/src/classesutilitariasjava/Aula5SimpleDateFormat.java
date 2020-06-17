/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Aula5SimpleDateFormat {
 
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
        
        Calendar data = new GregorianCalendar(2010, 4, 4, 14, 32, 25);
        
        System.out.println(sdf.format(data.getTime()));
        
        Date hoje = new Date();
        
        System.out.println(sdf.format(hoje));
        
        String d = sdf.format(hoje);
        System.out.println("d:" + d);
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";
        
        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);
            System.out.println(minhaDataEmDate);
            System.out.println(sdf.format(minhaDataEmDate));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
