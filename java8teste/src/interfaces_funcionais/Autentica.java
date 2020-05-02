/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_funcionais;

/**
 *
 * @author user
 */
@FunctionalInterface
public interface Autentica {
    
    public abstract boolean autenticaSenha(String senha);
    
}
