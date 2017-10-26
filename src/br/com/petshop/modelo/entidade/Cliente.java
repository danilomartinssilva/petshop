/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.modelo.entidade;

/**
 *
 * @author danilo
 */
public class Cliente {
    private Integer id_cliente;
    private String nome_cliente,bairro_cliente,rua_cliente,cep_cliente,telefone;

    /**
     * @return the id_cliente
     */
    public Integer getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the bairro_cliente
     */
    public String getBairro_cliente() {
        return bairro_cliente;
    }

    /**
     * @param bairro_cliente the bairro_cliente to set
     */
    public void setBairro_cliente(String bairro_cliente) {
        this.bairro_cliente = bairro_cliente;
    }

    /**
     * @return the rua_cliente
     */
    public String getRua_cliente() {
        return rua_cliente;
    }

    /**
     * @param rua_cliente the rua_cliente to set
     */
    public void setRua_cliente(String rua_cliente) {
        this.rua_cliente = rua_cliente;
    }

    /**
     * @return the cep_cliente
     */
    public String getCep_cliente() {
        return cep_cliente;
    }

    /**
     * @param cep_cliente the cep_cliente to set
     */
    public void setCep_cliente(String cep_cliente) {
        this.cep_cliente = cep_cliente;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
