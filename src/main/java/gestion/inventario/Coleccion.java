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
 * Clase coleccion.
 * @author Grupo 2
 */
public class Coleccion extends Obra implements Serializable {
    private Integer isbnColeccion;
    private String nombreColeccion;
    private List<Ejemplar> ejemplares;

    /**
     * Construye un objeto Coleccion con todos sus valores inicializados
     * 
     * @param isbnColeccion Integer
     * @param nombre String
     * @param tipoDeObra ObraTipo
     * @param areaTematica String
     * @param cantidadEjemplares Integer
     * @param titulo String
     * @param subtitulo String
     * @param primerAutor String
     * @param segundAutor String
     * @param tercerAutor String
     * @param genero String
     * @param caracterisitica CaracteristicaTipo
     * @param areaReferencia String
     * @param isbn Integer
     * @param edicion Edicion
     */
    public Coleccion(Integer isbnColeccion, String nombre, ObraTipo tipoDeObra, AreaTematicaTipo areaTematica, Integer cantidadEjemplares,
                     String titulo, String subtitulo, String primerAutor, String segundAutor, String tercerAutor, String genero,
                     CaracteristicaTipo caracterisitica, String areaReferencia, Integer isbn, Edicion edicion) {
        
        super(tipoDeObra, areaTematica, cantidadEjemplares, titulo, subtitulo, primerAutor, segundAutor, tercerAutor, genero, caracterisitica, areaReferencia, isbn, edicion);
        
        this.isbnColeccion = isbnColeccion;
        this.nombreColeccion = nombre;
        this.ejemplares = new ArrayList();
    }

    /**
     * Construye un objeto Coleccion con todos los valores por defecto
     */
    public Coleccion() {
        this.ejemplares = new ArrayList();
    }

    /**
     * Devuelve el ISBN de la coleccion
     * 
     * @return Integer 
     */
    public Integer getIsbnColeccion() {
        return isbnColeccion;
    }

    /**
     * Setea el ISBN de la coleccion
     * 
     * @param isbnColeccion Integer
     */
    public void setIsbnColeccion(Integer isbnColeccion) {
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
     * @param nombre String
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
