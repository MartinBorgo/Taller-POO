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
public class Obra {
    private ObraTipo tipoDeObra;
    private AreaTematicaTipo areaTematica;
    private int cantidadEjemplares;
    private String titulo;
    private String subtitulo;
    private String primerAutor;
    private String segundoAutor;
    private String tercerAutor;
    private String genero;
    private CaracteristicaTipo caracterisitica;
    private String indiceObra;
    private String areaReferencia;
    private int solicitudFacultad;
    private int solicitudGeneral;
    private int isbn;
    private Edicion edicion;
    private List<Ejemplar> ejemplares = new ArrayList();

    /**
     * Constructor para las obras que tienen tres autores
     * 
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
    public Obra(ObraTipo tipoDeObra, AreaTematicaTipo areaTematica, int cantidadEjemplares, String titulo, String subtitulo, String primerAutor,
                String segundoAutor, String tercerAutor, String genero, CaracteristicaTipo caracterisitica, String areaReferencia,
                int isbn, Edicion edicion) {
        
        this.tipoDeObra = tipoDeObra;
        this.areaTematica = areaTematica;
        this.cantidadEjemplares = cantidadEjemplares;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.primerAutor = primerAutor;
        this.segundoAutor = segundoAutor;
        this.tercerAutor = tercerAutor;
        this.genero = genero;
        this.caracterisitica = caracterisitica;
        this.areaReferencia = areaReferencia;
        this.isbn = isbn;
        this.edicion = edicion;
        this.solicitudFacultad = 0;
        this.solicitudGeneral = 0;
    }

    public Obra() {
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

    public String getSegundoAutor() {
        return segundoAutor;
    }

    public void setSegundoAutor(String segundoAutor) {
        this.segundoAutor = segundoAutor;
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

    public String getAreaReferencia() {
        return areaReferencia;
    }

    public void setAreaReferencia(String areaReferencia) {
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("Tipo obra: %s"
                + "%nArea tematica: %s"
                + "%nCantidad ejemplares: %d"
                + "%nTitulo: %s"
                + "%nSubtitulo: %s"
                + "%nPrimer autor: %s"
                + "%nSegundo autor: %s"
                + "%nTercer autor: %s"
                + "%nGenero: %s"
                + "%nCaracteristica: %s"
                + "%nIndice obra: %s"
                + "%nArea referencia: %s"
                + "%nSolicitud facultad: %d"
                + "%nSolicitud general: %d"
                + "%nISBN: %d"
                + "%nEdicion:%n%s", 
                tipoDeObra.getObraTipo(), 
                areaTematica.getAreaTematicaTipo(),
                cantidadEjemplares, titulo, subtitulo, 
                primerAutor, segundoAutor, tercerAutor,
                genero, caracterisitica.getCaracteristicaTipo(),
                indiceObra, areaReferencia, solicitudFacultad, 
                solicitudGeneral, isbn, edicion.toString());
    }
    
    
    public Edicion getEdicion() {
        return edicion;
    }

    public void setEdicion(Edicion edicion) {
        this.edicion = edicion;
    }
    
}
