/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import comportamentoporparametro.Carro;
import interfaces.CarroPredicate;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class CarrosDezAnosRecentPredicate implements CarroPredicate{

    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
    
}
