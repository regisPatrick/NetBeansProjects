/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploinsertaltdelconsbancofirebird;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ExemploInsertAltDelConsBancoFireBird {

final private String DRIVER = "org.firebirdsql.jdbc.FBDriver";
        String charset = "?encoding=ISO8859_1";
        String servidor = "localhost";
        String porta = "3050";
        String usuario = "SYSDBA";
        String senha = "masterkey";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//        new ExemploInsertAltDelConsBancoFireBird().Conecta_DataBase();
        new ExemploInsertAltDelConsBancoFireBird().save();
    }
    
    public Connection Conecta_DataBase(){
        Connection conexao = null;
        String END_BD = "C:" + File.separator + "BD" + File.separator + "Sao_Paulo_FC.FDB";
            try {
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection("jdbc:firebirdsql:" + servidor + "/" + porta + ":" + END_BD + charset, usuario, senha);
                JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!!!");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não localizado!!!", "Erro", 0);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR COM O SERVIDOR FIREBIRD!!!", "Atenção", (2));
            }
            
            return conexao;
            
    }
    
    public boolean save() throws SQLException{
//        String sql = "insert into JOGADOR (jog_codigo, jog_nome, jog_idade, jog_posicao) values (?, ?, ?, ?);";
//        String sql = "update JOGADOR set jogador.jog_idade = ?"
//                        + "where jogador.jog_codigo = ?";    
//        String sql = "delete from jogador where jogador.jog_codigo = ?";
        String sql = "select * from jogador";

        PreparedStatement stmt = null;
        
        try {
            stmt = Conecta_DataBase().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            System.out.println("Codigo | Nome | Idade | Posicao");
            while (rs.next()){
                int codigo = rs.getInt("jog_Codigo");
                String nome = rs.getString("jog_Nome");
                int idade = rs.getInt("jog_Idade");
                String posicao = rs.getString("jog_Posicao");
                System.out.println(codigo +"  "+ nome +"  "+ idade +"  "+ posicao);
            }
//            stmt.setInt(1, 4);
//            stmt.setString(2, "Luan");
//            stmt.setInt(2, 4);
//            stmt.setString(4, "Volante");
//            stmt.executeUpdate();
//            System.out.println("Dados Inseridos com sucesso!!!");
//            System.out.println("Dados Deletados com sucesso!!");
            return true;
        } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
                return false;
        }finally{
            Conecta_DataBase().close();
        }
    }
    
}
