/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author usuario
 */
public class ProdutoDTO {
    private int id_produto; 
    private String nota_fiscal; 
    private String quantidade;
    private String descricao; 
    private String valor; 
    private String fornecedor; 
    

    public ProdutoDTO(int id_produto, String nota_fiscal, String quantidade, String valor, String fornecedor, String descricao) { 
        this.id_produto = id_produto;
        this.nota_fiscal = nota_fiscal;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

  public ProdutoDTO() {
      
  }
    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId_produto() {
        return id_produto;
    } 
    public void setId_produto(int Id_produto) {
        this.id_produto = Id_produto;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

   
}
   
    
    

