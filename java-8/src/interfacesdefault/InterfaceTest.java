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
public class InterfaceTest implements MyList{
    
    public static void main(String[] args) {
        
        MyList.sort();
        new InterfaceTest().remove();
        new InterfaceTest().add();
        
    }

    @Override
    public void add() {
        System.out.println("dentro do add");
    }
    
}
