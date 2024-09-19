/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto_Spring.Controlador;
import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model;
import com.Interivalle.Proyecto_Spring.Modelo.Usuario;
import com.Interivalle.Proyecto_Spring.Repositorio.Usuario_Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author Marysela Velasco
 */

 @Controller
public class Registro_Controlador {
    
    @Autowired
    private Usuario_Repositorio repositorio;
    
     @GetMapping("/registro")  // Maneja la solicitud GET para mostrar el formulario
    public String mostrarFormulario(Model model) {
        return "Registro";  // El nombre de la vista (Registro.html) sin la extensión
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Usuario usuario, Model model) {

        if (repositorio.findByEmail(usuario.getEmail()).isPresent()) {
            //request.setAttribute("error", "El correo ya existe. Por favor, use otro.");
            model.addAttribute("error", "El correo ya existe. Por favor, use otro.");
            return "Registro"; // Vuelve a la página de registro con un mensaje de error
        } 
        
        /*Usuario usuario = new Usuario();
        usuario.setNombreCompleto(nombre_completo);
        usuario.setEmail(email);
        usuario.setNombreProyecto(nombre_proyecto);
        usuario.setCiudad(ciudad);
        usuario.setContrasena(contrasena);*/

        repositorio.save(usuario);

        // Redirigir a la página de login
        return "Login";
    }
}
