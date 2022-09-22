/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.poo.gestion.inventario;

/**
 *
 * @author martin
 */
public class Ubicacion {
    private int pasillo;
    private int estanteria;
    private int estante;

    public Ubicacion(int pasillo, int estanteria, int estante) {
        this.pasillo = pasillo;
        this.estanteria = estanteria;
        this.estante = estante;
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    public int getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(int estanteria) {
        this.estanteria = estanteria;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }
    
}
