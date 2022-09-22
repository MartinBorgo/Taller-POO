/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.taller.poo.enumeraciones;

/**
 *
 * @author martin
 * Esta enumeración contiene todas las caracteristicas que puede poseer una obra
 */
public enum CaracteristicaTipo {
    BOLETIN("Boletin."),
    COLECCION("Coleccion."),
    COMPENDIO("Compedio."),
    DIARIO("Diario."),
    DICCIONARIO("Diccionario,"),
    DOCUMENTAL("Documental."),
    ENCICLOPEDIA("Enciclopedia."),
    INVESTIGACION("Investigacion."),
    MONOGRAFIA("Monografia");
    
    private String caracteristicaTipo;

    private CaracteristicaTipo(String caracteristicaTipo) {
        this.caracteristicaTipo = caracteristicaTipo;
    }

    public String getCaracteristicaTipo() {
        return caracteristicaTipo;
    }
    
}
