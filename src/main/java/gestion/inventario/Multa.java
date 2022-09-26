/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.inventario;

import java.time.LocalDate;

/**
 *
 * @author martin
 */
public class Multa {
    private LocalDate inicio;
    private LocalDate finalizacion;

    public Multa(LocalDate inicio) {
        this.inicio = LocalDate.now();
        this.calcularFinMulta();
    }

    public Multa() {
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(LocalDate finalizacion) {
        this.finalizacion = finalizacion;
    }
    
    private void calcularFinMulta() {
        this.finalizacion = this.inicio.plusDays(30);
    }
    
}
