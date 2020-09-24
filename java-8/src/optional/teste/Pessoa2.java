/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optional.teste;

import java.util.Optional;

/**
 *
 * @author user
 */
public class Pessoa2 {
    
    private Carro2 carro;
    private String nome;

    public Pessoa2(Carro2 carro, String nome) {
        this.carro = carro;
        this.nome = nome;
    }

    public Pessoa2(String nome) {
        this.nome = nome;
    }

    public Optional<Carro2> getCarro() {
        return Optional.ofNullable(carro);
    }

    public void setCarro(Carro2 carro) {
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
