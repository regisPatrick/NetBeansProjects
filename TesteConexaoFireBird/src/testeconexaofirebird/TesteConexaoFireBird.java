/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeconexaofirebird;
    
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TesteConexaoFireBird {

        final private String DRIVER = "org.firebirdsql.jdbc.FBDriver";
        String charset = "?encoding=ISO8859_1";
        String servidor = "localhost";
        String porta = "3050";
        String usuario = "SYSDBA";
        String senha = "masterkey";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TesteConexaoFireBird().Conecta_DataBase();
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
    
}
