/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentoporparametro;

/**
 *
 * @author user
 */
public class ComparadorCarro {
    
    public static int comparePorCor(Carro c1, Carro c2){
        return c1.getCor().compareTo(c2.getCor());
    }
    
}
