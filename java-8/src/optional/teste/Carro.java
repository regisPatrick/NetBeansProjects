/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optional.teste;

/**
 *
 * @author user
 */
public class Carro {
    
    private Seguradora2 seguradora;
    private String nome;
    
    public String getNomeSeguradora(Pessoa p){
        if(p != null) {
            Carro carro = p.getCarro();
            if(carro != null){
                Seguradora2 s = carro.getSeguradora();
                if(s != null){
                    return s.getNome();
                }
            }
        }
        return "";
    }

    public Seguradora2 getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(Seguradora2 seguradora) {
        this.seguradora = seguradora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
