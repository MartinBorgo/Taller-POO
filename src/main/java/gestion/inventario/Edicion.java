/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.FormatoTipo;

/**
 *
 * @author martin
 */
public class Edicion {
    private String editorial;
    private String paisEdicion;
    private  int numeroEdicion;
    private int anio;
    private int volumenes;
    private int paginas;
    private String idioma;
    private FormatoTipo formato;

    public Edicion(String editorial, String paisEdicion, int numeroEdicion, int anio, int volumenes, int paginas, String idioma, FormatoTipo formato) {
        this.editorial = editorial;
        this.paisEdicion = paisEdicion;
        this.numeroEdicion = numeroEdicion;
        this.anio = anio;
        this.volumenes = volumenes;
        this.paginas = paginas;
        this.idioma = idioma;
        this.formato = formato;
    }

    public Edicion() {
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPaisEdicion() {
        return paisEdicion;
    }

    public void setPaisEdicion(String paisEdicion) {
        this.paisEdicion = paisEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getVolumenes() {
        return volumenes;
    }

    public void setVolumenes(int volumenes) {
        this.volumenes = volumenes;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public FormatoTipo getFormato() {
        return formato;
    }

    public void setFormato(FormatoTipo formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        
                return String.format("Editorial: %s"
                        + "%nAnio: %d", 
                editorial,anio);
                
//        return String.format("Editorial: %s"
//                + "%nPais edicion: %s"
//                + "%nNumero de edicion: %d"
//                + "%nAnio: %d"
//                + "%nVolumenes: %d"
//                + "%nPaginas: %d"
//                + "%nIdioma: %s"
//                + "%nFormato: %s", 
//                editorial, paisEdicion, numeroEdicion, 
//                anio, volumenes, paginas, 
//                idioma, formato.getFormato());
    }
    
}
