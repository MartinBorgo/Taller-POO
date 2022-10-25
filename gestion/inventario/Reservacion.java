/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import gestion.personas.Lector;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase reservacion de ejemplar.
 * @author Grupo 2
 */
public class Reservacion implements Serializable{
    private GregorianCalendar inicio;
    private GregorianCalendar finalizacion;
    private Ejemplar ejemplarReservado;
    private Lector solicitante;
   
    /**
     *Construye un objeto Reservacion con sus valores inicializados 
     * @param lector Lector
     * @param ejemplar Ejemplar
     * @param inicio GregorianCalendar
     */
    public Reservacion(Lector lector, Ejemplar ejemplar, GregorianCalendar inicio) {
        this.solicitante = lector;
        this.ejemplarReservado = ejemplar;
        this.inicio = inicio;
        this.finalizacion = new GregorianCalendar(inicio.get(Calendar.YEAR), inicio.get(Calendar.MONTH), inicio.get(Calendar.DAY_OF_MONTH) + 4);
        
        ejemplar.agregarReservacion(this);
    }

    /**
     * Construye un objeto Reservacion con sus valores por defecto
     */
    public Reservacion() {
    }
    
    /**
     * Retorna la fecha de inicio de la reservacion.
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
