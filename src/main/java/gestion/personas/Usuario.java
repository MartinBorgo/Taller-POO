package gestion.personas;

import enumeraciones.SexoTipo;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Usuario extends Persona implements Serializable{
    private boolean administrador;
    private String nombreUsuario;
    private String contrasenia;

    public Usuario(boolean administrador, String nombreUsuario, String contrasenia, String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad, String domicilio, int codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail, sexo);
        this.administrador = administrador;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    /**
     * Recebe como parametros:
     * 
     * @param administrador -> boolean
     * @param nombreUsuario -> String
     * @param contrasenia -> String
     *  
     */
    public Usuario(boolean administrador, String nombreUsuario, String contrasenia) {
        this.administrador = administrador;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public Usuario() {
    }

    public boolean esAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
        
    @Override
    public String toString() {
        return String.format("Administrador: %s"
                + "%nNombre usuario: %s"
                + "%nContraseña: %s", administrador, nombreUsuario, contrasenia);
    }
	
	
}
