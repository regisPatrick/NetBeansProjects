/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Pedido {
    
    private String numeroPedido;
    
    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;
    
    public BigDecimal getValorTotal(){
        
        BigDecimal total = BigDecimal.ZERO;
        
        for(Produto produto : produtos){
            total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
        }
        return total;
    }
    
    public int getTotalProdutos(){
        int total = 0 ;
        for(Produto produto : produtos){
            total += produto.getQuantidade();
        }
        return total;
    }
    
    public void informacoes(){
        JOptionPane.showMessageDialog(null, "Num Pedido: " + this.numeroPedido + "\n" + "Cliente: " + this.cliente.getNome() + "\n" + "Vendedor: " + this.vendedor.getNome() + "\n" + "Produto(s): " + this.getTotalProdutos() + " \n " + "Valor Total: " + this.getValorTotal(), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
}
