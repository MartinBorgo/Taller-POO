/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author martin
 */
public enum SexoTipo {
    MASCULINO("Masculino."),
    FEMENINO("Femenino.");
    
    private final String sexoTipo;

    private SexoTipo(String sexoTipo) {
        this.sexoTipo = sexoTipo;
    }

    public String getSexoTipo() {
        return sexoTipo;
    }
    
}
