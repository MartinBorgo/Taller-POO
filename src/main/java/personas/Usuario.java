package personas;

import java.util.GregorianCalendar;

public class Usuario extends Persona {
	private String []carreras;
	public Usuario() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Usuario(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
			String domicilio, int codPostal, String localidad, String numCelular, String mail, String[] carreras) {
		super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular,
				mail);
		this.carreras = carreras;
	}
	public String[] getCarreras() {
		return carreras;
	}
	public void setCarreras(String[] carreras) {
		this.carreras = carreras;
	}
	
	
}
