/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesfuncionais;

import metodosdefault.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Regis", true, "123");
        Cliente c2 = new Cliente("João", true, "987");
        
        c1.autenticaSenha("852");
        
        List<Cliente> clientes = Arrays.asList(c1, c2);
        MostraCliente mc = new MostraCliente();
        clientes.forEach(mc);
    }
} 
