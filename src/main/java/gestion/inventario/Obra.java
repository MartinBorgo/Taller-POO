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

    public Obra() {
    }

    public Obra(ObraTipo tipoDeObra, AreaTematicaTipo areaTematica, int cantidadEjemplares, String titulo, String subtitulo, String primerAutor, String segundAutor, String tercerAutor, String genero, CaracteristicaTipo caracterisitica, String indiceObra, String[] areaReferencia, int solicitudFacultad, int solicitudGeneral, int isbn) {
        this.tipoDeObra = tipoDeObra;
        this.areaTematica = areaTematica;
        this.cantidadEjemplares = cantidadEjemplares;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.primerAutor = primerAutor;
        this.segundAutor = segundAutor;
        this.tercerAutor = tercerAutor;
        this.genero = genero;
        this.caracterisitica = caracterisitica;
        this.indiceObra = indiceObra;
        this.areaReferencia = areaReferencia;
        this.solicitudFacultad = solicitudFacultad;
        this.solicitudGeneral = solicitudGeneral;
        this.isbn = isbn;
    }
    
    public ObraTipo getTipoDeObra() {
        return tipoDeObra;
    }

    public void setTipoDeObra(ObraTipo tipoDeObra) {
        this.tipoDeObra = tipoDeObra;
    }

    public AreaTematicaTipo getAreaTematica() {
        return areaTematica;
    }

    public void setAreaTematica(AreaTematicaTipo areaTematica) {
        this.areaTematica = areaTematica;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getPrimerAutor() {
        return primerAutor;
    }

    public void setPrimerAutor(String primerAutor) {
        this.primerAutor = primerAutor;
    }

    public String getSegundAutor() {
        return segundAutor;
    }

    public void setSegundAutor(String segundAutor) {
        this.segundAutor = segundAutor;
    }

    public String getTercerAutor() {
        return tercerAutor;
    }

    public void setTercerAutor(String tercerAutor) {
        this.tercerAutor = tercerAutor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public CaracteristicaTipo getCaracterisitica() {
        return caracterisitica;
    }

    public void setCaracterisitica(CaracteristicaTipo caracterisitica) {
        this.caracterisitica = caracterisitica;
    }

    public String getIndiceObra() {
        return indiceObra;
    }

    public void setIndiceObra(String indiceObra) {
        this.indiceObra = indiceObra;
    }

    public String[] getAreaReferencia() {
        return areaReferencia;
    }

    public void setAreaReferencia(String[] areaReferencia) {
        this.areaReferencia = areaReferencia;
    }

    public int getSolicitudFacultad() {
        return solicitudFacultad;
    }

    public void setSolicitudFacultad(int solicitudFacultad) {
        this.solicitudFacultad = solicitudFacultad;
    }

    public int getSolicitudGeneral() {
        return solicitudGeneral;
    }

    public void setSolicitudGeneral(int solicitudGeneral) {
        this.solicitudGeneral = solicitudGeneral;
    }

    public int getIsbnColeccion() {
        return isbn;
    }

    public void setIsbnColeccion(int isbn) {
        this.isbn = isbn;
    }
    
    
    
}
