/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import enumeraciones.PrestamoTipo;
import gestion.personas.Bibliotecario;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author martin
 */
public class Prestamo {
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private int diasDePrestamo = 4;
    private PrestamoTipo tipoPrestamo;
    private Bibliotecario emisorPrestamo;
    private Bibliotecario reseptorPrestamo;
    private ArrayList<Reservacion> reservaciones = new ArrayList();

    public Prestamo(PrestamoTipo tipoPrestamo, Bibliotecario emisor) {
        if (tipoPrestamo == PrestamoTipo.DOMICILIO){
            this.tipoPrestamo = tipoPrestamo;
            this.emisorPrestamo = emisor;
            this.fechaInicio = LocalDate.now();
            this.calcularFinPrestamo();
        } else {
            this.tipoPrestamo = tipoPrestamo;
            this.emisorPrestamo = emisor;
            this.fechaInicio = LocalDate.now();
            this.fechaDevolucion = fechaInicio;
        }
    }

    public Prestamo() {
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
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

    public Bibliotecario getEmisorPrestamo() {
        return emisorPrestamo;
    }

    public void setEmisorPrestamo(Bibliotecario emisorPrestamo) {
        this.emisorPrestamo = emisorPrestamo;
    }

    public Bibliotecario getReseptorPrestamo() {
        return reseptorPrestamo;
    }

    public void setReseptorPrestamo(Bibliotecario reseptorPrestamo) {
        this.reseptorPrestamo = reseptorPrestamo;
    }

    public void agregarReservacion(Reservacion reservacion){
        this.reservaciones.add(reservacion);
    }
    
    /**
     * Metodo privado que sirve para calcular el dia en el que se tiene que devolver el prestamo
     */
    private void calcularFinPrestamo() {
        this.fechaDevolucion = this.fechaInicio.plusDays(this.diasDePrestamo);
    }
    
    
}
