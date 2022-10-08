/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import java.util.Comparator;

/**
 *
 * @author pepeponpin
 */
class CriterioSolicitudGeneral implements Comparator<Obra>{

    @Override
    public int compare(Obra o1, Obra o2) {
	int diff = o1.getSolicitudGeneral() - o2.getSolicitudGeneral();
	return diff;    
    }
    
}
