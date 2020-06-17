/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.jsf;

import exemplo.ejb.AutenticacaoRemote;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author user
 */
@ManagedBean
public class LoginMB {
    
    private String login;
    private String senha;
    
    @EJB
    private AutenticacaoRemote ejb;
    
    public String autenticar(){
        if(ejb.autenticar(login, senha)){
            return "principal";
        } else {
            FacesMessage fm = new FacesMessage("Login ou Senha inválido!!!");
            FacesContext.getCurrentInstance().addMessage("msg", fm);
            return null;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
