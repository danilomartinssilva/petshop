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
//    private Integer id_cliente;
    //private String nome_cliente,bairro_cliente,rua_cliente,cep_cliente,telefone;
/**
 *
 * @author danilo
 */
public class ClienteDAO implements Interface<Cliente> {
    private String SQLINSERT = "INSERT INTO cliente ("
            + "nome_cliente,bairro_cliente,rua_cliente,telefone,cep_cliente)"
            + "VALUES (?,?,?,?,?)";
    private String SQLUPDATE = "UPDATE cliente SET "
            + "nome_cliente = ?, bairro_cliente = ?,rua_cliente =?"
            + "telefone = ?,cep_cliente=? WHERE id_cliente = ?";
    private String SQLDELETE = "DELETE FROM cliente "
            + "WHERE id_cliente = ?";
    
    @Override
    public void insert (Cliente c ){
    try{
        PreparedStatement p = (PreparedStatement) 
                new Conexao().getConnection().prepareStatement(SQLINSERT);
        p.setString(1, c.getNome_cliente());
        p.setString(2, c.getBairro_cliente());
        p.setString(3, c.getRua_cliente());
        p.setString(4, c.getTelefone());
        
        p.setString(5,c.getCep_cliente());
        
        p.execute();
    }
    catch(SQLException e ){
        System.out.println("Erro ao cadastrar cliente: "+e.getMessage());
        }
    }
    public void update (Cliente c ){
    try{
        PreparedStatement p = (PreparedStatement)
                new Conexao().getConnection().prepareStatement(SQLUPDATE);
        p.setString(1, c.getNome_cliente());
        p.setString(2, c.getBairro_cliente());
        p.setString(3,c.getRua_cliente());
        p.setString(4, c.getTelefone());
        p.setString(5, c.getCep_cliente());
        p.setInt(6, c.getId_cliente());       
        p.execute();
        
    }
    catch(SQLException e){
        System.out.println("Erro ao realizar alteração: "+e.getMessage());
        
    }
    
    }
    @Override
    public void delete(Cliente c){
        try{
            PreparedStatement p  = (PreparedStatement)
                    new Conexao().getConnection().prepareStatement(SQLDELETE);
            p.setInt(1, c.getId_cliente());
            p.execute();
        }
        catch(SQLException e){
            System.out.println("Erro ao excluir cliente: "+ e.getMessage());
        }
        
    }
    
    
    @Override
    public List<Cliente> read(){
        List<Cliente> lista = new ArrayList<>();
        try{
            String sqlread = "SELECT * FROM cliente";
            PreparedStatement p = (PreparedStatement)
                    new Conexao().getConnection().prepareStatement(sqlread);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
               Cliente c  = new Cliente();
               c.setId_cliente(rs.getInt("id_cliente"));
               c.setBairro_cliente(rs.getString("bairro_cliente"));
               c.setCep_cliente(rs.getString("cep_cliente"));
               c.setNome_cliente(rs.getString("nome_cliente"));
               c.setRua_cliente(rs.getString("rua_cliente"));
               c.setTelefone(rs.getString("telefone"));
               lista.add(c);
            }
        }
        catch(SQLException e ){
            System.out.println("Erro ao listar os clientes: "+e.getMessage());
        }
        return lista;
        
    
    
    }
  
}
