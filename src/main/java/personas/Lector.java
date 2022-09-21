package personas;

import java.util.GregorianCalendar;

public class Lector extends Persona {
	private boolean estaMultado;

	public Lector() {
	}

	public Lector(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
				String domicilio, int codPostal, String localidad, String numCelular, String mail, boolean estaMultado) {
		
		super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, 
				codPostal, localidad, numCelular,mail);
		
		this.estaMultado = estaMultado;
	}

    public boolean isEstaMultado() {
        return estaMultado;
    }

    public void setEstaMultado(boolean estaMultado) {
        this.estaMultado = estaMultado;
    }
	
	
}
