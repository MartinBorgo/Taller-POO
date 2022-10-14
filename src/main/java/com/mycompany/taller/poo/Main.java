package com.mycompany.taller.poo;

import interfaz.VentanaLogueo;
import enumeraciones.*;
import gestion.inventario.*;
import gestion.personas.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
 * @author pepeponpin
 */
public class Main {
    public static ArrayList<Usuario> listaDeBibliotecarios = new ArrayList();
    public static ArrayList<Lector> listaLectores = new ArrayList();
    public static ArrayList<Prestamo> listaPrestamos = new ArrayList();


    public static ArrayList<Obra> listaObras = new ArrayList(); 

    
    public static void main(String []args) throws IOException, ClassNotFoundException, BarcodeException, OutputException{
    	GregorianCalendar fecha1 = new GregorianCalendar(2000, 5, 14);
    	GregorianCalendar fecha2 = new GregorianCalendar(1999, 2, 24);
    	GregorianCalendar fecha3 = new GregorianCalendar(1985, 8, 26);
    	
    	Ubicacion ubicacion1 = new Ubicacion(12,3,5);
    	Ubicacion ubicacion2 = new Ubicacion(12,3,6);
        
        Usuario user1 = new Usuario(true, "Norma", "12345");
        Usuario user2 = new Usuario(false, "Eduardo", "hola01");
        Usuario user3 = new Usuario(false, "Ana", "345");
        Usuario user4 = new Usuario(false, "Elisa", "1111a");
        
        Lector lector1 = new Lector("Pepito", "Fernandez", 44707012, fecha3, "Argentina", "P.A de Maria 2376", 3200, "Concordia", "345685742", "pepe@gmail.com", SexoTipo.MASCULINO);
        Lector lector2 = new Lector("Juanita", "Fernandez", 44707011, fecha3, "Argentina", "P.A de Maria 2376", 3200, "Concordia", "3457120486", "Juanita@gmail.com", SexoTipo.FEMENINO);
        
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
        
        Ejemplar ejemplar1 = new Ejemplar(fecha1, "Regalado", ubicacion1,obra1);
        ejemplar1.setEnPrestamo(true);
        Ejemplar ejemplar2 = new Ejemplar(fecha2, "Comprado", ubicacion2,obra1);
        Ejemplar ejemplar3 = new Ejemplar(fecha2, "Comprado", ubicacion2,obra1);
//        System.out.println("CODIGO BARRAS EJEMPLAR 1" + ejemplar1.getCodigoBarras());
//        System.out.println("CODIGO BARRAS EJEMPLAR 2" + ejemplar2.getCodigoBarras());
//        
//        List<Ejemplar> ejemplaresDisponiblesObra1 = obra1.ejemplaresDisponiblesAreaReferencia("Area tecnologia");
//        
//        for (Ejemplar ejemplar : ejemplaresDisponiblesObra1) {
//			System.out.println("Titulo ejemplar: "+ ejemplar.getObra().getTitulo() +"\nEjemplar en prestamo? "+ ejemplar.isEnPrestamo());
//		}
        obra5.setSolicitudGeneral(5);
        obra2.setSolicitudGeneral(29);
        
        obra6.setSolicitudFacultad(12);
        obra3.setSolicitudFacultad(1);
        
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
        
//        //Escritura del ListObras al archivos obras.txt
//        FileOutputStream fos = new FileOutputStream("obras.txt");
//        ObjectOutputStream output = new ObjectOutputStream(fos);
//        
//        int tamanio = listaObras.size();
//        output.writeInt(tamanio);
//        
//        for (Obra p: listaObras) {
//            output.writeObject(p);
//        }
//        output.close();
//        fos.close();
//        
//        //Lectura de obras.
//        FileInputStream fin = new FileInputStream("obras.txt");
//        ObjectInputStream input = new ObjectInputStream(fin);
//        List<Obra> obrasArchivo = new ArrayList<>();
//        int n = input.readInt();
//        Obra aux;
//        for(int i = 0; i < n; i++ ){
//            aux = (Obra)input.readObject();
//            obrasArchivo.add(aux);
//        }
        
//        System.out.println("IMPRESION ELEMENTOS DEL ARCHIVO");
//        for (Obra obra : obrasArchivo) {
//            System.out.println(obra.getTitulo());
//        }

//        List<Obra> solicitadosGeneral = Obra.getSolicitudGeneral(listaObras);
//        System.out.println("SOLICITUDES GENERAL:\n");
//        for (Obra obra : solicitadosGeneral) {
//			System.out.println(obra.getTitulo()+ "\n" + obra.getSolicitudGeneral());
//		}
//        
//        System.out.println("\nSOLICITUDES FACULTAD:\n");
//        List<Obra> solicitadosFacultad = Obra.getSolicitudFacultad(listaObras);
//        for (Obra obra : solicitadosFacultad) {
//			System.out.println(obra.getTitulo()+ "\n" + obra.getSolicitudFacultad());
//		}
//        
//        List<Obra> l = Obra.getEditorial(listaObras, "Union");
//        
//        System.out.println("FILTRADO POR EDITORIAL.");
//        String resultado = Obra.imprimirObras(l);
//        System.out.println(resultado);

        GestionDatos datos = new GestionDatos();
//        datos.agregarLector(lector1);
//        datos.agregarLector(lector2);
//        datos.agregarObra(obra1);
//        datos.agregarObra(obra2);
//        datos.agregarUsuario(user1);
//        datos.agregarUsuario(user2);
        List<Obra> solicitudFacultad = datos.getSolicitudFacultad();
        for (Obra obra : solicitudFacultad) {
            System.out.println(obra.getTitulo());
        }
//        VentanaLogueo login = new VentanaLogueo();
//        login.setVisible(true);
;


        
    }
}
