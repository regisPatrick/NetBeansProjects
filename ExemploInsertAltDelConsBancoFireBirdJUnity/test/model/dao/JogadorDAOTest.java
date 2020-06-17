/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Jogador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class JogadorDAOTest {
    
    public JogadorDAOTest() {
    }

    @Test
    public void inserir() {
        
        Jogador jog = new Jogador(7, "Pablo", 29, "Atacante");
        JogadorDAO dao = new JogadorDAO();
        
        if(dao.save(jog)){
            System.out.println("Salvo com sucesso!!");
        }else{
            fail("Erro ao salvar!!");
        }
        
        
    }
    
}
