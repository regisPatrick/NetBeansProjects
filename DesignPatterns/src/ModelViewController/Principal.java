/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelViewController;

/**
 *
 * @author user
 */
public class Principal {

    public static void main(String[] args) {
        
        Visao visao = new Visao();
        
        Modelo modelo = new Modelo();
        
        Controlador controlador = new Controlador(visao, modelo);
        
        visao.setVisible(true);
        
    }
    
}
