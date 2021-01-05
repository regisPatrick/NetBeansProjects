/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

/**
 *
 * @author user
 */
public class StreamTest6Collectors2 {

    // Agrupamento
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        Map<Genero, List<Pessoa>> generoListMap = new HashMap<>();
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();
        for(Pessoa pessoa: pessoas){
            if(pessoa.getGenero().equals(Genero.FEMININO))
                femininos.add(pessoa);
            else
                masculinos.add(pessoa);
        }
        generoListMap.put(Genero.FEMININO, femininos);
        generoListMap.put(Genero.MASCULINO, masculinos);
        System.out.println(generoListMap);
        
        // Agrupamento por gênero
        Map<Genero, List<Pessoa>> collect = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero));
        System.out.println(collect);
        
        // Agrupar por maioridade
        Map<Maioridade, List<Pessoa>> collect1 = pessoas.stream().collect(groupingBy(p->{
            if(p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }));
        System.out.println(collect1);
        
        // Agrupando por gênero e maioridade
        // Map<Genero, Map<Maioridade, List<Pessoa>>
        Map<Genero, Map<Maioridade, List<Pessoa>>> collect2 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, groupingBy(p->{
            if(p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        })));
        System.out.println(collect2);
        
        // Agrupando por gênero e quantidade
        Map<Genero, Long> collect3 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.counting()));
        System.out.println(collect3);
    }
    
}
