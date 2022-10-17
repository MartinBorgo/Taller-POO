/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 * Contiene los tipos de obra que pueden ser.
 * @author martin
 */
public enum ObraTipo {

    /**
     * La obra puede ser un libro.
     */
    LIBRO("Libro."),

    /**
     * La obra puede ser una revista.
     */
    REVISTA("Revista."),

    /**
     * La obra puede ser un ensayo.
     */
    ENSAYO("Ensayo."),

    /**
     * La obra puede ser una tesis.
     */
    TESIS("Tesis."),

    /**
     * La obra puede ser un manual.
     */
    MANUAL("Manual.");
    
    private final String obraTipo;

    /**
     * Constructor privado, solo se pueden usar las tipos de obras creados.
     * @param obraTipo 
     */
    private ObraTipo(String obraTipo) {
        this.obraTipo = obraTipo;
    }

    /**
     * Devuelve un objeto String con el tipo de obra.
     * @return String
     */
    public String getObraTipo() {
        return obraTipo;
    }
    
}
