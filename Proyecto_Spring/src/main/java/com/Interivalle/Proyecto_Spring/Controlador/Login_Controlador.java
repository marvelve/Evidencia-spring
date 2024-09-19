/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto_Spring.Controlador;

import ch.qos.logback.core.model.Model;
import com.Interivalle.Proyecto_Spring.Repositorio.Usuario_Repositorio;
import com.Interivalle.Proyecto_Spring.Modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Marysela Velasco
 */
@Controller
public class Login_Controlador {
   
    @Autowired
    private Usuario_Repositorio usuario_Repository;
     @GetMapping("/login")  // Maneja la solicitud GET para mostrar el formulario
    public String mostrarFormulario(Model model) {
        return "Login";  // El nombre de la vista (Registro.html) sin la extensión
    }

    // Manejar la autenticación del usuario
    @PostMapping("/login")
    public ModelAndView autenticarUsuario(@ModelAttribute Usuario usuario, Model model) {
        //Usuario usuario = usuario_Repository.findByEmail(email);

        if (usuario != null && usuario.getContrasena().equals(usuario.getContrasena())) {
            // Redirige a una página de bienvenida o dashboard
            return new ModelAndView("ObraBlanca", "Usuario", usuario);
        } else {
            // Redirige de nuevo al login con un mensaje de error
            ModelAndView mav = new ModelAndView("Login");
            mav.addObject("error", "Email o contraseña incorrectos");
            return mav;
        }
    }
    
}
