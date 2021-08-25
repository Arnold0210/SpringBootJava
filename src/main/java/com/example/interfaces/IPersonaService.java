/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.interfaces;
import com.example.model.*;
import java.util.*;
/**
 *
 * @author julih
 */
public interface IPersonaService {
    public List<Persona> listarPersonas();
    public Optional<Persona> personaporId(int id);
    public void añadirPersona(Persona p);
    public void eliminarPersona(int id);
}
