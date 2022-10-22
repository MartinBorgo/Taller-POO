/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.FormatoTipo;
import java.io.Serializable;

/**
 *
 * @author Grupo 2
 */
public class Edicion implements Serializable{
    private String editorial;
    private String paisEdicion;
    private Integer numeroEdicion;
    private Integer anio;
    private Integer volumenes;
    private Integer paginas;
    private String idioma;
    private FormatoTipo formato;

    /**
     * Construye un objeto Edicion con todos sus valores inicalizados.
     * 
     * @param editorial String
     * @param paisEdicion String
     * @param numeroEdicion int
     * @param anio int
     * @param volumenes int
     * @param paginas int
     * @param idioma String
     * @param formato FormatoTipo
     */
    public Edicion(String editorial, String paisEdicion, Integer numeroEdicion, Integer anio, Integer volumenes, Integer paginas, String idioma, FormatoTipo formato) {
        this.editorial = editorial;
        this.paisEdicion = paisEdicion;
        this.numeroEdicion = numeroEdicion;
        this.anio = anio;
        this.volumenes = volumenes;
        this.paginas = paginas;
        this.idioma = idioma;
        this.formato = formato;
    }
    
    /**
     * Construye un objeto Edicion con valores por defecto.
     */
    public Edicion() {
    }
    
    /**
     * Devuelve la editorial de la edicion.
     * @return String
     */
    public String getEditorial() {
        return editorial;
    }
    
    /**
     * Ingresa la editorial de la edicion.
     * @param editorial String
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    /**
     * Devuelve el pais de edicion.
     * @return String
     */
    public String getPaisEdicion() {
        return paisEdicion;
    }
    
    /**
     * Ingresa el pais de la edicion.
     * @param paisEdicion String
     */
    public void setPaisEdicion(String paisEdicion) {
        this.paisEdicion = paisEdicion;
    }

    /**
     * Devuelve el numero de edicion.
     * @return Integer
     */
    public Integer getNumeroEdicion() {
        return numeroEdicion;
    }

    /**
     * Ingresa el numero de edicion.
     * @param numeroEdicion Integer
     */
    public void setNumeroEdicion(Integer numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    /**
     * Devuelve el año de edicion de la coleccion.
     * @return Integer
     */
    public Integer getAnio() {
        return anio;
    }

    /**
     * Ingresa el año de la edicion.
     * @param anio Integer
     */
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    /**
     * Devuelve la cantidad de volumenes de la edicion.
     * @return Integer
     */
    public Integer getVolumenes() {
        return volumenes;
    }

    /**
     * Ingresa la cantidad de volumenes que contiene la edicion.
     * @param volumenes Integer
     */
    public void setVolumenes(Integer volumenes) {
        this.volumenes = volumenes;
    }

    /**
     * Devuelve las paginas que contiene la edicion.
     * @return Integer
     */
    public Integer getPaginas() {
        return paginas;
    }

    /**
     * Ingresa las paginas que contiene la edicion.
     * @param paginas Integer
     */
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    /**
     * Retorna el idioma de la edicion.
     * @return String
     */
    public String getIdioma() {
        return idioma;
    }
    
    /**
     * Ingresa un idioma a la edicion.
     * @param idioma String
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Retorna el formato de la edicion.
     * @return FormatoTipo
     */
    public FormatoTipo getFormato() {
        return formato;
    }

    /**
     * Ingresa un formato a la edicion.
     * @param formato FormatoTipo
     */
    public void setFormato(FormatoTipo formato) {
        this.formato = formato;
    }

    /**
     * Devuelve un objeto de tipo String que representa al objeto.
     * @return String
     */
    @Override
    public String toString() {
        
                return String.format("Editorial: %s |"
                        + "%n Año: %d", 
                editorial,anio);
    }
    
}
