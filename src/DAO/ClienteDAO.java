/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class ClienteDAO {
    
    Connection conn = null; 
    PreparedStatement pstm; 
    ResultSet rs;
     ArrayList<ClienteDTO> lista = new ArrayList<>();
   
    
 public void create(ClienteDTO objClienteDTO){
        try {
            String sql = "insert into cliente (nome, cpf, email, bairro, numero, endereco,cidade, estado, telefone, data_nascimento) VALUES (?,?,?,?,?,?,?,?,?,?)";
            
            conn = new conexaoDAO().ConexaoBD();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome());
            pstm.setString(2, objClienteDTO.getCpf());
            pstm.setString(3, objClienteDTO.getEmail());
            pstm.setString(4, objClienteDTO.getBairro());
            pstm.setInt(5, objClienteDTO.getNumero());
            pstm.setString(6, objClienteDTO.getEndereco());
            pstm.setString(7, objClienteDTO.getCidade());
            pstm.setString(8, objClienteDTO.getEstado());
            pstm.setString(9, objClienteDTO.getTelefone());
            pstm.setString(10, objClienteDTO.getData_nascimento()); 
            
            pstm.execute(); 
            
            pstm.close();
            System.out.println("Pessoa inserida no banco de dados com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Deu erro! na PessoaDAO.create()" +  ex);
        }
    }  
        public ArrayList<ClienteDTO> readAll() {
        try {
            String sql = "SELECT * FROM Cliente";
            
            conn = new conexaoDAO().ConexaoBD();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(); 
            
            while(rs.next()) {
            ClienteDTO objClienteDTO = new ClienteDTO(); 
            
            objClienteDTO.setId_cliente(rs.getInt("id_cliente"));
            objClienteDTO.setNome(rs.getString("nome"));
            objClienteDTO.setCpf(rs.getString("cpf"));
            objClienteDTO.setEmail(rs.getString("email"));
            objClienteDTO.setBairro(rs.getString("bairro")); 
            objClienteDTO.setNumero(rs.getInt("numero"));
            objClienteDTO.setEndereco(rs.getString("endereco"));
            objClienteDTO.setCidade(rs.getString("cidade"));
            objClienteDTO.setEstado(rs.getString("estado")); 
            objClienteDTO.setTelefone(rs.getString("telefone"));
            objClienteDTO.setData_nascimento(rs.getString("data_nascimento"));
            
            lista.add(objClienteDTO);
            } 
           
            pstm.close(); 
            
            return lista;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na lista " + ex);
            return null;
        }  
       
        }
        
        public void update(ClienteDTO objClienteDTO) {
          try {
            String sql = "UPDATE cliente SET nome=?, numero=?, email=?, bairro=?, endereco=?,cidade=?, estado=?, telefone=?, data_nascimento=? WHERE cpf=?";
            
            conn = new conexaoDAO().ConexaoBD();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objClienteDTO.getNome());
            pstm.setString(10, objClienteDTO.getCpf());
            pstm.setString(3, objClienteDTO.getEmail());
            pstm.setString(4, objClienteDTO.getBairro());
            pstm.setInt(2, objClienteDTO.getNumero());
            pstm.setString(5, objClienteDTO.getEndereco());
            pstm.setString(6, objClienteDTO.getCidade());
            pstm.setString(7, objClienteDTO.getEstado());
            pstm.setString(8, objClienteDTO.getTelefone());
            pstm.setString(9, objClienteDTO.getData_nascimento()); 
            

            
            pstm.execute(); 
            pstm.close();
            System.out.println("Cliente alterado no banco de dados com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Deu erro ao alterar no banco de dados" +  ex);
        }

 }      
        public void Delete(ClienteDTO objClienteDTO){
             try {
            String sql = "DELETE FROM Cliente WHERE numero=?" ;
            
            conn = new conexaoDAO().ConexaoBD();
            pstm = conn.prepareStatement(sql);
          
            pstm.setInt(1, objClienteDTO.getNumero());
            
            pstm.execute(); 
            pstm.close();
            
            System.out.println("Cliente excluido  com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Cliente no Banco de dados " + ex);
        }
        }

 
    }

 
        
        
        
        
        
        
       
        
        
        
        
        
        
    
        

        
        
    
