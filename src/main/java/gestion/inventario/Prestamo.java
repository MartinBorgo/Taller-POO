/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.PrestamoTipo;
import gestion.personas.Lector;
import gestion.personas.Usuario;

import java.util.GregorianCalendar;


/**
 *
 * @author martin
 */
public class Prestamo {
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaDevolucion;
    private int diasDePrestamo = 4;
    private PrestamoTipo tipoPrestamo;
    private Usuario emisorPrestamo;
    private Usuario receptorPrestamo;
    private Ejemplar ejemplarSolicitado;
    private Lector lectorSolicita;

    public Prestamo(GregorianCalendar fechaInicio, PrestamoTipo tipoPrestamo, Usuario emisorPrestamo, Ejemplar ejemplarSolicitado, Lector lectorSolicita) {
        this.fechaInicio = fechaInicio;
        this.tipoPrestamo = tipoPrestamo;
        this.emisorPrestamo = emisorPrestamo;
        this.ejemplarSolicitado = ejemplarSolicitado;
        this.lectorSolicita = lectorSolicita;
    }

    public Prestamo() {
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(GregorianCalendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getDiasDePrestamo() {
        return diasDePrestamo;
    }

    public void setDiasDePrestamo(int diasDePrestamo) {
        this.diasDePrestamo = diasDePrestamo;
    }

    public PrestamoTipo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(PrestamoTipo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public Usuario getEmisorPrestamo() {
        return emisorPrestamo;
    }

    public void setEmisorPrestamo(Usuario emisorPrestamo) {
        this.emisorPrestamo = emisorPrestamo;
    }

    public Usuario getReceptorPrestamo() {
        return receptorPrestamo;
    }

    public void setReceptorPrestamo(Usuario receptorPrestamo) {
        this.receptorPrestamo = receptorPrestamo;
    }

    public Ejemplar getEjemplarSolicitado() {
        return ejemplarSolicitado;
    }

    public void setEjemplarSolicitado(Ejemplar ejemplarSolicitado) {
        this.ejemplarSolicitado = ejemplarSolicitado;
    }

    public Lector getLectorSolicita() {
        return lectorSolicita;
    }

    public void setLectorSolicita(Lector lectorSolicita) {
        this.lectorSolicita = lectorSolicita;
    }
    
    
}