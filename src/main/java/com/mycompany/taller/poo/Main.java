package com.mycompany.taller.poo;
import interfaz.*;
import enumeraciones.*;
import gestion.inventario.*;
import gestion.personas.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pepeponpin
 */
public class Main {
    public static void main(String []args){
        System.out.println("SOY EL MAIN");
        
        VentanaAdministrador prueba = new VentanaAdministrador();
        LoginScreen login = new LoginScreen();
        
        //login.show();
        //Creacion de objetos de cada tipo de persona.
        Persona lector1 = new Lector();
        Persona docente1 = new Docente();
        Persona alumno1 = new Alumno();
        Persona usuario1 = new Usuario();
        Persona bibliotecario1 = new Bibliotecario();
        
        Edicion edicion1 = new Edicion();
        String []listita = {"1","2"}; //Para el atributo areaReferencia[] que es un array 
        Obra obra1 = new Obra(ObraTipo.LIBRO, AreaTematicaTipo.MATEMATICAS, 0, "OBRA1", "SUBTITULO1", "AUTOR1", "AUTOR2", "AUTOR3", "ACCION", CaracteristicaTipo.BOLETIN, "320 PAGS", listita, 321, edicion1);
        System.out.println(obra1);
        //jaja saludos
    }
}
