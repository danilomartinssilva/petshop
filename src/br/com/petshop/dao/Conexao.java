/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author danilo
 */
public class Conexao {
    private final String DSN = "jdbc:postgresql://localhost:5432/petshop";
    private final String USER = "postgres";
    private final String PASS = "root";
    private Connection con ; 
    
    
    public Connection getConnection(){
        try{
            if(this.con==null){
                this.con = DriverManager.getConnection(DSN, USER, PASS);                
            }
            return this.con;
        }
        catch(SQLException e ){
            System.out.println("Houve um erro de conexão: "+e.getMessage());
            return null;
        }
        
    }
    
    
    public void closeConnection(){
        try{
           if(this.con!=null){
               this.con.close();
           }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("O método de desconexão foi acionado");
        }
        
        
        
    }
    
    
    
}
