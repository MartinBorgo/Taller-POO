/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.datos;

import excepciones.EjemplarInexistenteError;
import excepciones.LectorNoRegistradoError;
import excepciones.PrestamoInexistenteError;
import gestion.inventario.Ejemplar;
import gestion.inventario.Multa;
import gestion.inventario.Obra;
import gestion.inventario.Reservacion;
import gestion.personas.Bibliotecario;
import gestion.personas.Lector;
import gestion.personas.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author martin
 */
public class GestionDatos {
    private List<Usuario> listaUsuarios;
    private List<Lector> listaLectores;
    private List<Obra> listaObras;
    private Bibliotecario usuarioLoguado;

    /**
     * Construye un objeto GestionDatos con todas su informacion inicializada
     */
    public GestionDatos() {
        this.listaUsuarios = new ArrayList();
        this.listaLectores = new ArrayList();
        this.listaObras = new ArrayList();
        leerDatosUsuario();
        leerDatosObra();
        leerDatosLector();
    }
    
    /**
     * Añade un nuevo usuario pasado por parametro (Sea administrador o un usuario normal) y luego lo almacena en disco duro.
     * 
     * @param bibliotecario Usuario
     */
    public void agregarUsuario(Usuario bibliotecario) {
        this.listaUsuarios.add(bibliotecario);
        escribirDatosUsuario();
    }
    
    /**
     * Añade un objeto de tipo Obra a las listas y luego se almacenan en el disco duro.
     * 
     * @param obra Obra
     */
    public void agregarObra(Obra obra) {
        this.listaObras.add(obra);
        escribirDatosObra();
    }
    
    /**
     * Añade al lector pasado por parametro a una lista y luego se almacena en el disco duro.
     * 
     * @param lector Lector
     */
    public void agregarLector(Lector lector) {
        this.listaLectores.add(lector);
        escribirDatosLector();
    }

    /**
     * Devuelve el usuario que inicio sesion
     * 
     * @return Usuario El usuario que se logueo
     */
    public Bibliotecario getUsuarioLoguado() {
        return usuarioLoguado;
    }

    /**
     * Setea al usuario que se reguistro en esa sesion
     * 
     * @param usuarioLoguado Bibliotecario
     */
    public void setUsuarioLoguado(Bibliotecario usuarioLoguado) {
        this.usuarioLoguado = usuarioLoguado;
    }

    /**
     * Devuelve el listado de toods los usuarios que se pueden operar la aplicacion
     * 
     * @return List Usuario
     */
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * Devuelve un listado de todos los lectores que se encuentran registrados en los archivos
     * 
     * @return List Lector
     */
    public List<Lector> getListaLectores() {
        return listaLectores;
    }

    /**
     * Devuelve un listado de todas las obras que posee la biblioteca
     * 
     * @return List Obra
     */
    public List<Obra> getListaObras() {
        return listaObras;
    }
    
    
    // ================ Metodos de busqueda =============== //
    
    /**
     * Devuelve el lector que tenga en prestamo el ejemplar que se pase por parametro.
     * 
     * @param cod String
     * @return Lector o null
     * @throws PrestamoInexistenteError Si el prestamo de ese ejemplar no existe
     */
    public Lector buscarPrestamo(String cod) throws PrestamoInexistenteError {
        for(Lector lector : this.listaLectores) {
            if(lector.getLibroEnPrestamo().getEjemplarSolicitado().getCodigoBarras().equals(cod)) {
                return lector;
            }
        }
        
        throw new PrestamoInexistenteError();
    }

    /**
     * Devuelve al lector que posea el numero de documento pasado por parametro.
     * Si el parametro que le pasamos no coincide con el DNI de ningun lector -> <b> return null </b>
     * 
     * @param dni int
     * @return Lector o null
     * @throws LectorNoRegistradoError Si no se encuentra en la lista de lectores
     */
    public Lector buscarLector(int dni) throws LectorNoRegistradoError {
        for(Lector lector : this.listaLectores) {
            if(lector.getDni() == dni) {
                return lector;
            }
        }
        
        throw new LectorNoRegistradoError();
    }
    
    /**
     * Devuelve el ejemplar que posea el el mismo id que el que se le pasa por parametro.
     * Si el numero que le pasamos por parametro no coincide con ningun ID -> <b> return null </b>
     * 
     * @param cod String
     * @return Ejemplar o null
     * @throws EjemplarInexistenteError Si el codigo no coincide con ninguno de los codigos de los ejemplares cargados
     */
    public Ejemplar buscarEjemplar(String cod) throws EjemplarInexistenteError {
        List<Ejemplar> ejemplares = listaEjemplares();
        
        for(Ejemplar ejemplar : ejemplares) {
            if(ejemplar.getCodigoBarras().equals(cod)) {
                return ejemplar;
            }
        }
        
        throw new EjemplarInexistenteError();
    }
    
    // ================ Metodos de filtrado/ordenamiento =============== //
    
    /**
     * Lista a todos los ejemplares disponibles de el area de referencia indicada
     * 
     * @param areaReferencia String
     * @return List Ejemplar
     */
    public List<Ejemplar> disponibleAreaReferencia(String areaReferencia) {
        List<Ejemplar> disponibles = new ArrayList();
        
        for(Obra obra : this.listaObras) {
            if(obra.getAreaReferencia().equals(areaReferencia)) {
                for(Ejemplar ejemplar : obra.getEjemplares()) {
                    if(ejemplar.isEnPrestamo() == false) {
                      disponibles.add(ejemplar);   
                    
                    }
                }
            }
        }
    
        return disponibles;
    }
    
    /**
     * Devulve una lista ordenada de a cuerdo a la cantidad de solicitudes que se realizaron a las obras por el publico general
     * 
     * @return List Obra Lista ordenada de las obras mas solicitadas por el publico general
     */
    public List<Obra> getSolicitudGeneral() {
    	CriterioSolicitudGeneral general = new CriterioSolicitudGeneral();
    	
        // Copio todos los elementos de la lista en una nueva
        List<Obra> copy = listaObras.stream().collect(Collectors.toList());
    	
        // Ordeno la lista por el criteio pasado por parametro
        copy.sort(general);
        
        // Roto la lista para que quede ordebado de mayor a menor
    	Collections.reverse(copy);
    	
        return copy;
    }
    
    /**
     * Ordena las obras de a cuerdo a la cantidad de solicitudas que tuvieron los por parte de alumnos y profesores
     * 
     * @return List Obra Lista ordenada de obras mas pedidas por los estudiantes y profesores
     */
    public List<Obra> getSolicitudFacultad(){
    	CriterioSolicitudFacultad facultad = new CriterioSolicitudFacultad();
    	
        // Copio todos los elementos de la lista en una nueva
        List<Obra> copy = listaObras.stream().collect(Collectors.toList());
    	
        // Ordeno la lista por el criteio pasado por parametro
        copy.sort(facultad);
        
        // Roto la lista para que quede ordebado de mayor a menor
    	Collections.reverse(copy);
    	return copy;
    }
    
    /**
     * Ordena la lista de Lectores de acuerdo con la cantidad de multas que tenga cada uno de ellos
     * 
     * @return List Lector Una lista de lectores ordenados por quien tuvo mas multas
     */
    public List<Lector> getMultas() {
        CriterioCantidadMultas multas = new CriterioCantidadMultas();
        
        // Copio todos los elementos de la lista en una nueva
        List<Lector> copy = listaLectores.stream().collect(Collectors.toList());
     
        // Ordeno la lista por el criteio pasado por parametro
        copy.sort(multas);
        
        // Roto la lista para que quede ordebado de mayor a menor
        Collections.reverse(copy);
        return copy;
    }
    
    /**
     * Devuelve una lista con las obras que sean de la misma editorial.
     * @param editorial String
     * @return List Obra Una lista de obras que sean de la misma editorial
     */
    public List<Obra> getEditoriales(String editorial) {
        List<Obra> filtradoObra = listaObras.stream().filter(x -> x.getEdicion().getEditorial().equals(editorial)).collect(Collectors.toList());
        return filtradoObra;
    }
    
    /**
     * Devuelve una lista con todos los lectores tienen un libro en prestamo y no lo devolvieron en la fecha correspondiente
     * 
     * @return List Ejemplar Lista con todos los lectores proximos a multar
     *
     */
    public List<Lector> devolucionesTardias() {
        // Creo una lista con todos los ejemplares cargados en el sistema
        ArrayList<Ejemplar> ejemplares = (ArrayList) listaEjemplares();
        
        // Creo una nueva lista para ir almacenando todos los lectores que devolveran tarde el prestamo del ejemplar
        List<Lector> lectoresParaMultar = new ArrayList();
        
        for(Ejemplar ejemplar : ejemplares) {
            if(ejemplar.getInfoPrestamo().getFechaDevolucion().before(new GregorianCalendar())) {
                lectoresParaMultar.add(ejemplar.getInfoPrestamo().getLectorSolicita());
            
            }
        }
    
        return lectoresParaMultar;
    }
    
    /**
     * Esta funcnion recibe dos fecha (en formato GregorianCalendar) y devuelve una lista con todas las personas que fueron multados en ese momento de tiempo
     * 
     * @param fechaInicio GregorianCalendar
     * @param fechaFinal GregorianCalendar
     * @return Una lista con todos los lectores que estuvieron multados en ese periodo de tiempo List<Lector> 
     */
    public List<Lector> periodoDeMulta(GregorianCalendar fechaInicio, GregorianCalendar fechaFinal) {
        List<Lector> periodoMulta = new ArrayList();
        
        for(Lector lector : this.listaLectores) {
            for(Multa multa : lector.getMultas()) {
                if((multa.getInicio().after(fechaInicio) && multa.getInicio().before(fechaFinal)) && multa.getFinalizacion().after(fechaFinal) ||
                   (multa.getFinalizacion().after(fechaInicio) && multa.getFinalizacion().before(fechaFinal)) && multa.getInicio().before(fechaInicio) ||
                   (multa.getInicio().after(fechaInicio) && multa.getInicio().before(fechaFinal)) && (multa.getFinalizacion().after(fechaInicio) && multa.getFinalizacion().before(fechaFinal)) || 
                   (multa.getInicio().before(fechaInicio) && multa.getFinalizacion().after(fechaFinal))) {
                    
                        periodoMulta.add(lector);
                    
                }
            }
        }
        
        return periodoMulta;
    }
    
    /**
     * Lista a todos los ejemplares que esten reservados a partir de una determinada fecha
     * 
     * @param desde - GregorianCalendar
     * @return List Ejemplar Devuelve una lista con todos los ejemplares que se encuentran reservados a partir de esa fecha
     */
    public List<Ejemplar> ejemplaresReservados(GregorianCalendar desde) {
        List<Ejemplar> ejemplares = listaEjemplares();
        ArrayList<Ejemplar> reservados = new ArrayList();
        
        for(Ejemplar ejemplar : ejemplares) {
            for(Reservacion res : ejemplar.getReservaciones()){
                if(res.getInicio().after(desde)) {
                    if(reservados.contains(ejemplar) == false) reservados.add(ejemplar);
                }
            }
        }
        
        return reservados;
    }
    
    /**
     * Devuelve una lista que contiene todos los ejemplares del distintas Obras cargadas en el sistema
     * 
     * @return List Ejemplar
     */
    public List<Ejemplar> listaEjemplares() {
        List<Ejemplar> ejemplares = new ArrayList();
        for(Obra obra : this.listaObras) {
            ejemplares.addAll(obra.getEjemplares());
        }
    
        return ejemplares;
    }
    
    // ================ Metodos privados de la clase =============== //
    
    private void escribirDatosObra() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("obras.dat"));
            oos.writeObject(this.listaObras);
            
            oos.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    private void leerDatosObra() {
        try {
            ObjectInputStream ois = new ObjectInputStream( new FileInputStream("obras.dat"));
            this.listaObras = (ArrayList<Obra>) ois.readObject();
            
            ois.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    
    private void escribirDatosLector() {
        try{
            ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("lectores.dat"));
            oos.writeObject(this.listaLectores);
            
            oos.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    private void leerDatosLector() {
        try {
            ObjectInputStream ois = new ObjectInputStream( new FileInputStream("lectores.dat"));
            this.listaLectores = (ArrayList<Lector>) ois.readObject();
            
            ois.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    
    private void escribirDatosUsuario() {
        try{
            ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("usuarios.dat"));
            oos.writeObject(this.listaUsuarios);
            
            oos.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    private void leerDatosUsuario() {
        try {
            ObjectInputStream ois = new ObjectInputStream( new FileInputStream("usuarios.dat"));
            this.listaUsuarios = (ArrayList<Usuario>) ois.readObject();
            
            ois.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
