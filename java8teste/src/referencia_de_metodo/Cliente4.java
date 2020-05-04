/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencia_de_metodo;

/**
 *
 * @author user
 */
public class Cliente4 implements Autentica2{

    private String nome;
    private boolean status;
    private String senha;

    public Cliente4(String nome, boolean status, String senha) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
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
