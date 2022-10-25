/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Esta clase se encarga cuando no existe un prestamo.
 * @author Grupo 2
 */
public class PrestamoInexistenteError extends Exception{
    
    /**
     * Constructor que recibe un String y se encarga de enviar un mensaje con la excepcion.
     * @param message String
     */
    public PrestamoInexistenteError(String message) {
        super(message);
    }
    
    /**
     * Constructor con los valores predeterminados.
     */
    public PrestamoInexistenteError() {
    }
}
