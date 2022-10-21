/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import gestion.personas.Lector;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import net.sourceforge.barbecue.*;
import net.sourceforge.barbecue.output.*;

/**
 *
 * @author Grupo 2
 * 
 */
public class Ejemplar implements Serializable{
    private static int incremental = 1;
    
    private Integer idUnico;
    private String observaciones;
    private GregorianCalendar fechaAdquisicion;
    private String formaAdquisicion;
    private GregorianCalendar fechaBaja;
    private String motivoBaja;
    private Ubicacion ubicacionBaja;
    private boolean enPrestamo;
    private Ubicacion ubicacion;
    private Prestamo Prestamo;
    private Obra obra;
    private Coleccion coleccion; //PUEDE PERTENECER A UNA COLECCION.
    private List<Lector> listaSolicitudLectores;
    private List<Reservacion> reservaciones;
    private String codigoBarras;
   
    /**
     * Construye un objeto ejemplar con sus valores inicializados
     * 
     * @param fechaAdquisicion GregorianCalendar
     * @param formaAdquisicion String
     * @param ubicacion Ubicacion
     * @param obra Obra
     * @throws BarcodeException setCodigoBarras()
     * @throws OutputException setCodigoBarras()
     */
    
    //Puede agarrar excepciones del metodo setCodigoBarras();
    public Ejemplar(GregorianCalendar fechaAdquisicion, String formaAdquisicion, Ubicacion ubicacion, Obra obra) throws BarcodeException, OutputException, IOException {
        this.idUnico = incremental;
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        this.ubicacion = ubicacion;
        this.obra = obra;
        this.enPrestamo = false;
        this.listaSolicitudLectores  = new ArrayList();
        this.reservaciones = new ArrayList();
        this.setCodigoBarras();
        
        obra.agregarEjemplar(this); // Se mantiene la relacion entre ejemplar y Obra
        
        incremental++;
    }

    /**
     * Construye un objeto Ejemplar con sus valores inicializados
     * 
     * @param fechaAdquisicion fechaAdquisicion
     * @param formaAdquisicion String
     * @param ubicacion Ubicacion
     * @param coleccion Coleccion
     * @throws BarcodeException setCodigoBarras()
     * @throws OutputException setCodigoBarras()
     */
    
    //Puede agarrar excepciones del metodo setCodigoBarras();
    public Ejemplar(GregorianCalendar fechaAdquisicion, String formaAdquisicion, Ubicacion ubicacion, Coleccion coleccion) throws BarcodeException, OutputException, IOException {
        this.idUnico = incremental;
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        this.ubicacion = ubicacion;
        this.coleccion = coleccion;
        this.listaSolicitudLectores  = new ArrayList();
        this.reservaciones = new ArrayList();
        this.setCodigoBarras();
        
        coleccion.agregarEjemplar(this);
        
        incremental++;
    }

    /**
     * Construye un objeto ejemplar con todos sus valores por defecto
     * @throws BarcodeException setCodigoBarras()
     * @throws OutputException setCodigoBarras()
     */
    public Ejemplar() throws BarcodeException, OutputException, IOException {
        this.idUnico = incremental;
        this.listaSolicitudLectores  = new ArrayList();
        this.reservaciones = new ArrayList();
        this.setCodigoBarras();
        
        incremental++;
    }

    /**
     * Devuelve el codigo identificador de el ejemplar
     * @return Integer
     */
    public Integer getIdUnico() {
        return idUnico;
    }

    /**
     * Setea El codigo unico con el valor pasado por parametro
     * 
     * @param idUnico Integer
     */
    public void setIdUnico(Integer idUnico) {
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
     * @param observacion String
     */
    public void setObservaciones(String observacion) {
        this.observaciones = observacion;
    }

    /**
     * Devuelve la fecha de adquisicion del ejemplar
     * 
     * @return GregorianCalendar 
     */
    public GregorianCalendar getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    /**
     * Setea la fecha de adquisicion del ejemplar con la fecha pasada por parametros
     * 
     * @param fechaAdquisicion GregorianCalendar
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
     * @param formaAdquisicion String
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
     * @param fechaBaja GregorianCalendar
     */
    public void setFechaBaja(GregorianCalendar fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    /**
     * Devuelve el motivo de la baja del ejemplar
     * 
     * @return String String
     */
    public String getMotivoBaja() {
        return motivoBaja;
    }

    /**
     * Setea el motivo de la baja del ejemplar con lo pasado por parametro
     * 
     * @param motivoBaja String
     */
    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    /**
     * Devuelve la ubicacion en la que se encuentra el ejemplar dado de baja
     * 
     * @return String 
     */
    public Ubicacion getUbicacionBaja() {
        return ubicacionBaja;
    }

    /**
     * Setea la ubicacion de baja del ejemplar por lo pasado en parametro
     * 
     * @param ubicacionBaja String
     */
    public void setUbicacionBaja(Ubicacion ubicacionBaja) {
        this.ubicacionBaja = ubicacionBaja;
    }

    /**
     * Devuelve el estado del ejemplar
     * 
     * @return <b>true</b> si el ejemplar esta en prestamo, de lo contrario se retornara false
     */
    public boolean isEnPrestamo() {
        return enPrestamo;
    }

    /**
     * Setea el estado del ejemplar con el valor pasado por parametro, true para que este en prestamo, false para que este disponible
     * 
     * @param enPrestamo boolean
     */
    public void setEnPrestamo(boolean enPrestamo) {
        this.enPrestamo = enPrestamo;
    }

    /**
     * Devuelve la ubicacion en la que se encuentra el ejemplar
     * 
     * @return Ubicacion
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Setea la ubicacion en la que se encuentra el ejemplar
     * 
     * @param ubicacion Ubicacion
     */
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     * Devuelve un objeto de tipo Prestamo, con toda la informacion de este mismo
     * 
     * @return Un Prestamo con toda la informacion acerca del mismo
     */
    public Prestamo getPrestamo() {
        return Prestamo;
    }

    /**
     * Setea un prestamo para el ejemplar y setea el estado del ejemplar como prestado
     * 
     * @param Prestamo Prestamo
     */
    public void setPrestamo(Prestamo Prestamo) {
        this.Prestamo = Prestamo;
        this.enPrestamo = true;
    }

    /**
     * Devuelve la Obra de la que es el ejemplar
     * 
     * @return Obra
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * Setea la obra del ejemplar
     * 
     * @param obra Obra
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * Devuelve la coleccion a la que pertenece el ejemplar
     * 
     * @return Coleccion
     */
    public Coleccion getColeccion() {
        return coleccion;
    }

    /**
     * Setea un nuevo coleccion para el ejemplar
     * 
     * @param coleccion Coleccion
     */
    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    /**
     * Devuelve la lista de todos los lectores que solicitaron este ejemplar
     * 
     * @return List Lector
     */
    public List<Lector> getListaSolicitudLectores() {
        return listaSolicitudLectores;
    }

    /**
     * Setea una nueva lista de lector que tomo en prestamo el ejemplar 
     * 
     * @param listaSolicitudLectores List Lector
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
     * Setea una nueva lista de reservaciones para el ejemplar
     * 
     * @param reservaciones List Reservacion
     */
    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }

    /**
     * Devuelve el codigo de barras del ejemplar
     * @return String
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }
    
    // ========== Metodos hechos a mano ========== //
    
    /**
     * Agrega un lector a la lista de personas que solicitaron este ejemplar alguna vez
     * 
     * @param lector Lector
     */
    public void agregarLector(Lector lector) {
        this.listaSolicitudLectores.add(lector);
    }
    
    /**
     * Agrega una reservacion a la lista de reservaciones que hay de el ejemplar en cuestion
     * 
     * @param reservacion Reservacion
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
        String estaPrestado = enPrestamo ? "En prestamo" : "No esta en prestamo";
        return String.format("Codigo barras: %s,"
                + "%n Fecha adquisicion: %s/%s/%s,"
                + "%n Forma adquisicion: %s,"
                + "%n En prestamo: %s,"
                + "%n %s", codigoBarras, fechaAdquisicion.get(Calendar.YEAR), fechaAdquisicion.get(Calendar.MONTH), 
                fechaAdquisicion.get(Calendar.DAY_OF_MONTH), formaAdquisicion, estaPrestado, ubicacion);
    }

    /**
     * Ingresa un codigo de barras al ejemplar, llamado desde el constructor.
     * @throws OutputException barbecue
     * @throws BarcodeException barbecue
     */
    private void setCodigoBarras() throws BarcodeException, OutputException, IOException{
        String idAux = Integer.toString(this.idUnico);
        Barcode bar = BarcodeFactory.createCode128(idAux);
        File archivo = new File("src/main/java/codigoDeBarras/" + idAux + ".png");
        
        BarcodeImageHandler.savePNG(bar, archivo);
        this.codigoBarras = bar.getLabel();
    }
}