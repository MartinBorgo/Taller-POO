package com.mycompany.taller.poo;

import gestion.datos.GestionDatos;
import interfaz.VentanaLogueo;
import gestion.inventario.*;
import gestion.personas.*;
import java.io.IOException;
import java.util.ArrayList;
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
    public static ArrayList<Usuario> listaDeBibliotecarios = new ArrayList();
    public static ArrayList<Lector> listaLectores = new ArrayList();
    public static ArrayList<Obra> listaObras = new ArrayList(); 

    
    public static void main(String []args) throws IOException, ClassNotFoundException, BarcodeException, OutputException{
        
        Bibliotecario biblio1 = new Bibliotecario(true, "Norma", "12345");
        Bibliotecario biblio2 = new Bibliotecario(false, "Eduardo", "hola01");
        Bibliotecario biblio3 = new Bibliotecario(false, "Ana", "345");
        Bibliotecario biblio4 = new Bibliotecario(false, "Elisa", "1111a");
        
        listaDeBibliotecarios.add(biblio1);
        listaDeBibliotecarios.add(biblio2);
        listaDeBibliotecarios.add(biblio3);
        listaDeBibliotecarios.add(biblio4);

        
        GestionDatos datos = new GestionDatos();

        VentanaLogueo login = new VentanaLogueo(datos);
        login.setVisible(true);


        
    }
}
