/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.anotacoes.aula65;

/**
 *
 * @author user
 */
@interface InformacaoAula {

    String autor();
    
    int aulaNumero();
    
    String blog() default "http://loiane.com";
    
    String site() default "http://loiane.training";
    
}
