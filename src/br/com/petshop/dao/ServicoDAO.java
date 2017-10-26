/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import br.com.petshop.modelo.entidade.Servico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author danilo
 */
public class ServicoDAO implements Interface<Servico>{
    
    /*
        private Integer id_servico,id_animal,id_tiposervico;
    private Double custo_servico,preco_servico;
    private String horario_servico,data_servico,nome_servico;
    */
    private String SQLINSERT = "INSERT INTO servico ("
            + "id_animal,id_tiposervico,custo_servico,"
            + "preco_servico,"
            + "horario_servico,data_servico,"
            + "nome_servico,status)"
            + "VALUES (?,?,?,?,?,?,?,?)";
    private String SQLUPDATE = "UPDATE servico SET"
            + "id_animal = ?,id_tiposervico=?,"
            + "custo_servico=?,"
            + "preco_servico=?,horario_servico=?,"
            + "data_servico=?,"
            + "nome_servico=?,status=?"
            + " WHERE id_servico = ?";
    private String SQLDELETE = "DELETE FROM servico"
            + "WHERE id_servico = ?";
    
    
    @Override
    public void insert(Servico s){
        try{
            PreparedStatement p = (PreparedStatement)new Conexao().getConnection().prepareStatement(SQLINSERT);
            p.setInt(1, s.getId_animal());
            p.setInt(2, s.getId_tiposervico());
            p.setDouble(3, s.getCusto_servico());
            p.setDouble(4, s.getPreco_servico());
            p.setString(5, s.getHorario_servico());
            p.setString(6, s.getData_servico());
            p.setString(7, s.getNome_servico());
            p.setInt(8, s.getStatus());
            p.executeQuery();
        }
        catch(SQLException e ){
            System.out.println("Erro ao cadastrar serviços");
        }
    
    }
    @Override
    public void update (Servico s){
        try{
            PreparedStatement p = (PreparedStatement) new Conexao().getConnection().prepareStatement(SQLUPDATE);
            p.setInt(1, s.getId_animal());
            p.setInt(2, s.getId_tiposervico());
            p.setDouble(3, s.getCusto_servico());
            p.setDouble(4, s.getPreco_servico());
            p.setString(5, s.getHorario_servico());
            p.setString(6, s.getData_servico());
            p.setString(7, s.getNome_servico());
            p.setInt(8, s.getStatus());
            p.setInt(9, s.getId_servico());
            p.executeUpdate();
        }
        catch(SQLException e ){
            System.out.println("Erro ao alterar serviços: "+e.getMessage());
        }
    
    }
    @Override
    public void delete(Servico s){
        try{
            PreparedStatement p = (PreparedStatement) new Conexao().getConnection().prepareStatement(SQLDELETE);
            p.setInt(1, s.getId_servico());
            p.executeUpdate();
        }
        catch(SQLException e ){
            System.out.println("Erro ao alterar serviços: "+e.getMessage());
        }
    }
    @Override
    public List<Servico> read (){
        List<Servico> lista = new ArrayList<>();
        try{
            String SQLREAD = "SELECT * FROM servico ";
            PreparedStatement p = (PreparedStatement) new Conexao().getConnection().prepareStatement(SQLREAD);
            ResultSet rs  = p.executeQuery();
            while(rs.next()){
                Servico ser = new Servico();
                ser.setId_servico(rs.getInt("id_servico"));
                ser.setNome_servico(rs.getString("nome_servico"));
                ser.setCusto_servico(rs.getDouble("custo_servico"));
                ser.setPreco_servico(rs.getDouble("preco_servico"));
                ser.setId_animal(rs.getInt("id_animal"));
                ser.setStatus(rs.getInt("status_servico"));
                ser.setData_servico(rs.getString("data_servico"));                
                lista.add(ser);
            }
        }
        catch(SQLException e){
            System.out.println("Erro ao listar:"+ e.getMessage());
        }
        return lista;
    }
    
}
