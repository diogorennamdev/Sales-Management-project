/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class conexaoDAO {
    Connection conn = null;
    
    public Connection ConexaoBD() {
        try {
            String url = "jdbc:mysql://localhost:3306/gerenciamentovendas?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println("Deu rui na conexao " + ex);
        }
        return conn;
    }
}
