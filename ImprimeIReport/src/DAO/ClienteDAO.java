/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author user
 */
public class ClienteDAO {

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
        try {
            new ClienteDAO().gerarRelatorio();
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }

    public Connection Conecta_DataBase() {
        Connection conexao = null;
        String END_BD = "C:" + File.separator + "BD" + File.separator + "IREPORT.FDB";
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

    public boolean gerarRelatorio() throws SQLException, JRException {

        String sql = "SELECT"
                + "     TB_CLIENTE.PK_ID_CLIENTE AS TB_CLIENTE_PK_ID_CLIENTE,"
                + "     TB_CLIENTE.CLI_NOME AS TB_CLIENTE_CLI_NOME,"
                + "     TB_CLIENTE.CLI_ENDERECO AS TB_CLIENTE_CLI_ENDERECO,"
                + "     TB_CLIENTE.CLI_BAIRRO AS TB_CLIENTE_CLI_BAIRRO,"
                + "     TB_CLIENTE.CLI_CIDADE AS TB_CLIENTE_CLI_CIDADE,"
                + "     TB_CLIENTE.CLI_UF AS TB_CLIENTE_CLI_UF,"
                + "     TB_CLIENTE.CLI_CEP AS TB_CLIENTE_CLI_CEP,"
                + "     TB_CLIENTE.CLI_TELEFONE AS TB_CLIENTE_CLI_TELEFONE"
                + " FROM"
                + "     TB_CLIENTE";

        PreparedStatement stmt = null;

        try {
            stmt = Conecta_DataBase().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            //Caminho do Relatorio
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("relatorios/Teste1.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/user/Documents/NetBeansProjects/ImprimeIReport/rel/relCliente.pdf");
            
            File file = new File("C:/Users/user/Documents/NetBeansProjects/ImprimeIReport/rel/relCliente.pdf");
            try{
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            Conecta_DataBase().close();
        }
    }

}
