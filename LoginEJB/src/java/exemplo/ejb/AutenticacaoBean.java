/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class AutenticacaoBean implements AutenticacaoRemote{

    @Override
    public boolean autenticar(String login, String senha) {
        // Autenticação no AD, Banco de Dados, etc.
        return "admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(senha);
    }
    
}
