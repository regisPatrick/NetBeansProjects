/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciademetodo;

import lambdas.*;
import interfacesfuncionais.*;
import metodosdefault.*;

/**
 *
 * @author user
 */
public class Cliente implements Autentica{
    
    private String nome;
    private boolean status;
    private String senha;

    public Cliente(String nome, boolean status, String senha) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
    }

    public String getNome() {
        System.out.println(this.nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticaSenha(String senha) {
        if(this.senha != senha){
            System.out.println("Não autenticado!");
            return false;
        }
        System.out.println("Autenticado!");
        return true;
    }
    
}
