/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import br.com.petshop.modelo.entidade.Animal;
import br.com.petshop.modelo.entidade.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
            PreparedStatement p = (PreparedStatement) new Conexao().getConnection().prepareStatement(SQLINSERT);
            p.setInt(1, a.getIdade_animal());
            p.setInt(2, a.getCliente().getId_cliente());
            p.setString(3,a.getNome_animal());
            p.setString(4, a.getRaca_animal());
            p.setString(5, a.getRaca_animal());
            p.setString(6, a.getEspecie_animal());
            p.setString(7, a.getSexo_animal());
            p.execute();
        }
        catch(SQLException e){
            System.out.println("Erro ao"
                    + " cadastrar o animal: "+e.getMessage());
        }
    
    }
    public List<Animal> read(){
        List<Animal> lista = new ArrayList<Animal>();
        
        try{
            String sql = "SELECT  * FROM animal";
            PreparedStatement p = (PreparedStatement) new Conexao().getConnection().prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                Animal a = new Animal();
                a.setId_animal(rs.getInt("id_animal"));
                a.setNome_animal(rs.getString("nome_animal"));
                //a.setCliente(cliente);
                
                
                
            }
            
        }
        catch(SQLException e ){
            System.out.println("Erro ao listar dados do animal "+ e.getMessage());
        }
              
        
    }
    
    
    
    
}
