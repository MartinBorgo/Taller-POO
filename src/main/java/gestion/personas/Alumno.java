package gestion.personas;

import enumeraciones.SexoTipo;
import java.util.GregorianCalendar;

/**
 * Esta clase Alumno hereda de la clase lector, especifica que es un integrante de la facultad (FCAD) UNER.
 * @author pepeponpin
 */
public class Alumno extends Lector {
    private String carrera;

    /**
     * Cosntruye un objeto de tipo Alumno con todos sus valores inicializados
     * 
     * @param carrera String
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
    public Alumno(String carrera, String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad, 
                  String domicilio, int codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
        
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail, sexo);
        this.carrera = carrera;
    }
    
    /**
     * Construye un objeto de tipo Alumno con sus valores por defecto
     */
    public Alumno() {
    }

    /**
     * Devuelve la carrera que esta cursando el alumno
     * 
     * @return String
     */
    public String getCarreras() {
	return carrera;
    }

    /**
     * Setea la carrera en que cursa el alumno
     * 
     * @param carreras String
     */
    public void setCarreras(String carreras) {
	this.carrera = carreras;
    }

    /**
     * Devuelve la representacion del objeto Alumno en forma de String
     * 
     * @return String
     */
    @Override
    public String toString() {
        return String.format("%s,"
                + "%n Carrera: %s", super.toString(),carrera);
    }
	
}
