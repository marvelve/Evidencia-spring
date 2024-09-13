/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto_Spring.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Marysela Velasco
 */
@Entity
public class Obra_Blanca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private double medidaAreaPrivada;
    private double medidaCocina;
    private double medidaBano;
    private double medidaZonaOficios;
    private double medidaSalpicaderoCocina;
    private int cantidadBanos;
    private int cantidadPoyos;
    private int cantidadPanel;
    private int cantidadMuros;
    private int cantidadPuntosElectricos;

    // Getters y Setters
    
    // Getters y Setters
    public void setAreaPrivada(double medida_area_privada) {
        this.medidaAreaPrivada = medida_area_privada;
    }

    public double getAreaPrivada() {
        return medidaAreaPrivada;
    }
    
    public void setAreaCocina(double medida_cocina){
        this.medidaCocina=medida_cocina;
    }
    public double getAreaCocina(){
        return medidaCocina;
    }
    
     public void setAreaBano(double medida_bano) {
        this.medidaBano = medida_bano;
    }

    public double getAreaBano() {
        return medidaBano;
    }
    
     public void setAreaZonaOficios(double medida_zona_oficios) {
        this.medidaZonaOficios = medida_zona_oficios;
    }

    public double getAreaZonaOficios() {
        return medidaZonaOficios;
    }
    
     public void setAreaSalpicadero(double medida_salpicadero_cocina) {
        this.medidaSalpicaderoCocina = medida_salpicadero_cocina;
    }

    public double getAreaSalpicadero() {
        return medidaSalpicaderoCocina;
    }
    
      public void setNumBanos(int cantidad_banos) {
        this.cantidadBanos = cantidad_banos;
    }

    public int getNumBanos() {
        return cantidadBanos;
    }
    
     public void setNumPoyos(int cantidad_poyos) {
        this.cantidadPoyos = cantidad_poyos;
    }

    public int getNumPoyos() {
        return cantidadPoyos;
    }
    
     public void setNumMuros(int cantidad_muros) {
        this.cantidadMuros = cantidad_muros;
    }

    public int getNumMuros() {
        return cantidadMuros;
    }
    
    public void setNumPanel(int cantidad_panel) {
        this.cantidadPanel = cantidad_panel;
    }

    public int getNumPanel() {
        return cantidadPanel;
    }

    public void setNumPuntosElectricos(int cantidad_puntosElectricos) {
        this.cantidadPuntosElectricos = cantidad_puntosElectricos;
    }

    public int getNumPuntosElectricos() {
        return cantidadPuntosElectricos;
    }    
    
   
}
