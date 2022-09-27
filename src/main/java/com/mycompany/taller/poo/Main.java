package com.mycompany.taller.poo;

import interfaz.*;
import enumeraciones.*;
import gestion.inventario.*;
import gestion.personas.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;

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
    
    public static void main(String []args){
        
        Usuario user1 = new Usuario(true, "Norma", "12345");
        Usuario user2 = new Usuario(false, "Eduardo", "hola01");
        Usuario user3 = new Usuario(false, "Ana", "345");
        Usuario user4 = new Usuario(false, "Elisa", "1111a");
        
        listaDeBibliotecarios.add(user1);
        listaDeBibliotecarios.add(user2);
        listaDeBibliotecarios.add(user3);
        listaDeBibliotecarios.add(user4);
        
        
        LoginScreen login = new LoginScreen();

        login.show();

        //Creacion de objetos de cada tipo de persona.
        Persona lector1 = new Lector();
        Persona docente1 = new Docente();
        Persona alumno1 = new Alumno();
        Persona usuario1 = new Usuario();
        Persona bibliotecario1 = new Bibliotecario();
        
        // Provando si anda la clase multa
        Multa multa1 = new Multa(LocalDate.now());
        
        Ubicacion ubicacion1 = new Ubicacion(5,11, 5);
        System.out.println("\nTOSTRING DE UBICACION: \n"+ ubicacion1);
        
        GregorianCalendar fechaAdquisicion1 = new GregorianCalendar(2020, 5, 24);
        Ejemplar ejemplar1 = new Ejemplar(fechaAdquisicion1, "Comprado", ubicacion1);
        System.out.println("TOSTRING DE EJEMPLAR: \n"+ ejemplar1);
        
        Edicion edicion1 = new Edicion("Union", "Espania", 4, 2020, 1, 625, "Espaniol", FormatoTipo.PAPEL);
        String []listita = {"1","2"}; //Para el atributo areaReferencia[] que es un array 
        
        Obra obra1 = new Obra(ObraTipo.ENSAYO, AreaTematicaTipo.PROGRAMACION, 0, "OBRA1", "SUBTITULO1", "AUTOR1", "AUTOR2", "AUTOR3", "ACCION", CaracteristicaTipo.BOLETIN, "320 PAGS", listita, 321, edicion1);
        System.out.println("\nTOSTRING DE OBRA: \n"+ obra1);
        
        Coleccion coleccion1 = new Coleccion();
        System.out.println("\nTOSTRING DE COLECCION: \n" + coleccion1);
        
        GregorianCalendar fechaNacimiento1 = new GregorianCalendar(1999, 2, 12);
        lector1.setSexo(SexoTipo.MASCULINO);
        lector1.setFechaNacimiento(fechaNacimiento1);
        System.out.println("\n TOSTRING DE PERSONA Y LECTOR: \n"+ lector1.toString());
        
    }
}
