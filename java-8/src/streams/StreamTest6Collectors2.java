/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

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
        
        // Agrupando por gênero e maior salário com optional
        Map<Genero, Optional<Pessoa>> collect4 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.maxBy(Comparator.comparing(Pessoa::getSalario))));
        System.out.println(collect4);
        
        // Agrupando por gênero e maior salário sem optional
        Map<Genero, Pessoa> collect5 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, 
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)), 
                        Optional::get)));
        System.out.println(collect5);
        
        // Agrupando por gênero e estatísticas
        Map<Genero, DoubleSummaryStatistics> collect6 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, Collectors.summarizingDouble(Pessoa::getSalario)));
        System.out.println(collect6);
        
        // Agrupando por gênero e maioridade
        Map<Genero, Set<Maioridade>> collect7 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, mapping(p -> {
            if(p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, toSet())));
        System.out.println(collect7);
        
        Map<Genero, Set<Maioridade>> collect8 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, mapping(p -> {
            if(p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, toCollection(LinkedHashSet::new))));
        System.out.println(collect8);
    }
    
}
