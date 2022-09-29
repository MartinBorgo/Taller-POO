package gestion.personas;

import java.util.GregorianCalendar;

public class Alumno extends Lector {
	private String carrera;

	public Alumno() {
	}

	public Alumno(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
                      String domicilio, int codPostal, String localidad, String numCelular, String mail, String carrera) {
		
            super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, 
                  domicilio, codPostal, localidad, numCelular,mail);
		
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
                + "%nCarreras:", super.toString()); //Faltaria poner que se retornen las carreras PENDIENTE.
    }
	
}
