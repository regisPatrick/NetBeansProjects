/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.helloworld.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class HelloWorldBean implements HelloWorldRemote{

    @Override
    public String olaMundo() {
        return "Olá Mundo com EJB!!!";
    }
    
}
