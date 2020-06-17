/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;


import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Jogador;
/**
 *
 * @author user
 */
public class JogadorDAO {
    
    private Connection con = null;

    public JogadorDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Jogador jogador){
        String sql = "insert into JOGADOR (jog_codigo, jog_nome, jog_idade, jog_posicao) values (?, ?, ?, ?);";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, jogador.getCodigo());
            stmt.setString(2, jogador.getNome());
            stmt.setInt(3, jogador.getIdade());
            stmt.setString(4, jogador.getPosicao());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
                return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    
}
