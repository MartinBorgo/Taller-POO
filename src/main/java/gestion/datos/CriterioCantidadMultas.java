/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.datos;

import gestion.personas.Lector;
import java.util.Comparator;

/**
 *
 * @author Grupo 2
 */
class CriterioCantidadMultas implements Comparator<Lector>{

    /**
     * Se utiliza en GestionDatos para getMultas()
     * @param o1 Lector
     * @param o2 Lector
     * @return int
     */
    @Override
    public int compare(Lector o1, Lector o2) {
        int diff = o1.cantidadMultas() - o2.cantidadMultas();
        return diff;
    }
    
}
