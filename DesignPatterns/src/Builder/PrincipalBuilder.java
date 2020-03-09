/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.math.BigDecimal;

/**
 *
 * @author user
 */
public class PrincipalBuilder {
    
    public static void main(String[] args) {
        
        
        Pedido pedido = new PedidoBuilder()
                            .setPedido("9999")
                            .setCliente(100, "Luiz", "9342-9900")
                            .setVendedor(2, "João")
                            .setProduto("Caderno", 1, new BigDecimal(12.00))
                            .setProduto("Lapis", 3, new BigDecimal(1.00))
                            .setProduto("Borracha", 2, new BigDecimal(0.50))
                            .builder();
        
        pedido.informacoes();
        
    }
    
}
