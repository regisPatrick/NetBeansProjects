/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.ResultSet;
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
//        String sql = "insert into JOGADOR (jog_codigo, jog_nome, jog_idade, jog_posicao) values (?, ?, ?, ?);";
        
       /* String sql = "update JOGADOR "
                + "set jogador.jog_idade = ?,"
                + "jogador.jog_posicao = ?"
                + "where jogador.jog_codigo = ?";*/
       
//       String sql = "delete from jogador where jogador.jog_codigo = ?";
       
//        String sql = "delete from jogador where jogador.jog_nome like '%ato%'";
        
        String sql = "select * from jogador";

        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            System.out.println("Codigo | Nome | Idade | Posicao");
            while (rs.next()){
                int codigo = rs.getInt("jog_Codigo");
                String nome = rs.getString("jog_Nome");
                int idade = rs.getInt("jog_Idade");
                String posicao = rs.getString("jog_Posicao");
                System.out.println(codigo +"  "+ nome +"  "+ idade +"  "+ posicao);
            }
//            stmt.setInt(1, jogador.getCodigo());
//            stmt.setString(2, jogador.getPosicao());
//            stmt.setInt(3, jogador.getCodigo());
//            stmt.setInt(3, jogador.getIdade());
//            stmt.setString(4, jogador.getPosicao());
//            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
                return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    
}

