/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import br.com.petshop.modelo.entidade.Animal;
import java.sql.SQLException;

/**
 *
 * @author danilo
 */
public class AnimalDAO implements Interface<Animal>{
    // private Integer id_animal,idade_animal,iddono_animal;
    //private String nome_animal,raca_animal,especie_animal,sexo_animal;
    
    private String SQLINSERT = "INSERT INTO animal"
            + "(idade_animal,iddono_animal,nome_animal,raca_animal,"
            + "especie_animal,sexo_animal) VALUES (?,?,?,?,?,?)";
    private String SQLUPDATE = "UPDATE animal SET idade_animal=?,"
            + "iddono_animal=?,nome_animal=?,raca_animal=?,"
            + "especie_animal=?"
            + "sexo_animal=? WHERE id_animal = ?";
    private String SQLDELETE = "DELETE FROM animal WHERE"
            + "id_animal = ?";
    
    
    
    @Override
    public void insert (Animal a){
        try{
        
        
        }
        catch(SQLException e){
            System.out.println("Erro ao"
                    + " cadastrar o animal: "+e.getMessage());
        }
    
    }
    
    
    
}
