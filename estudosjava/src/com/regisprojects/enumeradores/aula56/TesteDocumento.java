/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.enumeradores.aula56;

/**
 *
 * @author user
 */
public class TesteDocumento {
    
    public static void main(String[] args) {
        
        /*for(TipoDocumento doc : TipoDocumento.values()){
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        }*/
        
        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf);
        
        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj);
    }
    
}
