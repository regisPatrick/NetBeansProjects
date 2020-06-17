/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.ejb;

import java.io.Serializable;
import javax.ejb.Singleton;

/**
 *
 * @author user
 */
@Singleton
public class BeanContador implements Serializable{
    
    private Integer contador;

    public BeanContador(){
        contador = 0;
    }
    
    public void incrementaContador(){
        contador++;
    }
    
    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }
    
}
