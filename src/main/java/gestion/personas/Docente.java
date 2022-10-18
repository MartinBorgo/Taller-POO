package gestion.personas;

import enumeraciones.SexoTipo;
import java.util.GregorianCalendar;

/**
 * Esta clase hereda de Lector, especifica que es un integrante de la facultad (FCAD) UNER.
 * @author pepeponpin
 */
public class Docente extends Lector {
    private String carreras;

    /**
     * Construye un objeto de tipo Docente con todos sus valores inicializados
     * 
     * @param carreras String
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
    public Docente(String carreras, String nombres, String apellidos, int dni, GregorianCalendar fechaNacimiento, String nacionalidad,
                   String domicilio, int codPostal, String localidad, String numCelular, String mail, SexoTipo sexo) {
        
        super(nombres, apellidos, dni, fechaNacimiento, nacionalidad, domicilio, codPostal, localidad, numCelular, mail, sexo);
        this.carreras = carreras;
    }

    /**
     * Construye un objeto de tipo Docente con sus valores por defecto
     */
    public Docente() {
    }
    
    /**
     * Devuelve la carrera en la que da catedra el docente
     * 
     * @return String
     */
    public String getCarreras() {
        return carreras;
    }

    /**
     * Setea la carrera en la que da caterea el docente
     * 
     * @param carreras String
     */
    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    /**
     * Devuelve la representacion del objeto Docente en forma de String
     * 
     * @return String
     */
    @Override
    public String toString() {
        return String.format("%s,"
                + "%n Carreras: %s", super.toString(), carreras);
    }
	
}
