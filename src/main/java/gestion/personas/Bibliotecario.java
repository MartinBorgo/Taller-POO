package gestion.personas;

import java.util.GregorianCalendar;

public class Bibliotecario extends Persona {

	public Bibliotecario() {
	}

	public Bibliotecario(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento,
			String nacionalidad, String domicilio, int codPostal, String localidad, String numCelular, String mail,
			String identificacion) {
            
		super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, 
			domicilio, codPostal, localidad, numCelular, mail);
	}

    @Override
    public String toString() {
        return super.toString();
    }
	
}
