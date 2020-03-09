/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import interfacesfuncionais.*;

/**
 *
 * @author user
 */
@FunctionalInterface
public interface Autentica {
    
    public abstract boolean autenticaSenha(String senha);
    
}
