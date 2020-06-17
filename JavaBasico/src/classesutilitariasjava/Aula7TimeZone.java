/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author user
 */
public class Aula7TimeZone {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();

        System.out.println(tz); // EST

//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso: fusos) {
//			System.out.println(fuso);
//		}
        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");

        System.out.println(tzSP.getDisplayName());
        System.out.println(tzSP.getID());

        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));

        Calendar agoraSP = Calendar.getInstance(tzSP);
        System.out.println(agoraSP.getTimeZone());
        System.out.println(sdf.format(agoraSP.getTime()));

        agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
        System.out.println(sdf.format(agoraSP.getTime()));
    }

}
