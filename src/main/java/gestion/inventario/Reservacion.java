/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import gestion.personas.Lector;
import java.util.GregorianCalendar;

/**
 *
 * @author martin
 */
public class Reservacion {
    private GregorianCalendar inicio;
    private GregorianCalendar finalizacion;
    private Lector solicitante;
    
    public Reservacion(Lector lector, GregorianCalendar inicio) {
        this.solicitante = lector;
        this.inicio = inicio;
        
        inicio.add(3, 4);
        this.finalizacion = inicio;
        
    }

    public GregorianCalendar getInicio() {
        return inicio;
    }

    public void setInicio(GregorianCalendar inicio) {
        this.inicio = inicio;
    }

    public GregorianCalendar getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(GregorianCalendar finalizacion) {
        this.finalizacion = finalizacion;
    }

    public Lector getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Lector solicitante) {
        this.solicitante = solicitante;
    }
    
}
