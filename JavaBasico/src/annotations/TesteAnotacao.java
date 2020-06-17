/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotations;

/**
 *
 * @author user
 */
@InformacaoAula(
        autor = "Regis",
        aulaNumero = 65,
        blog = "regisPatrick.com"
)
public class TesteAnotacao {
       
    @InformacaoAula(
        autor = "Regis",
        aulaNumero = 65,
        blog = "regisPatrick.com"
    )
    public static void main(String[] args) {
        
    }
    
}
