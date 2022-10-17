/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author martin
 * Esta enumeración contiene a las areas tematicas a las que puede pertenecer un libro
 */
public enum AreaTematicaTipo {

    /**
     * Tipo de area tematica del libro en este caso matematicas.
     */
    MATEMATICAS("Matematica."),

    /**
     * Tipo de area tematica del libro en este caso sistemas operativos.
     */
    SISTEMAS_OPERATIVOS("Sistemas operativos."),

    /**
     * Tipo de area tematica del libro en este caso programacion.
     */
    PROGRAMACION("Programacion."),

    /**
     * Tipo de area tematica del libro en este caso contabilidad.
     */
    CONTABILIDAD("Contabilidad."),

    /**
     * Tipo de area tematica del libro en este caso administracion de empresas.
     */
    ADMINISTRACION_DE_EMPRESAS("Administracion de empresas.");
    
    private final String areaTematicaTipo;
    
    /**
     * Constructor privado, solo se pueden usar los tipos especificados.
     * @param areaTematicaTipo String
     */
    private AreaTematicaTipo(String areaTematicaTipo){
        this.areaTematicaTipo = areaTematicaTipo;
    }

    /**
     * Devuelve un objeto String con el area tematica de la obra.
     * @return String
     */
    public String getAreaTematicaTipo() {
        return areaTematicaTipo;
    }
}
