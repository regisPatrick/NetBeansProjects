/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.ejb;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class BeanDataHora implements Serializable{
    
    @EJB
    private BeanContador beanContador;
    
    public BeanDataHora(){
        System.out.println("Usou o construtor do beanDataHora");
    }
    
    public String getDataHoraServidor(){
        beanContador.incrementaContador();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:sss");
        return sdf.format(Calendar.getInstance().getTime());
    }
    
    @PostConstruct
    public void iniciar(){
        System.out.println("Usou o método iniciar do beanDataHora");
    }
    
    @PreDestroy
    public void destruir(){
        System.out.println("Usou o método destruir do beanDataHora");
    }

    public BeanContador getBeanContador() {
        return beanContador;
    }

    public void setBeanContador(BeanContador beanContador) {
        this.beanContador = beanContador;
    }
    
}
