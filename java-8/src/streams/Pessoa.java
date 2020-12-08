/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private double salario;
    private Genero genero;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa(String nome, int idade, double salario, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
    }
    
    public static List<Pessoa> bancoDePessoas(){
        return asList(
                new Pessoa ("Regis Patrick", 22, 2000, Genero.MASCULINO),
                new Pessoa ("Mercy", 22, 3500, Genero.FEMININO),
                new Pessoa ("Mercy", 22, 3500, Genero.FEMININO),
                new Pessoa ("Ana", 17, 1895, Genero.FEMININO),
                new Pessoa ("Thor", 23, 1980, Genero.MASCULINO),
                new Pessoa ("Hulk", 35, 8000, Genero.MASCULINO),
                new Pessoa ("Flash", 29, 3200, Genero.MASCULINO),
                new Pessoa ("Batman", 37, 10000, Genero.MASCULINO),
                new Pessoa ("Lanterna Verde", 17, 5000, Genero.MASCULINO)
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + '}';
    }
    
}
