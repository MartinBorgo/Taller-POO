/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import gestion.personas.Lector;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author martin
 */
public class Ejemplar {
    private static int incremental = 1;
    
    private int idUnico;
    private String observaciones;
    private GregorianCalendar fechaAdquisicion;
    private String formaAdquisicion;
    private GregorianCalendar fechaBaja;
    private String motivoBaja;
    private String ubicacionBaja;
    private boolean enPrestamo;
    private Ubicacion ubicacion;
    private Prestamo prestamo;
    private Obra obra;
    private ArrayList<Lector> listaLectores = new ArrayList();
    private Coleccion coleccion; //PUEDE PERTENECER A UNA COLECCION.
    private List<Reservacion> reservaciones = new ArrayList();
   
    public Ejemplar(GregorianCalendar fechaAdquisicion, String formaAdquisicion, Ubicacion ubicacion) {
        this.idUnico = incremental;
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        this.ubicacion = ubicacion;
        this.enPrestamo = false;
        
        incremental++;
    }

    public Ejemplar() {
        incremental++;
    }

    public static int getIncremental() {
        return incremental;
    }

    public static void setIncremental(int incremental) {
        Ejemplar.incremental = incremental;
    }

    public int getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public GregorianCalendar getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(GregorianCalendar fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getFormaAdquisicion() {
        return formaAdquisicion;
    }

    public void setFormaAdquisicion(String formaAdquisicion) {
        this.formaAdquisicion = formaAdquisicion;
    }

    public GregorianCalendar getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(GregorianCalendar fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public String getUbicacionBaja() {
        return ubicacionBaja;
    }

    public void setUbicacionBaja(String ubicacionBaja) {
        this.ubicacionBaja = ubicacionBaja;
    }

    public boolean isEnPrestamo() {
        return enPrestamo;
    }

    public void setEnPrestamo(boolean enPrestamo) {
        this.enPrestamo = enPrestamo;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void agregarLector(Lector lector) {
        this.listaLectores.add(lector);
    }

    @Override
    public String toString() {
        return String.format("Id ejemplar: %s"
                + "%nFecha adquisicion: %s/%s/%s"
                + "%nForma adquisicion: %s"
                + "%nEn prestamo: %s"
                + "%nUbicacion:%n%s", idUnico, fechaAdquisicion.get(Calendar.YEAR), fechaAdquisicion.get(Calendar.MONTH), 
                fechaAdquisicion.get(Calendar.DAY_OF_MONTH), formaAdquisicion, enPrestamo, ubicacion);
    }
 
    
}