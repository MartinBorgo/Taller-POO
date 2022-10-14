/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author martin
 */
public class LectorNoRegistradoError extends Exception {

    public LectorNoRegistradoError(String message) {
        super(message);
    }

    public LectorNoRegistradoError() {
    }
    
}
