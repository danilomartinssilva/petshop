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
public class Animal {

    /**
     * @return the id_animal
     */
    public void Animal(){
        
    }
    
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
     * @return the idade_animal
     */
    public Integer getIdade_animal() {
        return idade_animal;
    }

    /**
     * @param idade_animal the idade_animal to set
     */
    public void setIdade_animal(Integer idade_animal) {
        this.idade_animal = idade_animal;
    }

   /**
     * @return the nome_animal
     */
    public String getNome_animal() {
        return nome_animal;
    }

    /**
     * @param nome_animal the nome_animal to set
     */
    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    /**
     * @return the raca_animal
     */
    public String getRaca_animal() {
        return raca_animal;
    }

    /**
     * @param raca_animal the raca_animal to set
     */
    public void setRaca_animal(String raca_animal) {
        this.raca_animal = raca_animal;
    }

    /**
     * @return the especie_animal
     */
    public String getEspecie_animal() {
        return especie_animal;
    }

    /**
     * @param especie_animal the especie_animal to set
     */
    public void setEspecie_animal(String especie_animal) {
        this.especie_animal = especie_animal;
    }

    /**
     * @return the sexo_animal
     */
    public String getSexo_animal() {
        return sexo_animal;
    }

    /**
     * @param sexo_animal the sexo_animal to set
     */
    public void setSexo_animal(String sexo_animal) {
        this.sexo_animal = sexo_animal;
    }
    private Integer id_animal,idade_animal;
    private String nome_animal,raca_animal,especie_animal,sexo_animal;
    private Cliente cliente;

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
