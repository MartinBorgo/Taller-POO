/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import java.io.Serializable;

/**
 *
 * @author martin
 */
public class Ubicacion implements Serializable{
    private int pasillo;
    private int estanteria;
    private int estante;

    public Ubicacion(int pasillo, int estanteria, int estante) {
        this.pasillo = pasillo;
        this.estanteria = estanteria;
        this.estante = estante;
    }

    public Ubicacion() {
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

    @Override
    public String toString() {
        return String.format("Pasillo: %s"
                + "%nEstanteria: %s"
                + "%nEstante: %s", 
                pasillo, estanteria, estante);
    }
    
}
