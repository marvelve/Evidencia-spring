/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Interivalle.Proyecto_Spring.Controlador;

import com.Interivalle.Proyecto_Spring.Modelo.Obra_Blanca;
import com.Interivalle.Proyecto_Spring.Repositorio.ObraBlanca_Repositorio;
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
public class ObraBlanca_Controlador {
        @Autowired
    private ObraBlanca_Repositorio obraBlancaRepositorio;

    @GetMapping("/obrablanca")
    public String mostrarFormulario() {
        return "ObraBlanca"; // Retorna la página Ingreso.html
    }

    @PostMapping("/obrablanca")
    public String procesarCotizacion (
    @RequestParam double medida_area_privada,
    @RequestParam double medida_cocina,
    @RequestParam double medida_bano,
    @RequestParam double medida_zona_oficios,
    @RequestParam double medida_salpicadero_cocina,
    @RequestParam int cantidad_banos,
    @RequestParam int cantidad_poyos,
    @RequestParam int cantidad_panel,
    @RequestParam int cantidad_muros,
    @RequestParam int cantidad_puntos_electricos) {

        Obra_Blanca obrablanca = new Obra_Blanca();
        
        obrablanca.setAreaPrivada(medida_area_privada);
        obrablanca.setAreaCocina(medida_cocina);
        obrablanca.setAreaBano(medida_bano);
        obrablanca.setAreaZonaOficios(medida_zona_oficios);
        obrablanca.setAreaSalpicadero(medida_salpicadero_cocina);
        obrablanca.setNumBanos(cantidad_banos);
        obrablanca.setNumMuros(cantidad_muros);
        obrablanca.setNumPoyos(cantidad_poyos);
        obrablanca.setNumPanel(cantidad_panel);
        obrablanca.setNumPuntosElectricos(cantidad_puntos_electricos);
        

        obraBlancaRepositorio.save(obrablanca);  // Guarda los datos en la tabla obra_blanca
        return "Madera";  // Redirige a la página Madera.html
    }
}
