package personas;

import java.util.GregorianCalendar;

public class Bibliotecario extends Persona {
	private String identificacion;

	public Bibliotecario() {
	}

	public Bibliotecario(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento,
			String nacionalidad, String domicilio, int codPostal, String localidad, String numCelular, String mail,
			String identificacion) {
		super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, 
			domicilio, codPostal, localidad, numCelular, mail);
		this.identificacion = identificacion;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
}
