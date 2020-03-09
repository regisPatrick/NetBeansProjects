/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotations;

/**
 *
 * @author user
 */
@interface InformacaoAula {
    
    String autor();
    
    int aulaNumero();
    
    String blog() default "http://regis.com";
    
    String site()default "http://regis.estudos.com";
    
}
