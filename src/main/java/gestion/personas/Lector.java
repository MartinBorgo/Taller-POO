package gestion.personas;

import gestion.inventario.Ejemplar;
import gestion.inventario.Multa;
import gestion.inventario.Prestamo;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Lector extends Persona {
    private boolean estaMultado;
    private Prestamo libroEnPrestamo;
    private ArrayList<Ejemplar> listaLibros = new ArrayList();
    private List<Multa>multas = new ArrayList();

    public Lector() {
    }

    public Lector(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
                  String domicilio, int codPostal, String localidad, String numCelular, String mail) {
		
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad,
              domicilio, codPostal, localidad, numCelular,mail);
		
        this.estaMultado = false;
    }

    /**
     * Devuelve si el lector esta multado
     * 
     * true -> El lector esta multado
     * false -> El lector no esta multado
     * 
     * @return boolean 
     */
    public boolean estaMultado() {
        return estaMultado;
    }

    /**
     * Settea el estado del lector
     * 
     * true -> El lector pasa a estar multado
     * false -> El lector deja de estar multado
     * 
     * @param estaMultado 
     */
    public void setEstaMultado(boolean estaMultado) {
        this.estaMultado = estaMultado;
    }
    

    /**
     * Devuelve la informacion de el prestamo que posee el lector
     * 
     * @return Prestamo 
     */
    public Prestamo getLibroEnPrestamo() {
        return libroEnPrestamo;
    }

    /**
     * Setea un nuevo prestamo para el lector
     * 
     * @param libroEnPrestamo 
     */
    public void setLibroEnPrestamo(Prestamo libroEnPrestamo) {
        this.libroEnPrestamo = libroEnPrestamo;
    }

    /**
     * Devuelve una lista con todas las multas que tiene el lector
     * 
     * @return ArrayList<ejemplar>
     */
    public ArrayList<Ejemplar> getListaLibros() {
        return listaLibros;
    }

    /**
     * Setea un nuevo valor para la el listado de libros que pidio prestado el lector
     * 
     * @param listaLibros ArrayList<Ejemplar>
     */
    public void setListaLibros(ArrayList<Ejemplar> listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * Devuelve el listado de todas las multas que posee el lector
     * 
     * @return Lista<Multa> 
     */
    public List<Multa> getMultas() {
        return multas;
    }

    /**
     * Setea un nuevo valor para la lista de multas que posee el lector
     * 
     * @param multas List<Multa> 
     */
    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
    
    
    
    // ========== Metodos hechos a mano ========== //
    
    /**
     * Agrega un objeto libro al historial de los libros que solicito el lector
     * 
     * @param ejemplar 
     */
    public void agregarLibro(Ejemplar ejemplar) {
        this.listaLibros.add(ejemplar);
    }
    
    /**
     * Agrega un objeto multa al historial de busquedas de el lector
     * 
     * @param multa 
     */
    public void agregarMulta(Multa multa) {
        this.multas.add(multa);
    }

    /**
     * Devuelve la cantidad de multas que le pusieron al lector
     * 
     * @return int 
     */
    public int cantidadMultas() {
        return multas.size();
    }
    
    /**
     * Devuelve la representacion del objeto lector en forma de un string
     * 
     * @return String 
     */
    @Override
    public String toString() {
        return String.format("%s"
                + "%nMultado:%s", super.toString(), estaMultado);
    }
   
}