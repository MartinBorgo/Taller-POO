/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.taller.poo.enumeraciones;

/**
 *
 * @author martin
 */
public enum ObraTipo {
    LIBRO("Libro."),
    REVISTA("Revista."),
    ENSAYO("Ensayo."),
    TESIS("Tesis."),
    MANUAL("Manual.");
    
    private String obraTipo;

    private ObraTipo(String obraTipo) {
        this.obraTipo = obraTipo;
    }

    public String getObraTipo() {
        return obraTipo;
    }
    
}
