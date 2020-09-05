/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import comportamentoporparametro.Carro;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author user
 */
public class CarroTeste {

    private static List<Carro> filtrarCarroVerde(List<Carro> carros){
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros){
            if(carro.getCor().equals("verde"))
                result.add(carro);
        }
        return result;
    }
    
    private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor){
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros){
            if(carro.getCor().equals(cor))
                result.add(carro);
        }
        return result;
    }
    
    private static List<Carro> filtrarCarroDezAnosFabricados(List<Carro> carros){
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros){
            if(carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10))
                result.add(carro);
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        List<Carro> carros = asList(new Carro("verde", 2011), new Carro("vermelho", 1995), new Carro("preto", 2017));
        System.out.println(filtrarCarroVerde(carros));
        System.out.println(filtrarCarroPorCor(carros, "verde"));
        System.out.println(filtrarCarroPorCor(carros, "vermelho"));
        System.out.println(filtrarCarroDezAnosFabricados(carros));
    }
    
}
