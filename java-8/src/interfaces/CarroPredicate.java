/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import comportamentoporparametro.Carro;

/**
 *
 * @author user
 */
public interface CarroPredicate {

    boolean test(Carro carro);
    
}
