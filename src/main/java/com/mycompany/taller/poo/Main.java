package com.mycompany.taller.poo;

import enumeraciones.AreaTematicaTipo;
import enumeraciones.CaracteristicaTipo;
import enumeraciones.FormatoTipo;
import enumeraciones.ObraTipo;
import enumeraciones.PrestamoTipo;
import enumeraciones.SexoTipo;
import excepciones.EjemplarInexistenteError;
import excepciones.LectorNoRegistradoError;
import excepciones.PrestamoInexistenteError;
import gestion.datos.GestionDatos;
import interfaz.VentanaLogueo;
import gestion.inventario.*;
import gestion.personas.*;
import interfaz.VentanaBibliotecario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.output.OutputException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Grupo 2
 */
public class Main {
    public static void main(String []args) throws EjemplarInexistenteError, LectorNoRegistradoError {
        
//        Esto se queda para poder acordarnos la contraseñas y los usuarios
//        Bibliotecario biblio1 = new Bibliotecario(true, "Norma", "12345");
//        Bibliotecario biblio2 = new Bibliotecario(false, "Eduardo", "hola01");
//        Bibliotecario biblio3 = new Bibliotecario(false, "Ana", "345");
//        Bibliotecario biblio4 = new Bibliotecario(false, "Elisa", "1111a");
        
//        de aca en adelante se puede borrar todo
        
        GestionDatos datos = new GestionDatos();

        Lector lectorDNI1 = datos.buscarLector(1);
        Lector lectorDNI2 = datos.buscarLector(2);
        Ejemplar ejemplar = datos.buscarEjemplar("6");
        
        Prestamo elprestamo = new Prestamo(new GregorianCalendar(2022, 10, 22), PrestamoTipo.DOMICILIO, datos.getListaUsuarios().get(1), ejemplar, lectorDNI2);
        
        System.out.println(elprestamo.getFechaDevolucion().before(new GregorianCalendar()));
        
        
        VentanaLogueo login = new VentanaLogueo(datos);
        login.setVisible(true);
    }
}
