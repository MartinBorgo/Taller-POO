package com.mycompany.taller.poo;

import interfaz.VentanaLogueo;
import enumeraciones.*;
import gestion.inventario.*;
import gestion.personas.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pepeponpin
 */
public class Main {
    public static ArrayList<Usuario> listaDeBibliotecarios = new ArrayList();
    public static ArrayList<Lector> listaLectores = new ArrayList();
    public static ArrayList<Prestamo> listaPrestamos = new ArrayList();


    public static ArrayList<Obra> listaObras = new ArrayList(); 

    
    public static void main(String []args){
        
        Usuario user1 = new Usuario(true, "Norma", "12345");
        Usuario user2 = new Usuario(false, "Eduardo", "hola01");
        Usuario user3 = new Usuario(false, "Ana", "345");
        Usuario user4 = new Usuario(false, "Elisa", "1111a");
        
        Edicion edicion1 = new Edicion("Union", "Espania", 4, 2020, 1, 625, "Espaniol", FormatoTipo.PAPEL);
        Edicion edicion2 = new Edicion("Siglo XXI", "Espania", 2, 1999, 1, 321, "Espaniol", FormatoTipo.PAPEL);
        Edicion edicion3 = new Edicion("Innisfree", "Espania", 1, 2012, 1, 120, "Espaniol", FormatoTipo.ELECTRONICO);
        
        Obra obra1 = new Obra(ObraTipo.ENSAYO, AreaTematicaTipo.PROGRAMACION, 1, "OBRA1", "SUBTITULO1",
                "AUTOR1", "AUTOR2", "AUTOR3", "ACCION", CaracteristicaTipo.BOLETIN, "Area tecnologia", 321, edicion1);
        
        Obra obra2 = new Obra(ObraTipo.LIBRO, AreaTematicaTipo.PROGRAMACION, 1, "OBRA2", "SUBTITULO1",
                "AUTOR1", "AUTOR2", "AUTOR3", "ACCION", CaracteristicaTipo.BOLETIN, "Area tecnologia", 321, edicion2);
        
        Obra obra3 = new Obra(ObraTipo.ENSAYO, AreaTematicaTipo.PROGRAMACION, 1, "OBRA3", "SUBTITULO1",
                "AUTOR1", "AUTOR2", "AUTOR3", "ACCION", CaracteristicaTipo.BOLETIN, "Area tecnologia", 321, edicion3);
        
        Obra obra4 = new Obra(ObraTipo.REVISTA, AreaTematicaTipo.CONTABILIDAD, 1, "OBRA4", "SUBTITULO1",
                "AUTOR1", "AUTOR2", "AUTOR3", "ACCION", CaracteristicaTipo.BOLETIN, "Area tecnologia", 321, edicion3);
        
        Obra obra5 = new Obra(ObraTipo.REVISTA, AreaTematicaTipo.CONTABILIDAD, 1, "OBRA4", "SUBTITULO1",
                "AUTOR1", "AUTOR2", "AUTOR3", "ACCION", CaracteristicaTipo.BOLETIN, "Area tecnologia", 321, edicion3);
        
        Obra obra6 = new Obra(ObraTipo.REVISTA, AreaTematicaTipo.CONTABILIDAD, 1, "OBRA4", "SUBTITULO1",
                "AUTOR1", "AUTOR2", "AUTOR3", "ACCION", CaracteristicaTipo.BOLETIN, "Area tecnologia", 321, edicion3);
        
        listaDeBibliotecarios.add(user1);
        listaDeBibliotecarios.add(user2);
        listaDeBibliotecarios.add(user3);
        listaDeBibliotecarios.add(user4);
        
        listaObras.add(obra1);
        listaObras.add(obra2);
        listaObras.add(obra3);
        listaObras.add(obra4);
        listaObras.add(obra5);
        listaObras.add(obra6);
        
        List<Obra> l = Obra.getEditorial(listaObras, "Union");
        
        System.out.println("FILTRADO POR EDITORIAL.");
        for(Obra i : l){
            System.out.println("");
            System.out.println(i);
        }
        
        
        
        VentanaLogueo login = new VentanaLogueo();

        login.show();


        
    }
}
