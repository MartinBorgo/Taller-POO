package gestion.personas;

import java.util.GregorianCalendar;

public class Bibliotecario extends Usuario {
    private String identificacion;
    
    public Bibliotecario() {
    }

    public Bibliotecario(String identificacion, boolean administrador, String nombreUsuario, String contrasenia) {
        super(administrador, nombreUsuario, contrasenia);
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
