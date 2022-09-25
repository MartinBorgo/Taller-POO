package gestion.personas;

import java.util.GregorianCalendar;

public class Alumno extends Persona {
	private String []carreras;

	public Alumno() {
	}

	public Alumno(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
			String domicilio, int codPostal, String localidad, String numCelular, String mail, String[] carreras) {
		super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, 
				domicilio, codPostal, localidad, numCelular,mail);
		this.carreras = carreras;
	}

	public String[] getCarreras() {
		return carreras;
	}

	public void setCarreras(String[] carreras) {
		this.carreras = carreras;
	}

    @Override
    public String toString() {
        return String.format("%s"
                + "%nCarreras:", super.toString()); //Faltaria poner que se retornen las carreras PENDIENTE.
    }
	
}
