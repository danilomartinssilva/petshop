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
public class Tiposervico {
    private Integer id_tiposervico;
    private String nome_tiposervico;

    /**
     * @return the id_tiposervico
     */
    public Integer getId_tiposervico() {
        return id_tiposervico;
    }

    /**
     * @param id_tiposervico the id_tiposervico to set
     */
    public void setId_tiposervico(Integer id_tiposervico) {
        this.id_tiposervico = id_tiposervico;
    }

    /**
     * @return the nome_tiposervico
     */
    public String getNome_tiposervico() {
        return nome_tiposervico;
    }

    /**
     * @param nome_tiposervico the nome_tiposervico to set
     */
    public void setNome_tiposervico(String nome_tiposervico) {
        this.nome_tiposervico = nome_tiposervico;
    }
    
}
