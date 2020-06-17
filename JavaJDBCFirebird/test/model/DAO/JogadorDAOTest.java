/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import model.bean.Jogador;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author user
 */

public class JogadorDAOTest {
    
    public JogadorDAOTest() {
    }

    @Test
    public void inserir() {
        
        Jogador jog = new Jogador(2, "Hernanes", 33, "Volante");
        JogadorDAO dao = new JogadorDAO();
        
        if(dao.save(jog)){
            System.out.println("Salvo com sucesso!!");
        }else{
            fail("Erro ao salvar!!");
        }
        
        
    }
    
}
