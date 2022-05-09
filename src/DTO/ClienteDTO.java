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
public class ClienteDTO{
    private int id_cliente; 
    private String cnpj; 
    private String nome;
    private String cpf; 
    private String email; 
    private String bairro;
    private int numero; 
    private String endereco; 
    private String cidade; 
    private String estado; 
    private String data_nascimento; 
    private String telefone;

    public ClienteDTO(String nome, String cpf, String email, String bairro, int numero, String endereco, String cidade, String estado, String data_nascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.bairro = bairro;
        this.numero = numero;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
    }

    public ClienteDTO() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return this.nome;
    }
 
    
      
} 

