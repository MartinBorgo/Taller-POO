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

    /**
     * Se crea un objeto Ubicacion con valores pasados por parametro
     * @param pasillo int
     * @param estanteria int
     * @param estante int
     */
    public Ubicacion(int pasillo, int estanteria, int estante) {
        this.pasillo = pasillo;
        this.estanteria = estanteria;
        this.estante = estante;
    }

    /**
     * Se crea un objeto Ubicacion con valores pretermidados
     */
    public Ubicacion() {
    }
    
    /**
     * Retorna el pasillo de la ubicacion.
     * @return int
     */
    public int getPasillo() {
        return pasillo;
    }

    /**
     * Ingresa el pasillo de la ubicacion.
     * @param pasillo int
     */
    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    /**
     * Retorna la estanteria de la ubicacion.
     * @return int
     */
    public int getEstanteria() {
        return estanteria;
    }

    /**
     * Ingresa la estanteria de la ubicacion.
     * @param estanteria int
     */
    public void setEstanteria(int estanteria) {
        this.estanteria = estanteria;
    }

    /**
     * Retorna el estante de la ubicacion.
     * @return int
     */
    public int getEstante() {
        return estante;
    }

    /**
     * Ingresa el estante de la ubicacion
     * @param estante 
     */
    public void setEstante(int estante) {
        this.estante = estante;
    }

    /**
     * Retorna un String que representa el objeto.
     * @return String
     */
    @Override
    public String toString() {
        return String.format(" Pasillo: %s,"
                + "%n Estanteria: %s,"
                + "%n Estante: %s", 
                pasillo, estanteria, estante);
    }
    
}
