/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.spring;

import com.regisprojects.spring.beans.Mundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author user
 */
public class App {
    
    public static void main(String[] args) {
        
//        Mundo m = new Mundo();
//        m.getSaludo();

        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/regisprojects/xml/beans.xml");
        Mundo m = (Mundo) appContext.getBean("mundo");
                
        System.out.println(m.getSaludo());
        
        ((ConfigurableApplicationContext)appContext).close();
        
    }
    
}
