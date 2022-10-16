package gestion.personas;

import enumeraciones.SexoTipo;
import java.io.Serializable;
import java.util.GregorianCalendar;

public abstract class Persona implements Serializable {
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

    /**
     * 
     * @param nombres String
     * @param apellidos String
     * @param dni int
     * @param fechaNacimiento GregorianCalendar
     * @param nacionalidad String
     * @param domicilio String
     * @param codPostal int
     * @param localidad String
     * @param numCelular String
     * @param mail String
     * @param sexo SexoTipo
     */
    public Persona(String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
                   String domicilio, int codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
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
        this.sexo = sexo;
    }

    /**
     * Se crea el objeto persona con valores preterminados
     */
    public Persona() {
    }
    
    /**
     * Retorna los nombre/s de la persona
     * @return String
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Ingresa los nombre/s de la persona
     * @param nombres String
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Retorna los apellido/s de la persona
     * @return String
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Ingresa los apellido/s de la persona
     * @param apellidos String
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Retorna el dni de la persona
     * @return int
     */
    public int getDni() {
        return dni;
    }

    /**
     * Ingresa el dni de la persona
     * @param dni int
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * Retorna la fecha de nacimiento de la persona
     * @return GregorianCalendar
     */
    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Ingresa la fecha de nacimiento de la persona
     * @param fechaNacimiento GregorianCalendar
     */
    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Retorna el tipo de sexo de la persona
     * @return SextoTipo
     */
    public SexoTipo getSexo() {
        return sexo;
    }

    /**
     * Ingresa el tipo de sexo de la persona
     * @param sexo SexoTipo
     */
    public void setSexo(SexoTipo sexo) {
        this.sexo = sexo;
    }

    /**
     * Retorna la nacionalidad de la persona
     * @return String
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Ingresa la nacionalidad de la persona
     * @param nacionalidad String
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Retorna el domicilio de la persona
     * @return String
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Ingresa el domicilio de la persona
     * @param domicilio String
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Retorna el codigo postal de la persona
     * @return int
     */
    public int getCodPostal() {
        return codPostal;
    }

    /**
     * Ingresa el codigo postal de la persona
     * @param codPostal int
     */
    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    /**
     * Retorna la localidad de la persona
     * @return String
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Ingresa la localidad de la persona
     * @param localidad String
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Retorna el numero de celular de la persona
     * @return String
     */
    public String getNumCelular() {
        return numCelular;
    }

    /**
     * Ingresa el numero de celular de la persona
     * @param numCelular String
     */
    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    /**
     * Retorna el correo electronico de la persona
     * @return 
     */
    public String getMail() {
        return mail;
    }

    /**
     * Ingresa el correo electronico de la persona
     * @param mail String
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Retorna un string que representa a el objeto persona
     * @return String
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s"
                + "%nApellidos:%s"
                + "%nDNI:%s"
                + "%nNumero celular:%s", 
                nombres, apellidos, dni, numCelular);
    }
	
}
