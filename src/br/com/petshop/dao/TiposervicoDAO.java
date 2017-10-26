/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import br.com.petshop.modelo.entidade.Tiposervico;

/**
 *
 * @author danilo
 */
public class TiposervicoDAO implements Interface<Tiposervico>{
    private String SQLINSERT = "INSERT INTO tiposervico "
            + "(nome_tiposervico) VALUES (?)";
    private String SQLUPDATE = "UPDATE tiposervico SET nome_tiposervico = ? "
            + "WHERE id_tiposervico = ?";
    private String SQLDELETE = "DELETE FROM tiposervico"
            + "WHERE id_tiposervico = ?";
    
}
