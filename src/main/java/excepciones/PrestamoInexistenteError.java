/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author martin
 */
public class PrestamoInexistenteError extends Exception{
    
    public PrestamoInexistenteError(String message) {
        super(message);
    }
    
    public PrestamoInexistenteError() {
    }
}
