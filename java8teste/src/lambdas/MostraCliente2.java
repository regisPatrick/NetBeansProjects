/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class MostraCliente2 implements Consumer<Cliente3>{

    @Override
    public void accept(Cliente3 c1) {
        System.out.println(c1.getNome());
        System.out.println(c1.getSenha());
    }
    
}
