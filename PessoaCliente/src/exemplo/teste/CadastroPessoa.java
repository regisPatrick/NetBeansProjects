/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.teste;

import exemplo.ejb.PessoaRemote;
import exemplo.modelo.Pessoa;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.naming.InitialContext;

/**
 *
 * @author user
 */
public class CadastroPessoa{
    public static void main(String[] args) throws Exception{
        InitialContext ctx = new InitialContext();
        PessoaRemote ejb = (PessoaRemote) ctx.lookup("exemplo.ejb.PessoaRemote");
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
//        Pessoa p = new Pessoa();
//        p.setNome("Antonio");
//        p.setNascimento(df.parse("13/09/1988"));
//        p.setEmail("antono@antonio.com");
//        
//        p = ejb.salvar(p);
//        System.out.println("Pessoa salva com o ID: " + p.getId());
        
//        Pessoa p = ejb.consultarPorId(4L);
//        System.out.println("Nome: " + p.getNome());
//        
//        p.setNome("Zenubio");
//        p = ejb.salvar(p);
        
        ejb.remover(4L);
        System.out.println("Pessoa removida do Banco de Dados!!!");
    }
}
