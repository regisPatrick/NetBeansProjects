/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.ejb;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;

/**
 *
 * @author user
 */
@Stateful
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 1)
public class BeanUsuario implements Serializable{
    
    private String usuario;
    
    public BeanUsuario(){
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
