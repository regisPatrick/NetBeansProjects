/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author user
 */
public class CotacaoAdapter extends CotacaoTarget{

    @Override
    public void setValor(double valor) {
        
        super.setValor(valor / 3.00);
    }

    @Override
    public double getValor() {
        
        return (super.getValor() * 3.00);
    }
    
    public double getValorDolar(){
        
        return super.getValor();
        
    }
    
}
