/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.spring;

import com.regisprojects.spring.beans.AppConfig;
import com.regisprojects.spring.beans.AppConfig2;
import com.regisprojects.spring.beans.Mundo;
import com.regisprojects.spring.beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author user
 */
public class App {
    
    public static void main(String[] args) {
        
//        Mundo m = new Mundo();
//        m.getSaludo();

//        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/regisprojects/xml/beans.xml");

//        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);

//        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
//        appContext.register(AppConfig.class);
//        appContext.register(AppConfig2.class);
//        appContext.refresh();
//        
//        Mundo m = (Mundo) appContext.getBean("marte");
//                
//        System.out.println(m.getSaludo());

        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/regisprojects/xml/beans.xml");
        Persona per = (Persona) appContext.getBean(Persona.class);
        // ou -> Persona per = (Persona) appContext.getBean("persona");
        
        System.out.println(per.getId() + " " + per.getNome() + " " + per.getApodo());
        
        ((ConfigurableApplicationContext)appContext).close();
        
    }
    
}
