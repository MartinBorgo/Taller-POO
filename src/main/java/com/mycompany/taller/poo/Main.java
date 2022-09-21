package com.mycompany.taller.poo;
import enumeraciones.*;
import interfaz.*;
import personas.*;
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
        
        login.show();
        
        //Probando valores de las enumeraciones
        for(AreaTematicaTipo area : AreaTematicaTipo.values()){
            System.out.println(area.getAreaTematicaTipo());
        }
        
        System.out.println("");
        for(CaracteristicaTipo caracteristica : CaracteristicaTipo.values()){
            System.out.println(caracteristica.getCaracteristicaTipo());
        }
        
        System.out.println("");
        for (FormatoTipo formato : FormatoTipo.values()) {
            System.out.println(formato.getFormato());
        }
        
        System.out.println("");
        for(ObraTipo obra : ObraTipo.values()){
            System.out.println(obra.getObraTipo());
        }
        
        
        System.out.println("");
        for(PrestamoTipo prestamo : PrestamoTipo.values()){
            System.out.println(prestamo.getPrestamoTipo());
        }
        
        System.out.println("");
        for(SexoTipo sexo : SexoTipo.values()){
            System.out.println(sexo.getSexoTipo());
        }
        //Creacion de objetos de cada tipo de persona.
        Persona lector1 = new Lector();
        Persona docente1 = new Docente();
        Persona alumno1 = new Alumno();
        Persona usuario1 = new Usuario();
        Persona bibliotecario1 = new Bibliotecario();
        //jaja saludos
    }
}
