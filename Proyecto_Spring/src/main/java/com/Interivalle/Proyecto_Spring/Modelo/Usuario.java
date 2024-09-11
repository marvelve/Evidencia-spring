/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto_Spring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

/**
 *
 * @author Maricela Velasco
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_completo;
    private String email;
    private String nombre_proyecto;
    private String ciudad;
    private String contrasena;

    // Getters y Setters
    public void setNombreCompleto(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNombreCompleto() {
        return nombre_completo;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public void setNombreProyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getNombreProyecto() {
        return nombre_proyecto;
    }
    
     public void setCiudad(String ciudad) {
        this.ciudad =ciudad ;
    }

    public String getCiudad() {
        return ciudad;
    }
    
     public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }
}
