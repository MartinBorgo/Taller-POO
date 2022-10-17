/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 * Esta enumeracion contiene todos los tipos de formato que puede tener una obra.
 * @author martin
 */
public enum FormatoTipo {

    /**
     * Formato de tipo electronico para la obra.
     */
    ELECTRONICO("Electronico."),

    /**
     * Formato de tipo DVD para la obra.
     */
    DVD("DVD."),

    /**
     * Formato de tipo CD para la obra.
     */
    CD("CD."),

    /**
     * Formato de tipo papel para la obra.
     */
    PAPEL("Papel."),

    /**
     * Formato de tipo video para la obra.
     */
    VIDEO("Video."),

    /**
     * Formato de tipo audio para la obra.
     */
    AUDIO("Audio.");
    
    private final String formato;

    /**
     * Constructor privado, usar solamente los formatos creados.
     * @param formato String
     */
    private FormatoTipo(String formato) {
        this.formato = formato;
    }

    /**
     * Devuelve un objeto string con el formato.
     * @return String
     */
    public String getFormato() {
        return formato;
    }
    
}
