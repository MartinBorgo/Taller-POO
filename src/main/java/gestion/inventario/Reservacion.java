/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import gestion.personas.Lector;
import java.time.LocalDate;

/**
 *
 * @author martin
 */
public class Reservacion {
    private LocalDate inicio;
    private LocalDate finalizacion;
    private Lector solicitante;

    public Reservacion(Lector lector, LocalDate inicio) {
        this.solicitante = lector;
        this.inicio = inicio;
        this.calcularFinReservacion();
        
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(LocalDate finalizacion) {
        this.finalizacion = finalizacion;
    }
    
    private void calcularFinReservacion() {
        this.finalizacion = this.inicio.plusDays(4);
    }
    
}
