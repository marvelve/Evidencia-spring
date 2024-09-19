/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Interivalle.Proyecto2_Spring2.repositorio;

import com.Interivalle.Proyecto2_Spring2.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Maricela Velasco
 */
public interface IUsuarioRepositorio extends JpaRepository<Usuario, String>{
    
}
