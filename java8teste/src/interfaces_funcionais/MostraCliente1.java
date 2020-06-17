/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_funcionais;

import metodos_default.*;
import java.util.function.Consumer;

/**
 *
 * @author user
 */
public class MostraCliente1 implements Consumer<Cliente1>{

    @Override
    public void accept(Cliente1 c1) {
        System.out.println(c1.getNome());
        System.out.println(c1.getSenha());
    }
    
}
