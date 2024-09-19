/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Interivalle.Proyecto2_Spring2.servicio;

import com.Interivalle.Proyecto2_Spring2.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Marysela Velasco
 */
public interface IUsuarioServicio {
    
    public List<Usuario> mostrarUsuarios();

    public Usuario buscarUsuarioPorEmail(String email);

    public Usuario guardarUsuario(Usuario empleado);

    public void eliminarUsuario(Usuario empleado);

}
