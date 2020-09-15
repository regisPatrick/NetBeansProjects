/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesdefault;

/**
 *
 * @author user
 */
public interface MyList {

    static void sort(){
        System.out.println("Dentro do sort");
    };
    
    void add();
    
    default void remove(){
        System.out.println("dentro do remove");
    };
    
}
