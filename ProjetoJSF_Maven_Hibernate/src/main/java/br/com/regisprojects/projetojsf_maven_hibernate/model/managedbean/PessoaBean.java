/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.projetojsf_maven_hibernate.model.managedbean;

import br.com.regisprojects.projetojsf_maven_hibernate.model.dao.GenericoDAO;
import br.com.regisprojects.projetojsf_maven_hibernate.model.dao.PessoaDAO;
import br.com.regisprojects.projetojsf_maven_hibernate.model.entidades.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

/**
 *
 * @author user
 */
@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {
        
    private Pessoa pessoa = new Pessoa();
    private PessoaDAO pessoadao = new PessoaDAO();
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    
    public void salvarOuAlterar(){
        pessoadao.save(pessoa);
    }
    
    public void excluir(){
        pessoadao.remove(Pessoa.class, pessoa.getId());
    }
    
    public void consultaPorId(){
        pessoa = pessoadao.findById(Pessoa.class, pessoa.getId());
    }
    
    public void consultaTodos(){
        pessoas = pessoadao.findAll();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public PessoaDAO getPessoadao() {
        return pessoadao;
    }

    public void setPessoadao(PessoaDAO pessoadao) {
        this.pessoadao = pessoadao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    
    
    
    private String nome;
    private String senha;
    private String texto;
    private String sobrenome;
    private String nomeCompleto;
    private List<String> nomes = new ArrayList<>();
    
    private HtmlCommandButton commandButton;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public HtmlCommandButton getCommandButton() {
        return commandButton;
    }

    public void setCommandButton(HtmlCommandButton commandButton) {
        this.commandButton = commandButton;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void mostrarNome(){
        this.setNomeCompleto(this.getNome() + " " + this.getSobrenome());
    }
    
     public String addNome(){
        nomes.add(this.getNomeCompleto());
        
        if(nomes.size() > 3){
            this.commandButton.setDisabled(true);
            return "paginanavegacao";
        }
        
        return ""; // null ou vazio fica na mesma pagina -> outcome
    }

    
}