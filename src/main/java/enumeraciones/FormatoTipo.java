/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author martin
 */
public enum FormatoTipo {
    ELECTRONICO("Electronico."),
    DVD("DVD."),
    CD("CD."),
    PAPEL("Papel."),
    VIDEO("Video."),
    AUDIO("Audio.");
    
    private final String formato;

    private FormatoTipo(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }
    
}
