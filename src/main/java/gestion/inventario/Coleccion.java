/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.AreaTematicaTipo;
import enumeraciones.CaracteristicaTipo;
import enumeraciones.ObraTipo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author martin
 */
public class Coleccion extends Obra implements Serializable {
    private int isbnColeccion;
    private String nombreColeccion;
    private List<Ejemplar> ejemplares;

    /**
     * Construye un objeto Coleccion con toda la informacion pasada por parametros
     * 
     * @param isbnColeccion
     * @param nombre
     * @param tipoDeObra
     * @param areaTematica
     * @param cantidadEjemplares
     * @param titulo
     * @param subtitulo
     * @param primerAutor
     * @param segundAutor
     * @param tercerAutor
     * @param genero
     * @param caracterisitica
     * @param areaReferencia
     * @param isbn
     * @param edicion 
     */
    public Coleccion(int isbnColeccion, String nombre, ObraTipo tipoDeObra, AreaTematicaTipo areaTematica, int cantidadEjemplares,
                     String titulo, String subtitulo, String primerAutor, String segundAutor, String tercerAutor, String genero,
                     CaracteristicaTipo caracterisitica, String areaReferencia, int isbn, Edicion edicion) {
        
        super(tipoDeObra, areaTematica, cantidadEjemplares, titulo, subtitulo, primerAutor, segundAutor, tercerAutor, genero, caracterisitica, areaReferencia, isbn, edicion);
        
        this.isbnColeccion = isbnColeccion;
        this.nombreColeccion = nombre;
        this.ejemplares = new ArrayList();
    }

    /**
     * Construye un objeto Coleccion con todos los valores por defecto
     */
    public Coleccion() {
    }

    /**
     * Devuelve el ISBN de la coleccion
     * 
     * @return int 
     */
    public int getIsbnColeccion() {
        return isbnColeccion;
    }

    /**
     * Setea el ISBN de la coleccion
     * 
     * @param isbnColeccion 
     */
    public void setIsbnColeccion(int isbnColeccion) {
        this.isbnColeccion = isbnColeccion;
    }

    /**
     * Devuelve el nombre de la coleccion
     * 
     * @return String
     */
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    /**
     * Setea un nuevo nombre para la coleccion
     * 
     * @param nombre 
     */
    public void setNombreColeccion(String nombre) {
        this.nombreColeccion = nombre;
    }
    
    // ========== Metodos hechos a mano ========== //
    
    /**
     * Agrega un ejemplar que pertenece a dicha coleccion
     * 
     * @param e 
     */
    public void agregarEjemplar(Ejemplar e) {
        this.ejemplares.add(e);
    }

    /**
     * Devuelve la representacion del objeto Coleccion
     * 
     * @return String
     */
    @Override
    public String toString() {
        return String.format("ISBN coleccion: %s"
                + "%nNombre coleccion: %s", 
                isbnColeccion, nombreColeccion);
    }
    
    
}
