/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.projetojsf_maven_hibernate.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class ConnectionFactory {
    
    /*
    private static EntityManagerFactory emf = null;
    
    private ConnectionFactory(){}
    
    static{
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("meuPU");
        }
    }
    
    public static EntityManager getConnection(){
        return emf.createEntityManager();
    } 
    Essa é outra forma de fazer, sem usar singleton.
    */
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");

    
    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
   
}
