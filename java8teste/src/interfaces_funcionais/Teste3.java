/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_funcionais;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class Teste3 {
    
    public static void main(String[] args) {
        Cliente1 c1 = new Cliente1("Regis", true, "123");
        Cliente1 c2 = new Cliente1("Jose", true, "456");
        
        c1.autenticaSenha("852");
        
        List<Cliente1> clientes = Arrays.asList(c1, c2);
        MostraCliente1 mc = new MostraCliente1();
        clientes.forEach(mc);
    }
    
}
