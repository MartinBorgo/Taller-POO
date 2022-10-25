/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 * Contiene los distintos sexos que puede tener una persona.
 * @author martin
 */
public enum SexoTipo {

    /**
     * Persona de sexo masculino.
     */
    MASCULINO("Masculino."),

    /**
     * Persona de sexo femenino.
     */
    FEMENINO("Femenino.");
    
    private final String sexoTipo;

    /**
     * Constructor privado, se pueden usar solamente los tipo de sexos creados.
     * @param sexoTipo String
     */
    private SexoTipo(String sexoTipo) {
        this.sexoTipo = sexoTipo;
    }

    /**
     * Devuelve un objeto String con el sexo de la persona
     * @return String
     */
    public String getSexoTipo() {
        return sexoTipo;
    }
    
}
