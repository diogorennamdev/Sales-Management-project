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
public class VendaDTO extends ClienteDTO{
     private int id_venda; 
     private int id_Cliente; 
     private String data_venda; 
     private String pag_cartao; 
     private String pag_dinheiro; 
     private String desconto; 
     private int id_usuario; 

    public VendaDTO(int id_venda, int id_Cliente, String data_venda, String pag_cartao, String pag_dinheiro, String desconto, int id_usuario) {
        this.id_venda = id_venda;
        this.id_Cliente = id_Cliente;
        this.data_venda = data_venda;
        this.pag_cartao = pag_cartao;
        this.pag_dinheiro = pag_dinheiro;
        this.desconto = desconto;
        this.id_usuario = id_usuario;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getPag_cartao() {
        return pag_cartao;
    }

    public void setPag_cartao(String pag_cartao) {
        this.pag_cartao = pag_cartao;
    }

    public String getPag_dinheiro() {
        return pag_dinheiro;
    }

    public void setPag_dinheiro(String pag_dinheiro) {
        this.pag_dinheiro = pag_dinheiro;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
     
}
