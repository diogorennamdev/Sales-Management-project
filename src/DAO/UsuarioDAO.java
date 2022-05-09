/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class UsuarioDAO {
    Connection conn = null;
    
    public ResultSet autenticaUsuario(UsuarioDTO usuarioDTO){
        try {
            conn = new conexaoDAO().ConexaoBD();
            String query = "select * from usuario where login=? and senha=?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, usuarioDTO.getLogin ());
            pstm.setString(2,usuarioDTO.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException ex) { 
            System.out.println("Erro na consulta para autenticção" + ex);
            return null;
        }
    }
}
