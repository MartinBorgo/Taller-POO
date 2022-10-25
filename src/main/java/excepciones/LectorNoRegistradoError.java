/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Esta clase se encarga de tirar una excepcion si el lector no esta registrado.
 * @author Grupo 2
 */
public class LectorNoRegistradoError extends Exception {

    /**
     * Constructor que recibe un String y se encarga de enviar un mensaje con la excepcion.
     * @param message String
     */
    public LectorNoRegistradoError(String message) {
        super(message);
    }

    /**
     * Constructor con los valores preterminados.
     */
    public LectorNoRegistradoError() {
    }
    
}
