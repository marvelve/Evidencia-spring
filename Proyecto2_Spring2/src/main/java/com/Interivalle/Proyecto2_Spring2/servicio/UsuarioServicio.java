/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto2_Spring2.servicio;

import com.Interivalle.Proyecto2_Spring2.modelo.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Interivalle.Proyecto2_Spring2.repositorio.IUsuarioRepositorio;

/**
 *
 * @author Marysela Velasco
 */
@Service
public class UsuarioServicio implements IUsuarioServicio{

    @Autowired
    private IUsuarioRepositorio usuarioRepositorio;
    
    @Override
    public List<Usuario> mostrarUsuarios() {
            return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
    Usuario usuario= usuarioRepositorio.findById(email).orElse(null);
    return usuario;
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
      return usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
       usuarioRepositorio.delete(usuario);    
    }
   

}
