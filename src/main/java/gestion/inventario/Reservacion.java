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
 * @author Grupo 2
 */
public class Reservacion implements Serializable{
    private GregorianCalendar inicio;
    private GregorianCalendar finalizacion;
    private Ejemplar ejemplarReservado;
    private Lector solicitante;
    /**
     * 
     * @param lector Lector
     * @param ejemplar Ejemplar
     * @param inicio GregorianCalendar
     */
    public Reservacion(Lector lector, Ejemplar ejemplar, GregorianCalendar inicio) {
        this.solicitante = lector;
        this.inicio = inicio;
        
        inicio.add(3, 4);
        this.finalizacion = inicio;
        
        this.ejemplarReservado = ejemplar;
        ejemplar.agregarReservacion(this);
        
    }
    
    /**
     * Retorna la fecha de inicio.
     * @return GregorianCalendar
     */
    public GregorianCalendar getInicio() {
        return inicio;
    }
    
    /**
     * Ingresa una fecha de inicio de la reservacion
     * @param inicio GregorianCalendar
     */
    public void setInicio(GregorianCalendar inicio) {
        this.inicio = inicio;
    }

    /**
     * Retorna la fecha de finalizacion de la reservacion
     * @return GregorianCalendar
     */
    public GregorianCalendar getFinalizacion() {
        return finalizacion;
    }

    /**
     * Ingresa una fecha de finalizacion de la reservacion
     * @param finalizacion GregorianCalendar
     */
    public void setFinalizacion(GregorianCalendar finalizacion) {
        this.finalizacion = finalizacion;
    }

    /**
     * Retorna el ejemplar reservado.
     * @return Ejemplar
     */
    public Ejemplar getEjemplarReservado() {
        return ejemplarReservado;
    }

    /**
     * Ingresa un ejemplar reservado.
     * @param ejemplarReservado Ejemplar
     */
    public void setEjemplarReservado(Ejemplar ejemplarReservado) {
        this.ejemplarReservado = ejemplarReservado;
    }
    
    /**
     * Retorna el lector solicitante de la reservacion.
     * @return Lector
     */
    public Lector getSolicitante() {
        return solicitante;
    }

    /**
     * Ingresa el lector solicitante
     * @param solicitante Lector
     */
    public void setSolicitante(Lector solicitante) {
        this.solicitante = solicitante;
    }
    
}
