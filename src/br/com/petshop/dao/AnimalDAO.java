/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import br.com.petshop.modelo.entidade.Animal;
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
            + " id_animal = ?";
    
    
    
    @Override
    public void insert (Animal a){
        try{
            PreparedStatement p = (PreparedStatement) new Conexao().getConnection().prepareStatement(SQLINSERT);
            p.setInt(1, a.getIdade_animal());
            p.setInt(2, a.getCliente().getId_cliente());
            p.setString(3, a.getNome_animal());
            p.setString(4, a.getRaca_animal());
            p.setString(5, a.getEspecie_animal());
            p.setString(6, a.getSexo_animal());
            p.execute();
        }
        catch(SQLException e){
            System.out.println("Erro ao"
                    + " cadastrar o animal: "+e.getMessage());
        }
    
    }
    @Override
    public List<Animal> read (){
        List<Animal> lista = new ArrayList<Animal>();
        try{
            String sql_consulta = "SELECT  * FROM animal";
            PreparedStatement p = (PreparedStatement) new Conexao().getConnection().prepareCall(sql_consulta);
            ResultSet rs = p.executeQuery();
           while(rs.next()){
            Animal a  = new Animal();
            a.setId_animal(rs.getInt("id_animal"));
            a.setNome_animal(rs.getString("nome_animal"));
            a.setRaca_animal(rs.getString("raca_animal"));
            a.setSexo_animal(rs.getString("sexo_animal"));
            a.setIdade_animal(rs.getInt("idade_animal"));
            a.setEspecie_animal(rs.getString("especie_animal"));
            lista.add(a);
           }
        }
        catch(SQLException e){
            System.out.println("Erro ao retornar os animais cadastrados");
        }
        return lista;
        
    }
    
    @Override
    public void delete(Animal a){
        try{
           PreparedStatement p = (PreparedStatement) new Conexao().getConnection().prepareStatement(SQLDELETE);
           p.setInt(1, a.getId_animal());
           p.execute();
        }
        catch(SQLException e){
            System.out.println("Erro ao excluir animal! "+e.getMessage());
        }
    }
    @Override
    public void update(Animal a){
        try{
            PreparedStatement p = (PreparedStatement)
                    new Conexao().getConnection().prepareStatement(SQLUPDATE);
            p.execute();
        }
        catch(SQLException e){
            System.out.println("Erro ao"
                    + " alterar informações do animal: "+e.getMessage());
        }
        
    }
    
    
    
}
