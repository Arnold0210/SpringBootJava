/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.interfaces;
import org.springframework.data.repository.CrudRepository;
import com.example.model.Persona;
import org.springframework.stereotype.Repository;
/**
 *
 * @author julih
 */
@Repository
public interface IPersona extends CrudRepository<Persona,Integer>{
    
}
