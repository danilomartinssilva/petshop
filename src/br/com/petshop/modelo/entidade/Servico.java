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
public class Servico {
    private Integer id_servico,id_animal,id_tiposervico,status;
    private Double custo_servico,preco_servico;
    private String horario_servico,data_servico,nome_servico;

    /**
     * @return the id_servico
     */
    public Integer getId_servico() {
        return id_servico;
    }

    /**
     * @param id_servico the id_servico to set
     */
    public void setId_servico(Integer id_servico) {
        this.id_servico = id_servico;
    }

    /**
     * @return the id_animal
     */
    public Integer getId_animal() {
        return id_animal;
    }

    /**
     * @param id_animal the id_animal to set
     */
    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
    }

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
     * @return the custo_servico
     */
    public Double getCusto_servico() {
        return custo_servico;
    }

    /**
     * @param custo_servico the custo_servico to set
     */
    public void setCusto_servico(Double custo_servico) {
        this.custo_servico = custo_servico;
    }

    /**
     * @return the preco_servico
     */
    public Double getPreco_servico() {
        return preco_servico;
    }

    /**
     * @param preco_servico the preco_servico to set
     */
    public void setPreco_servico(Double preco_servico) {
        this.preco_servico = preco_servico;
    }

    /**
     * @return the horario_servico
     */
    public String getHorario_servico() {
        return horario_servico;
    }

    /**
     * @param horario_servico the horario_servico to set
     */
    public void setHorario_servico(String horario_servico) {
        this.horario_servico = horario_servico;
    }

    /**
     * @return the data_servico
     */
    public String getData_servico() {
        return data_servico;
    }

    /**
     * @param data_servico the data_servico to set
     */
    public void setData_servico(String data_servico) {
        this.data_servico = data_servico;
    }

    /**
     * @return the nome_servico
     */
    public String getNome_servico() {
        return nome_servico;
    }

    /**
     * @param nome_servico the nome_servico to set
     */
    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
