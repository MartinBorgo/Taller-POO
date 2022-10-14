package gestion.personas;

import enumeraciones.SexoTipo;
import java.util.GregorianCalendar;

public class Docente extends Lector {
    private String carreras;
	
    public Docente() {
    }

    public Docente(String carreras, String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad, String domicilio, int codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail, sexo);
        this.carreras = carreras;
    }
    
    
    public String getCarreras() {
        return carreras;
    }

    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "%nCarreras:%s", super.toString(), carreras);
    }
	
}
