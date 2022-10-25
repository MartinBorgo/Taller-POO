/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import java.io.Serializable;

/**
 * Clase ubicacion.
 * @author Grupo 2
 */
public class Ubicacion implements Serializable{
    private Integer pasillo;
    private Integer estanteria;
    private Integer estante;

    /**
     * Se crea un objeto Ubicacion con valores pasados por parametro
     * @param pasillo Integer
     * @param estanteria Integer
     * @param estante Integer
     */
    public Ubicacion(Integer pasillo, Integer estanteria, Integer estante) {
        this.pasillo = pasillo;
        this.estanteria = estanteria;
        this.estante = estante;
    }

    /**
     * Se crea un objeto Ubicacion con valores preterminados
     */
    public Ubicacion() {
    }
    
    /**
     * Retorna el pasillo de la ubicacion.
     * @return Integer
     */
    public int getPasillo() {
        return pasillo;
    }

    /**
     * Ingresa el pasillo de la ubicacion.
     * @param pasillo Integer
     */
    public void setPasillo(Integer pasillo) {
        this.pasillo = pasillo;
    }

    /**
     * Retorna la estanteria de la ubicacion.
     * @return Integer
     */
    public Integer getEstanteria() {
        return estanteria;
    }

    /**
     * Ingresa la estanteria de la ubicacion.
     * @param estanteria Integer
     */
    public void setEstanteria(Integer estanteria) {
        this.estanteria = estanteria;
    }

    /**
     * Retorna el estante de la ubicacion.
     * @return Integer
     */
    public Integer getEstante() {
        return estante;
    }

    /**
     * Ingresa el estante de la ubicacion
     * @param estante Integer
     */
    public void setEstante(Integer estante) {
        this.estante = estante;
    }

    /**
     * Retorna un String que representa el objeto.
     * @return String
     */
    @Override
    public String toString() {
        return String.format(" Pas.: %s,"
                + "%n Estanteria: %s,"
                + "%n Est: %s", 
                pasillo, estanteria, estante);
    }
    
}
