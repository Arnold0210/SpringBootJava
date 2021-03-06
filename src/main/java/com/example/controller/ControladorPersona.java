/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.interfacesService.IPersonaService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 *
 * @author julih
 */

@RequestMapping
public class ControladorPersona {   
@Autowired
    private IPersonaService service;
    
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona>  personas = service.listarPersonas();
        for (Persona e:personas){
            System.out.println(e.nombre);
        }
        
        model.addAttribute("personas",personas);
        return "index";
    }

}
