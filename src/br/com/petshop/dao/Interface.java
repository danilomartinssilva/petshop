/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import java.util.List;

/**
 *
 * @author danilo
 * @param <X>
 */
public interface Interface <X>{
    
  public void insert(X object); 
  public List<X> read();
  public void delete (X object);
  public void update (X object);
  
       
}
