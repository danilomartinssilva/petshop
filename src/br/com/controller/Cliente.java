/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.petshop.dao.ClienteDAO;

/**
 *
 * @author danilo
 */
public class Cliente {
    public void listar(){
        ClienteDAO cdao = new ClienteDAO();
        cdao.read();    
    }
    
}
