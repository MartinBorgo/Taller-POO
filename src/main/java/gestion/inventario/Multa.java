/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import gestion.personas.Lector;
import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author martin
 */
public class Multa implements Serializable{
    private Lector personaMultada;
    private GregorianCalendar inicio;
    private GregorianCalendar finalizacion;

    /**
     * Construye un objeto Multa con todas su exprecion
     * 
     * @param inicio 
     */
    public Multa(GregorianCalendar inicio, Lector personaMultada) {
        this.inicio = inicio;
        this.personaMultada = personaMultada;
        
        personaMultada.agregarMulta(this);
        
        inicio.add(3, 30);  // Se le suma a la fecha de inicio los dias que va a esta multado
        this.finalizacion = inicio;
    }

    /**
     * construye un objeto Multa con sus valores por defecto
     */
    public Multa() {
    }

    /**
     * Devuelve la fecha en la que se inicio la Multa
     * 
     * @return GregorianCalendar 
     */
    public GregorianCalendar getInicio() {
        return inicio;
    }

    /**
     * Setea una nueva fecha de inicio para el prestamo
     * 
     * @param inicio 
     */
    public void setInicio(GregorianCalendar inicio) {
        this.inicio = inicio;
        
        inicio.add(3, 30);
        this.finalizacion = inicio;
    }

    /**
     * Devuelve la fecha a la que finalizara o finalizo la Multa
     * 
     * @return GregorianCalendar 
     */
    public GregorianCalendar getFinalizacion() {
        return finalizacion;
    }

    /**
     * Setea una nueva fecha de finalizacion para la Multa
     * 
     * @param finalizacion
     */
    public void setFinalizacion(GregorianCalendar finalizacion) {
        this.finalizacion = finalizacion;
    }

    /**
     * Devulve el lector al que se le puso la multa
     * 
     * @return Lector
     */
    public Lector getPersonaMultada() {
        return personaMultada;
    }

    /**
     * Setea un nuevo lector para la multa
     * 
     * @param personaMultada 
     */
    public void setPersonaMultada(Lector personaMultada) {
        this.personaMultada = personaMultada;
    }
    
    

}
