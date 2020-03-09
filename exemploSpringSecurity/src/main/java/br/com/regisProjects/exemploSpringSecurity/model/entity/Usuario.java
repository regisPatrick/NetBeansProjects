/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisProjects.exemploSpringSecurity.model.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author user
 */
@Entity
public class Usuario implements UserDetails, Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String login;
    
    private String nomeCompleto;
    
    private String senha;
    
    @ManyToMany
    @JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(
                name = "usuario_id", referencedColumnName = "login"),
                inverseJoinColumns = @JoinColumn(
                name = "role_id", referencedColumnName = "nomeRole"))
    private List<Role> roles;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //To change body of generated methods, choose Tools | Templates.
        return (Collection<? extends GrantedAuthority>) this.roles;
    }

    @Override
    public String getPassword() {
        //To change body of generated methods, choose Tools | Templates.
        return this.senha;
    }

    @Override
    public String getUsername() {
        //To change body of generated methods, choose Tools | Templates.
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public boolean isEnabled() {
        //To change body of generated methods, choose Tools | Templates.
        return true;
    }
    
}
