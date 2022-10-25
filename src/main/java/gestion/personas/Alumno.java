package gestion.personas;

import enumeraciones.SexoTipo;
import java.util.GregorianCalendar;

/**
 * Esta clase Alumno hereda de la clase lector, especifica que es un integrante de la facultad (FCAD) UNER.
 * @author Grupo 2
 */
public class Alumno extends Lector {
    private String carrera;

    /**
     * Cosntruye un objeto de tipo Alumno con todos sus valores inicializados
     * 
     * @param carrera String
     * @param nombres String
     * @param apellidos String
     * @param dni Integer
     * @param fechaNacimiento GregorianCalendar
     * @param nacionalidad String
     * @param domicilio String
     * @param codPostal Integer
     * @param localidad String
     * @param numCelular String
     * @param mail String
     * @param sexo SexoTipo
     */
    public Alumno(String carrera, String nombres, String apellidos, Integer dni, GregorianCalendar fechaNacimiento, String nacionalidad, 
                  String domicilio, Integer codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
        
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail, sexo);
        this.carrera = carrera;
    }
    
    /**
     * Construye un objeto de tipo Alumno con sus valores por defecto
     */
    public Alumno() {
    }

    /**
     * Devuelve la/s carrera/s que esta cursando el alumno
     * 
     * @return String
     */
    public String getCarreras() {
	return carrera;
    }

    /**
     * Setea la/s carrera/s en que cursa el alumno
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
        return String.format("%s |"
                + "%n Carrera: %s", super.toString(),carrera);
    }
	
}
