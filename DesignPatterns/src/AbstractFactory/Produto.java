/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.math.BigDecimal;

/**
 *
 * @author user
 */
public class Produto {
    
    private String nome;
    
    private int quantidade;
    
    private BigDecimal valorUnitario;
    
    public double getValorTotal(double imposto){
        
        BigDecimal valorTotal = valorUnitario.add(new BigDecimal(imposto));
        
        valorTotal = valorTotal.multiply(new BigDecimal(quantidade));
        
        return valorTotal.doubleValue();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}
