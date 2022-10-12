/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.poo;

import gestion.inventario.CriterioCantidadMultas;
import gestion.inventario.CriterioSolicitudFacultad;
import gestion.inventario.CriterioSolicitudGeneral;
import gestion.inventario.Ejemplar;
import gestion.inventario.Multa;
import gestion.inventario.Obra;
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
     * Devuelve el lector que tenga en prestamo el ejemplar que se pase por parametro.
     * Si el codigo del ejemplar que pasamos por parametro no coincide con el de ningun ejemplar -> <b> return null </b>
     * 
     * @param id - Integer
     * @return Lector o null
     */
    public Lector buscarPrestamo(int id) {
        for(Lector lector : this.listaLectores) {
            if(lector.getLibroEnPrestamo().getEjemplarSolicitado().getIdUnico() == id) {
                return lector;
            }
        }
        
        return null;
    }

    /**
     * Devuelve al lector que posea el numero de documento pasado por parametro.
     * Si el parametro que le pasamos no coincide con el DNI de ningun lector -> <b> return null </b>
     * 
     * @param dni Integer
     * @return Lector o null
     */
    public Lector buscarLector(int dni) {
        for(Lector lector : this.listaLectores) {
            if(lector.getDni() == dni) {
                return lector;
            }
        }
        
        return null;
    }
    
    /**
     * Devuelve el ejemplar que posea el el mismo id que el que se le pasa por parametro.
     * Si el numero que le pasamos por parametro no coincide con ningun ID -> <b> return null </b>
     * 
     * @param id
     * @return Ejemplar o null
     */
    public Ejemplar buscarEjemplar(int id) {
        for(Obra obra : this.listaObras) {
            if(obra.buscarEjemplar(id) != null) {
                return obra.buscarEjemplar(id);
            }
        }
        return null;
    }
    
    // ================ Metodos de filtrado/ordenamiento =============== //
    
    /**
     * Lista a todos los ejemplares disponibles de el area de referencia indicada
     * 
     * @param areaReferencia String
     * @return List<Ejemplar>
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
     * @return List<obras> Lista ordenada de las obras mas solicitadas por el publico general
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
     * @return List<Obra> Lista ordenada de obras mas pedidas por los estudiantes y profesores
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
     * @return List<Lector> Una lista de lectores ordenados por quien tuvo mas multas
     */
    public List<Lector> getMulas() {
        CriterioCantidadMultas multas = new CriterioCantidadMultas();
        
        // Copio todos los elementos de la lista en una nueva
        List<Lector> copy = listaLectores.stream().collect(Collectors.toList());
     
        // Ordeno la lista por el criteio pasado por parametro
        copy.sort(multas);
        
        // Roto la lista para que quede ordebado de mayor a menor
        Collections.reverse(copy);
        return copy;
    }
    
    public List<Obra> getEditoriales(String editorial) {
        List<Obra> filtradoObra = listaObras.stream().filter(x -> x.getEdicion().getEditorial().equals(editorial)).collect(Collectors.toList());
        return filtradoObra;
    }
    
    /**
     * Devuelve una lista con todos los lectores tienen un libro en prestamo y no lo devolvieron en la fecha correspondiente
     * 
     * @return List<Ejemplar> Lista con todos los lectores proximos a multar
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
    
    // Este metodo esta todavia en construccion
    
    /**
     * Esta funcnion recibe dos fecha (en formato GregorianCalendar) y devuelve una lista con todas las personas que fueron multados en ese momento de tiempo
     * 
     * @param fechaInicio GregorianCalendar
     * @param fechaFinal gregorianCalendar
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
    
    // ================ Metodos privados de la clase =============== //
    
    /**
     * Devuelve una lista que contiene todos los ejemplares del distintas Obras cargadas en el sistema
     * 
     * @return List<Ejemplar> 
     */
    private List<Ejemplar> listaEjemplares() {
        List<Ejemplar> ejemplares = new ArrayList();
        for(Obra obra : this.listaObras) {
            ejemplares.addAll(obra.getEjemplares());
        }
    
        return ejemplares;
    }
    
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
