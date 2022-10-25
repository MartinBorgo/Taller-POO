/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 * Esta enumeración contiene todas las caracteristicas que puede poseer una obra
 * @author martin
 */
public enum CaracteristicaTipo {

    /**
     * Caracteristica de la obra en este caso es un boletin.
     */
    BOLETIN("Boletin."),

    /**
     * Caracteristica de la obra en este caso es una coleccion.
     */
    COLECCION("Coleccion."),

    /**
     * Caracteristica de la obra en este caso es un compendio.
     */
    COMPENDIO("Compedio."),

    /**
     * Caracteristica de la obra en este caso es un diario.
     */
    DIARIO("Diario."),

    /**
     * Caracteristica de la obra en este caso es un diccionario.
     */
    DICCIONARIO("Diccionario."),

    /**
     * Caracteristica de la obra en este caso es un documental.
     */
    DOCUMENTAL("Documental."),

    /**
     * Caracteristica de la obra en este caso es un enciclopedia.
     */
    ENCICLOPEDIA("Enciclopedia."),

    /**
     * Caracteristica de la obra en este caso es un investigacion.
     */
    INVESTIGACION("Investigacion."),

    /**
     * Caracteristica de la obra en este caso es un monografia.
     */
    MONOGRAFIA("Monografia");
    
    private final String caracteristicaTipo;

    /**
     * Constructor privado, solo usar las caracteristicas creadas.
     * @param caracteristicaTipo String
     */
    private CaracteristicaTipo(String caracteristicaTipo) {
        this.caracteristicaTipo = caracteristicaTipo;
    }

    /**
     * Devuelve un objeto String con la caracteristica de la obra.
     * @return String
     */
    public String getCaracteristicaTipo() {
        return caracteristicaTipo;
    }
    
}
