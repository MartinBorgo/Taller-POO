/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.datos;

import gestion.inventario.Obra;
import java.util.Comparator;

/**
 * Clase que utiliza la interface comparator, utilizada solo para un metodo.
 * @author Grupo 2
 */
class CriterioSolicitudFacultad implements Comparator<Obra>{

    /**
     * Compara por la solicitudes de facultad, se utiliza en GestionDatos para getSolicitudFacultad()
     * @param o1 Obra
     * @param o2 Obra
     * @return int
     */
    @Override
    public int compare(Obra o1, Obra o2) {
	int diff = o1.getSolicitudFacultad() - o2.getSolicitudFacultad();
	return diff;    
    }
    
}
