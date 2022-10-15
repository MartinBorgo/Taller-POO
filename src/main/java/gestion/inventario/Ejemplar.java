/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import gestion.personas.Lector;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import net.sourceforge.barbecue.*;
import net.sourceforge.barbecue.output.*;

/**
 *
 * @author martin
 */
public class Ejemplar implements Serializable{
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
    private Prestamo infoPrestamo;
    private Obra obra;
    private Coleccion coleccion; //PUEDE PERTENECER A UNA COLECCION.
    private List<Lector> listaSolicitudLectores = new ArrayList();
    private List<Reservacion> reservaciones = new ArrayList();
    private String codigoBarras;
   
    /**
     * Construye un objeto ejemplar con la informacion basica a la hora de su adquisicion
     * 
     * @param fechaAdquisicion
     * @param formaAdquisicion
     * @param ubicacion
     * @param obra 
     */
    
    //Puede agarrar excepciones del metodo setCodigoBarras();
    public Ejemplar(GregorianCalendar fechaAdquisicion, String formaAdquisicion, Ubicacion ubicacion, Obra obra) 
            throws BarcodeException, OutputException {
        this.idUnico = incremental;
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        this.ubicacion = ubicacion;
        this.obra = obra;
        this.enPrestamo = false;
        
        obra.agregarEjemplar(this); // Se mantiene la relacion entre ejemplar y Obra
        this.setCodigoBarras();
        
        incremental++;
    }

    /**
     * Construye un objeto Ejemplar con la informacion basica a la hora de la adquisicion
     * 
     * @param fechaAdquisicion
     * @param formaAdquisicion
     * @param ubicacion
     * @param coleccion 
     */
    
    //Puede agarrar excepciones del metodo setCodigoBarras();
    public Ejemplar(GregorianCalendar fechaAdquisicion, String formaAdquisicion, Ubicacion ubicacion, Coleccion coleccion) 
            throws BarcodeException, OutputException {
        this.idUnico = incremental;
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        this.ubicacion = ubicacion;
        this.coleccion = coleccion;
        
        coleccion.agregarEjemplar(this);
        
        this.setCodigoBarras();
        incremental++;
    }

    /**
     * Construye un objeto ejemplar si settear ningun tipo de dato
     */
    public Ejemplar() {
        incremental++;
    }

    /**
     * Devuelve el codigo identificador de el ejemplar
     * @return int
     */
    public int getIdUnico() {
        return idUnico;
    }

    /**
     * Setea El codigo unico con el valor pasado por aparametro
     * 
     * @param idUnico 
     */
    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    /**
     * Devuelve las observaciones que se realizaron a ese ejemplar
     * 
     * @return String
     */
    public String getObservaciones() {
        return observaciones;
    }

    
    /**
     * Setea una observacion a el ejemplar
     * 
     * @param observacion
     */
    public void setObservaciones(String observacion) {
        this.observaciones = observacion;
    }

    /**
     * Devuleve la fecha de adquisicion del ejemplar
     * 
     * @return GregorianCalendar 
     */
    public GregorianCalendar getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    /**
     * Setea la fecha de adquisicion del ejemplar con la fecha pasada por parametros
     * 
     * @param fechaAdquisicion 
     */
    public void setFechaAdquisicion(GregorianCalendar fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    /**
     * Devuelve la forma en la que se adquirio el ejemplar
     * 
     * @return String
     */
    public String getFormaAdquisicion() {
        return formaAdquisicion;
    }

    /**
     * Setea la forma en la que se adquirio el ejemplar
     * 
     * @param formaAdquisicion 
     */
    public void setFormaAdquisicion(String formaAdquisicion) {
        this.formaAdquisicion = formaAdquisicion;
    }

    /**
     * Devuelve la fecha en la que se dio de baja al ejemplar
     * 
     * @return GregorianCalendar 
     */
    public GregorianCalendar getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Setea la fecha de baja del ejemplar con la fecha pasada por parametro
     * 
     * @param fechaBaja 
     */
    public void setFechaBaja(GregorianCalendar fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    /**
     * Devuelve el motivo de la baja del ejemplar
     * 
     * @return String
     */
    public String getMotivoBaja() {
        return motivoBaja;
    }

    /**
     * Setea el motivo de la baja del ejemplar con lo pasado por parametro
     * 
     * @param motivoBaja 
     */
    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    /**
     * Devuelve la ubicacion en la que se encuentra el ejemplar dado de baja
     * 
     * @return String 
     */
    public String getUbicacionBaja() {
        return ubicacionBaja;
    }

    /**
     * Setea la ubicaion de baja del ejemplar por lo pasado en parametro
     * 
     * @param ubicacionBaja 
     */
    public void setUbicacionBaja(String ubicacionBaja) {
        this.ubicacionBaja = ubicacionBaja;
    }

    /**
     * Devuelve el estado del ejemplar:
     * true -> Esta en prestamo
     * false -> Esta disponible
     * 
     * @return boolean 
     */
    public boolean isEnPrestamo() {
        return enPrestamo;
    }

    /**
     * Setea el estado del del ejemplar con el valor pasado por parametro
     * true -> El ejemplar pasa a estar en prestamo
     * false -> El ejemplar pasa a estar disponible
     * 
     * @param enPrestamo 
     */
    public void setEnPrestamo(boolean enPrestamo) {
        this.enPrestamo = enPrestamo;
    }

    /**
     * Devuelve la ubicacion en la que se encuentra el ejemplar en la biblioteca
     * 
     * @return Ubicacion
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Setea la ubicacion en la que se encuentra el libro
     * 
     * @param ubicacion 
     */
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     * Devuelve la un objeto de tipo Prestamo, con toda la informacion de este mismo
     * 
     * @return Prestamo
     */
    public Prestamo getInfoPrestamo() {
        return infoPrestamo;
    }

    /**
     * Setea un prestamo para el ejemplar
     * 
     * @param infoPrestamo 
     */
    public void setInfoPrestamo(Prestamo infoPrestamo) {
        this.infoPrestamo = infoPrestamo;
        this.enPrestamo = true;
    }

    /**
     * Devuelve la Obra de la que es elejemplar
     * 
     * @return Obra
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * Setea la obra del ejemplar
     * 
     * @param obra 
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * Devuevlve la coleccion a la que pertenece el ejemplar
     * 
     * @return Coleccion
     */
    public Coleccion getColeccion() {
        return coleccion;
    }

    /**
     * Setea un nuevo coleccion para el ejemplar
     * 
     * @param coleccion 
     */
    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    /**
     * Devuelve la lista de todos los lectores que solicitaron este ejemplar
     * 
     * @return List<Lector>
     */
    public List<Lector> getListaSolicitudLectores() {
        return listaSolicitudLectores;
    }

    /**
     * Setea una nueva lista de lector que tomo en prestamo el ejemplar 
     * 
     * @param listaSolicitudLectores List<Lector>
     */
    public void setListaSolicitudLectores(List<Lector> listaSolicitudLectores) {
        this.listaSolicitudLectores = listaSolicitudLectores;
    }

    /**
     * Devuelve la lista de las reservaciones que tiene el ejemplar
     * 
     * @return Lista de todas las reservaciones del ejemplar
     */
    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    /**
     * Setea una nueva lista de resercaciones para el ejemplar
     * 
     * @param reservaciones 
     */
    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }
    
    // ========== Metodos hechos a mano ========== //
    
    /**
     * Agrega un lector a la lista de personas que solicitaron este ejemplar alguna vez
     * 
     * @param lector 
     */
    public void agregarLector(Lector lector) {
        this.listaSolicitudLectores.add(lector);
    }
    
    /**
     * Agrega una reservacion a la lista de reservaciones que hay de el ejemplar en cuestion
     * 
     * @param reservacion 
     */
    public void agregarReservacion(Reservacion reservacion) {
        this.reservaciones.add(reservacion);
    }
    
    /**
     * Devuelve un String que representa de forma conceptual al objeto
     * 
     * @return String 
     */
    @Override
    public String toString() {
        return String.format("Id ejemplar: %s"
                + "%nFecha adquisicion: %s/%s/%s"
                + "%nForma adquisicion: %s"
                + "%nEn prestamo: %s"
                + "%nUbicacion:%n%s", idUnico, fechaAdquisicion.get(Calendar.YEAR), fechaAdquisicion.get(Calendar.MONTH), 
                fechaAdquisicion.get(Calendar.DAY_OF_MONTH), formaAdquisicion, enPrestamo, ubicacion);
    }
    
    public void setCodigoBarras() throws BarcodeException, OutputException{
        String idAux = Integer.toString(this.idUnico);
        Barcode bar = BarcodeFactory.createCode128(idAux);
        File archivo = new File("src/main/java/codigoDeBarras/" + idAux + ".png");
        
        BarcodeImageHandler.savePNG(bar, archivo);
        this.codigoBarras = bar.getLabel();
    }
}