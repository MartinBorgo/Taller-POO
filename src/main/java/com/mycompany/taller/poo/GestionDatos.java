/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.poo;

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

    public GestionDatos() {
        this.listaUsuarios = new ArrayList();
        this.listaLectores = new ArrayList();
        this.listaObras = new ArrayList();
    }
    
    public void agregarUsuario(Usuario bibliotecario) {
        this.listaUsuarios.add(bibliotecario);
    }
    
    public void agregarObra(Obra obra) {
        this.listaObras.add(obra);
    }
    
    public void agregarLector(Lector lector) {
        this.listaLectores.add(lector);
    }
    
    
}
