/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.teste;

/**
 *
 * @author user
 */
public class TesteWs {
    
    public static void main(String[] args) {
        System.out.println(hello("Regis Patrick"));
    }

    private static String hello(java.lang.String name) {
        exemplo.ws.HelloWorld_Service service = new exemplo.ws.HelloWorld_Service();
        exemplo.ws.HelloWorld port = service.getHelloWorldPort();
        return port.hello(name);
    }
    
}
