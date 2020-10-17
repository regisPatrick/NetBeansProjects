/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author user
 */
public class StreamTest3 {
    
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().anyMatch(p -> p.getSalario() > 4000));
        System.out.println(pessoas.stream().allMatch(pessoa -> pessoa.getIdade() > 18));
        System.out.println(pessoas.stream().noneMatch(pessoa -> pessoa.getIdade() < 18));
        pessoas.stream().filter(p->p.getIdade() < 25)
                .findAny()
                .ifPresent(p->System.out.println(p.getNome()));
        
        pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() > 30)
                .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
                .findFirst()
                .ifPresent(p->System.out.println(p.getNome()));
        
    }
    
}
