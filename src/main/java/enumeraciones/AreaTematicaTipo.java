/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.taller.poo.enumeraciones;

/**
 *
 * @author martin
 * Esta enumeración contiene a las areas tematicas a las que puede pertenecer un libro
 */
public enum AreaTematicaTipo {
    MATEMATICAS("Matematica."),
    SISTEMAS_OPERATIVOS("Sistemas operativos."),
    PROGRAMACION("Programacion."),
    CONTABILIDAD("Contabilidad."),
    ADMINISTRACION_DE_EMPRESAS("Administracion de empresas.");
    
    private final String areaTematicaTipo;
    
    private AreaTematicaTipo(String areaTematicaTipo){
        this.areaTematicaTipo = areaTematicaTipo;
    }

    public String getAreaTematicaTipo() {
        return areaTematicaTipo;
    }
}
