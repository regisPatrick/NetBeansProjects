/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldclient;

import br.com.regisprojects.helloworld.ejb.HelloWorldRemote;
import javax.naming.InitialContext;

/**
 *
 * @author user
 */
public class HelloWorldClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
         InitialContext ctx = new InitialContext();
         HelloWorldRemote ejb = (HelloWorldRemote)ctx.lookup("br.com.regisprojects.helloworld.ejb.HelloWorldRemote");
         System.out.println(ejb.olaMundo());
    }
}
