/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto_Spring;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Maricela Velasco
 */

@Controller
public class Registro_Controlador {
    @Autowired
    private Repositorio repositorio;

    @GetMapping("/Registro")
    public String mostrarFormulario() {
        //Model.addAttribute("usuario", new Usuario());
        return "Registro";  
    }

    @PostMapping("/registrar")
    public String registrarUsuario(@RequestParam String nombre_completo, @RequestParam String email,  @RequestParam String nombre_proyecto, @RequestParam String ciudad, @RequestParam String contrasena) {
       
       Usuario usuario = new Usuario();
       usuario.setNombreCompleto(nombre_completo);
        
        repositorio.save(usuario); // Guardar en la base de datos
        return "Registro_exitoso";  // Página que muestra éxito
    }
    
}
