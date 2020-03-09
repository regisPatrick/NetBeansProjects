/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesutilitariasjava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author user
 */
public class Aula8DatasNoJava8 {
    
    public static void main(String[] args) {
        
        // data dd MM yyyy
        //Data formato ISO
        LocalDate agora = LocalDate.now();//retorna no padrão ISO 2020-02-23
        System.out.println(agora);
        
        System.out.println(LocalDate.of(2020, 2, 22));
        System.out.println(LocalDate.parse("2020-02-21"));
        
        System.out.println(agora.plusDays(30));
        
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));
        
        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());
        
        System.out.println(agora.isLeapYear());
        
        System.out.println(LocalDate.parse("2019-01-01").isLeapYear());
        
        // hora formato ISO
        LocalTime hagora = LocalTime.now();//retorna no padrão ISO para o horário, com horário militar(Ex: 15:00)
        System.out.println(hagora);
        
        System.out.println(LocalTime.of(20, 18));
        System.out.println(LocalTime.parse("20:18"));
        
        System.out.println(hagora.plusMinutes(60));
        System.out.println(hagora.minus(2, ChronoUnit.HOURS));
        System.out.println(hagora.minus(40, ChronoUnit.MINUTES));
        
        System.out.println(hagora.getHour());
        
        //Data Completa = data + hora
        
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);
        
        System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10));
        System.out.println(LocalDateTime.parse("2019-02-16T20:25:10"));
        System.out.println(agoraCompleto.plusYears(20));
        
        
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);
        
        Set<String> fusos = ZoneId.getAvailableZoneIds();
//        for (String f : fusos) {
//            System.out.println(f);
//        }
        
        ZoneId ny = ZoneId.of("America/New_York");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), ny);
        System.out.println(zdt);
        System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-05:00[America/New_York]"));
        
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetDateTime);
        
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), ny);
        System.out.println(ldtDate);
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), ny));
        
    }
    
}
