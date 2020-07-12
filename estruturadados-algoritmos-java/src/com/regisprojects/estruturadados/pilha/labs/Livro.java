/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.estruturadados.pilha.labs;

/**
 *
 * @author user
 */
public class Livro {
    
    private String isbn;
    private String autor;
    private int anoLancamento;
    private String nome;

    public Livro() {
    }

    public Livro(String isbn, String autor, int anoLancamento, String nome) {
        this.isbn = isbn;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.nome = nome;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" + "isbn=" + isbn + ", autor=" + autor + ", anoLancamento=" + anoLancamento + ", nome=" + nome + '}';
    }
    
}
