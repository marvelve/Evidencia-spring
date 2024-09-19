/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto2_Spring2.controlador;

import com.Interivalle.Proyecto2_Spring2.modelo.Usuario;
import com.Interivalle.Proyecto2_Spring2.servicio.IUsuarioServicio;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Marysela Velasco
 */
@RestController
@CrossOrigin(value="http://localhost:3000")
@RequestMapping("/interivalle")
public class UsuarioControler {
    
    private static final Logger logger
            = LoggerFactory.getLogger(UsuarioControler.class);

    @Autowired
    private IUsuarioServicio usuarioServicio;

    @GetMapping("/empleados")
    public List<Usuario> obtenerUsuarios() {
        var usuarios = usuarioServicio.mostrarUsuarios();
        usuarios.forEach((usuario -> logger.info(usuario.toString())));
        return usuarios;
    }
    
}
