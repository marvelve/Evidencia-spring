/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto_Spring;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author LENOVO
 */

public interface Repositorio extends JpaRepository<Usuario, Long> {
    
}