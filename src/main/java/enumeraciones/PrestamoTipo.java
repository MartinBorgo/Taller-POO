/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 * Contiene los tipos de prestamo que pueden usarse en un ejemplar.
 * @author martin
 */
public enum PrestamoTipo {

    /**
     * Prestamo en sala del ejemplar.
     */
    SALA("Sala."),

    /**
     * Prestamo en domicilio del ejemplar.
     */
    DOMICILIO("Domicilio.");
    
    private final String prestamoTipo;

    /**
     * Constructor privado, solamente se pueden usar los tipos de prestamos creados.
     * @param prestamoTipo String
     */
    private PrestamoTipo(String prestamoTipo) {
        this.prestamoTipo = prestamoTipo;
    }

    /**
     * Devuelve un objeto String del tipo de prestamo del ejemplar
     * @return String
     */
    public String getPrestamoTipo() {
        return prestamoTipo;
    }
    
}
