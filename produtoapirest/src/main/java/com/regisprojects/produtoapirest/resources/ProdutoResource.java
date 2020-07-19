/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regisprojects.produtoapirest.resources;

import com.regisprojects.produtoapirest.models.Produto;
import com.regisprojects.produtoapirest.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping(value="/api")
public class ProdutoResource {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    @GetMapping("/produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }
    
    @GetMapping("/produto/{id}")
    public Produto listaProdutoUnico(@PathVariable(value="id") long id){
        return produtoRepository.findById(id);
    }
    
    @PostMapping("/produto")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
    
    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }
    
    @PutMapping("/produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
    
}
