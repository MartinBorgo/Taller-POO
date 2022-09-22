/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.AreaTematicaTipo;
import enumeraciones.CaracteristicaTipo;
import enumeraciones.ObraTipo;

/**
 *
 * @author martin
 */
public class Obra {
    private ObraTipo tipoDeObra;
    private AreaTematicaTipo areaTematica;
    private int cantidadEjemplares;
    private String titulo;
    private String subtitulo;
    private String primerAutor;
    private String segundAutor;
    private String tercerAutor;
    private String genero;
    private CaracteristicaTipo caracterisitica;
    private String indiceObra;
    private String [] areaReferencia;
    private int solicitudFacultad;
    private int solicitudGeneral;
    private int isbn;
    private Edicion edicion;  
    
}
