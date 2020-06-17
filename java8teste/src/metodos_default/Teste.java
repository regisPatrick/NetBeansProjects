/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_default;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class Teste {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Regis", true, "123");
        Cliente c2 = new Cliente("Jose", true, "456");
        
        List<Cliente> clientes = Arrays.asList(c1, c2);
        for(Cliente cliente : clientes){
            System.out.println(cliente.getNome());
            System.out.println(cliente.getSenha());
        }
    }
    
}
