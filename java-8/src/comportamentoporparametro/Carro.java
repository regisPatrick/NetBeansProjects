/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentoporparametro;

/**
 *
 * @author user
 */
public class Carro {
    
    private String nome = "Gol";
    private String cor;
    private int ano;

    public Carro(String cor, int ano) {
        this.cor = cor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", cor=" + cor + ", ano=" + ano + '}';
    }
    
}
