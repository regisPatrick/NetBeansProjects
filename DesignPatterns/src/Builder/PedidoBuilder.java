/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PedidoBuilder {
    
    private Pedido instancia;

    public PedidoBuilder() {
        this.instancia = new Pedido();
    }
    
    public PedidoBuilder setPedido(String numeroPedido){
        instancia.setNumeroPedido(numeroPedido);
        return this;
    }
    
    public PedidoBuilder setCliente(int codigo, String nome, String telefone){
        Cliente cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        
        instancia.setCliente(cliente);
        
        return this;
    }
    
    public PedidoBuilder setVendedor(int codigo, String nome){
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(codigo);
        vendedor.setNome(nome);
        
        instancia.setVendedor(vendedor);
        
        return this;
    }
    
    public PedidoBuilder setProduto(String nome, int quantidade, BigDecimal valor){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setValor(valor);
        
        if (instancia.getProdutos() == null){
            instancia.setProdutos(new ArrayList<>());
        }
        
        instancia.getProdutos().add(produto);
        
        return this;
    }
    
    public Pedido builder(){
        return instancia;
    }
    
}
