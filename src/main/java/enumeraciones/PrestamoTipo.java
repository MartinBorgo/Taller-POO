/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.taller.poo.enumeraciones;

/**
 *
 * @author martin
 */
public enum PrestamoTipo {
    SALA("Sala."),
    DOMICILIO("Domicilio.");
    
    private String prestamoTipo;

    private PrestamoTipo(String prestamoTipo) {
        this.prestamoTipo = prestamoTipo;
    }

    public String getPrestamoTipo() {
        return prestamoTipo;
    }
    
}
