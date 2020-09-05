/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import comportamentoporparametro.Carro;
import interfaces.CarroPredicate;

/**
 *
 * @author user
 */
public class CarrosCorVerdePredicate implements CarroPredicate{

    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
    
}
