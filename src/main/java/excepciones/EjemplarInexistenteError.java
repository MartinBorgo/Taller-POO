/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Esta clase se encarga de tirar un mensaje de excepcion si el ejemplar resulta inexistente.
 * @author martin
 */
public class EjemplarInexistenteError extends Exception {

    /**
     * El constructor recibe un String para la creacion de la excepcion.
     * @param message String
     */
    public EjemplarInexistenteError(String message) {
        super(message);
    }

    /**
     * Constructor con valores preterminados.
     */
    public EjemplarInexistenteError() {
    }

}
