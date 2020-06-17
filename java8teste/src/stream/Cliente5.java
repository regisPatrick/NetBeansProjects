/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

/**
 *
 * @author user
 */
public class Cliente5 implements Autentica3{

    private String nome;
    private boolean status;
    private String senha;
    private int pontos;

    public Cliente5(String nome, boolean status, String senha, int pontos) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.pontos = pontos;
    }

    public String getNome() {
        System.out.println(this.nome);
        return this.nome;
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
    
    public int getPontos(){
        return pontos;
    }
    
    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    @Override
    public boolean autenticaSenha(String senha) {
        if (this.senha != senha) {
            System.out.println("Não autenticado");
            return false;
        }
        System.out.println("Autenticado");
        return true;
    }

}
