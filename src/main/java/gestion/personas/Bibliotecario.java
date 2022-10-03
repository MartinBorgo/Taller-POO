package gestion.personas;

import java.util.GregorianCalendar;

public class Bibliotecario extends Persona {
    private String identificacion;
    
    public Bibliotecario() {
    }

    public Bibliotecario(String identificacion, String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, 
            String nacionalidad, String domicilio, int codPostal, String localidad, String numCelular, String mail) {
        
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail);
        this.identificacion = identificacion;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "%nIdentificacion:%s", super.toString(), identificacion);
    }
	
}
