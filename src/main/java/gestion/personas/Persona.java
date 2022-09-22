package gestion.personas;

import enumeraciones.SexoTipo;
import java.util.GregorianCalendar;

public abstract class Persona {
	private String nombres;
	private String apellidos;
	private int dni;
	private GregorianCalendar fechaNacimiento;
	private SexoTipo sexo;
	private String nacionalidad;
	private String domicilio;
	private int codPostal;
	private String localidad;
	private String numCelular;
	private String mail;
	
	public Persona() {
	}

	public Persona(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
			String domicilio, int codPostal, String localidad, String numCelular, String mail) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.domicilio = domicilio;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.numCelular = numCelular;
		this.mail = mail;
	}

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public SexoTipo getSexo() {
        return sexo;
    }

    public void setSexo(SexoTipo sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
	
}
