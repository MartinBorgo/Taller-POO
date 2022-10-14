package gestion.personas;

import enumeraciones.SexoTipo;
import java.util.GregorianCalendar;

public class Alumno extends Lector {
	private String carrera;

	public Alumno() {
	}

    public Alumno(String carrera, String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad, 
            String domicilio, int codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail, sexo);
        this.carrera = carrera;
    }
        
        
	public String getCarreras() {
		return carrera;
	}

	public void setCarreras(String carreras) {
		this.carrera = carreras;
	}

    @Override
    public String toString() {
        return String.format("%s"
                + "%nCarrera:%s", super.toString(), carrera);
    }
	
}
