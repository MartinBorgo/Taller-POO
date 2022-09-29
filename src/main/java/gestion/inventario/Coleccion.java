/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.AreaTematicaTipo;
import enumeraciones.CaracteristicaTipo;
import enumeraciones.ObraTipo;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author martin
 */
public class Coleccion extends Obra {
    private int isbnColeccion;
    private String nombreColeccion;
    private List<Ejemplar> ejemplares = new ArrayList();

    public Coleccion(int isbnColeccion, String nombre, ObraTipo tipoDeObra, AreaTematicaTipo areaTematica, int cantidadEjemplares, String titulo, String subtitulo, String primerAutor, String segundAutor, String tercerAutor, String genero, CaracteristicaTipo caracterisitica, String areaReferencia, int isbn, Edicion edicion) {
        super(tipoDeObra, areaTematica, cantidadEjemplares, titulo, subtitulo, primerAutor, segundAutor, tercerAutor, genero, caracterisitica, areaReferencia, isbn, edicion);
        this.isbnColeccion = isbnColeccion;
        this.nombreColeccion = nombre;
    }


    public Coleccion() {
    }

    public int getIsbnColeccion() {
        return isbnColeccion;
    }

    public void setIsbnColeccion(int isbnColeccion) {
        this.isbnColeccion = isbnColeccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombre) {
        this.nombreColeccion = nombre;
    }

    @Override
    public String toString() {
        return String.format("ISBN coleccion: %s"
                + "%nNombre coleccion: %s", 
                isbnColeccion, nombreColeccion);
    }
    
    
}
