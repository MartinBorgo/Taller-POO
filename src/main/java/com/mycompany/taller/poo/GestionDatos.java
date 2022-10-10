/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.poo;

import gestion.inventario.Ejemplar;
import gestion.inventario.Obra;
import gestion.personas.Lector;
import gestion.personas.Usuario;
import java.util.ArrayList;

/**
 *
 * @author martin
 */
public class GestionDatos {
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Lector> listaLectores;
    private ArrayList<Obra> listaObras;

    /**
     * Construye un objeto GestionDatos con todas su informacion inicializada
     */
    public GestionDatos() {
        this.listaUsuarios = new ArrayList();
        this.listaLectores = new ArrayList();
        this.listaObras = new ArrayList();
    }
    
    /**
     * Añade un nuevo usuario pasado por parametro (Sea administrador o un usuario normal) y luego lo almacena en disco duro.
     * 
     * @param bibliotecario Usuario
     */
    public void agregarUsuario(Usuario bibliotecario) {
        this.listaUsuarios.add(bibliotecario);
    }
    
    /**
     * Añade un objeto de tipo Obra a las listas y luego se almacenan en el disco duro.
     * 
     * @param obra Obra
     */
    public void agregarObra(Obra obra) {
        this.listaObras.add(obra);
    }
    
    /**
     * Añade al lector pasado por parametro a una lista y luego se almacena en el disco duro.
     * 
     * @param lector Lector
     */
    public void agregarLector(Lector lector) {
        this.listaLectores.add(lector);
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
    
    
}
