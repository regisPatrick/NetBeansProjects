/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.produtos.apirestprodutos.resources;

import com.produtos.apirestprodutos.models.Produto;
import com.produtos.apirestprodutos.repository.ProdutoRepository;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping(value = "/api")
public class ProdutoResource {
    
    @Autowired
    ProdutoRepository produtoRepository;
    
    @GetMapping("/produtos")
    @ApiOperation(value="Retorna uma lista de produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }
    
    @GetMapping("/produto/{id}")
    @ApiOperation(value="Retorna um produto único")
    public Produto listaProdutoUnico(@PathVariable(value="id") long id){
        return produtoRepository.findById(id);
    }
    
    @PostMapping("/produto")
    @ApiOperation(value="Salva um produto")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
    
    @DeleteMapping("/produto")
    @ApiOperation(value="Deleta um produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }
    
    @PutMapping("/produto")
    @ApiOperation(value="Atualiza um produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
    
}
