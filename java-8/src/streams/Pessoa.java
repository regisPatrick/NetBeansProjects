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
                new Pessoa ("Regis Patrick", 22, 2000),
                new Pessoa ("Mercy", 22, 3500),
                new Pessoa ("Mercy", 22, 3500),
                new Pessoa ("Ana", 19, 1895),
                new Pessoa ("Thor", 23, 1980),
                new Pessoa ("Hulk", 35, 8000),
                new Pessoa ("Flash", 29, 3200),
                new Pessoa ("Batman", 37, 10000),
                new Pessoa ("Lanterna Verde", 24, 5000)
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
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", genero=" + genero + '}';
    }
    
}
