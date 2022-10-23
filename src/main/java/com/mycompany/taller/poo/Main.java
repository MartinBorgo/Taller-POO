package com.mycompany.taller.poo;

import enumeraciones.AreaTematicaTipo;
import enumeraciones.CaracteristicaTipo;
import enumeraciones.FormatoTipo;
import enumeraciones.ObraTipo;
import enumeraciones.SexoTipo;
import excepciones.EjemplarInexistenteError;
import excepciones.LectorNoRegistradoError;
import gestion.datos.GestionDatos;
import interfaz.VentanaLogueo;
import gestion.inventario.*;
import gestion.personas.*;
import interfaz.VentanaBibliotecario;
import java.io.IOException;
import java.util.ArrayList;
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
    public static void main(String []args) throws IOException, ClassNotFoundException, BarcodeException, OutputException, EjemplarInexistenteError, LectorNoRegistradoError{
        
//        Esto se queda para poder acordarnos la contraseñas y los usuarios
//        Bibliotecario biblio1 = new Bibliotecario(true, "Norma", "12345");
//        Bibliotecario biblio2 = new Bibliotecario(false, "Eduardo", "hola01");
//        Bibliotecario biblio3 = new Bibliotecario(false, "Ana", "345");
//        Bibliotecario biblio4 = new Bibliotecario(false, "Elisa", "1111a");
        
//        de aca en adelante se puede borrar todo
        
//        Edicion edicion1 = new Edicion("Pearson", "Argentina", 1, 2016, 1, 560, "Español", FormatoTipo.PAPEL);
//        Obra obra1 = new Obra(ObraTipo.LIBRO, AreaTematicaTipo.PROGRAMACION, 2,"Como programar en Java", "Java", 
//                "Deitel Paul", "Deitel Harvey", " ", "Computacion", CaracteristicaTipo.BOLETIN, "Tecnologia", 2, edicion1);
//        
//        Ejemplar ejemplarObra1 = new Ejemplar(new GregorianCalendar(2021, 10, 21), "Comprado", new Ubicacion(1, 3, 5), obra1);
        
        GestionDatos datos = new GestionDatos();
        
        VentanaLogueo login = new VentanaLogueo(datos);
        login.setVisible(true);
    }
}
