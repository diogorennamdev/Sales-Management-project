/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.ProdutoDTO;
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
public class ProdutoDAO {
     Connection conn = null; 
     PreparedStatement pstm; 
     ResultSet rs;
     ArrayList<ProdutoDTO> lista = new ArrayList<>();
    
    public void create (ProdutoDTO objProdutoDTO) {
        try {                        
            String sql = "insert into produto (id_produto, nota_fiscal, quantidade, descricao, valor, fornecedor ) VALUES (?,?,?,?,?,?)";
            
            conn = new conexaoDAO().ConexaoBD();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objProdutoDTO.getId_produto());
            pstm.setString(2, objProdutoDTO.getNota_fiscal());
            pstm.setString(3, objProdutoDTO.getQuantidade());
            pstm.setString(4,objProdutoDTO.getDescricao());
            pstm.setString(5, objProdutoDTO.getValor());
            pstm.setString(6, objProdutoDTO.getFornecedor()); 
            
            pstm.execute(); 
            
            System.out.println("Produto cadastrado com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao logar ao Banco de dados " + ex);
        }
    }
    
    public ArrayList<ProdutoDTO> readAll(){
        try {
            String sql = "SELECT * FROM produto";
            
            conn = new conexaoDAO().ConexaoBD();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(); 
            
            while(rs.next()) {
            ProdutoDTO objProdutoDTO = new ProdutoDTO(); 
            objProdutoDTO.setId_produto(rs.getInt("id_produto"));
            objProdutoDTO.setNota_fiscal( rs.getString("nota_fiscal"));
            objProdutoDTO.setQuantidade(rs.getString("quantidade"));
            objProdutoDTO.setDescricao(rs.getString("descricao"));
            objProdutoDTO.setValor(rs.getString("valor"));
            objProdutoDTO.setFornecedor(rs.getString("fornecedor"));
            
            lista.add(objProdutoDTO);
            } 
           
            pstm.close(); 
            
            return lista;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na lista " + ex);
            return null;
        }
    }

    public void update(ProdutoDTO objProdutoDTO) {
         try {
            String sql = "UPDATE produto SET nota_fiscal=?, quantidade=?, descricao=?, valor=?, fornecedor=? WHERE id_produto=?" ;
            
            conn = new conexaoDAO().ConexaoBD();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objProdutoDTO.getNota_fiscal());
            pstm.setString(3, objProdutoDTO.getDescricao());
            pstm.setString(4,objProdutoDTO.getValor());
            pstm.setString(2, objProdutoDTO.getQuantidade());
            pstm.setString(5, objProdutoDTO.getFornecedor());
            pstm.setInt(6, objProdutoDTO.getId_produto());
            
            pstm.execute(); 
            pstm.close();
            
            System.out.println("Produto alterado com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar no Banco de dados " + ex);
        }
    }

    public void Delete(ProdutoDTO objProdutoDTO) {
          try {
            String sql = "DELETE FROM produto WHERE id_produto=?" ;
            
            conn = new conexaoDAO().ConexaoBD();
            pstm = conn.prepareStatement(sql);
          
            pstm.setInt(1, objProdutoDTO.getId_produto());
            
            pstm.execute(); 
            pstm.close();
            
            System.out.println("Produto excluido  com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir no Banco de dados " + ex);
        }
    }
    }
           

     

