/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowolrd;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class HelloWolrd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:sss");
        System.out.println(sdf.format(Calendar.getInstance().getTime()));
        System.out.println("Olá, Mundo!!!");
        System.out.println("Olá, mundo!!!");
    }
    
}
