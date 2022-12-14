package gestion.personas;

/**
 * Esta clase hereda de Usuario, siendo un bibliotecario el encargado de realizar prestamos.
 * @author Grupo 2
 */
public class Bibliotecario extends Usuario {
    private static Integer incremento = 1;
    
    private Integer identificador;

    /**
     * Construye un objeto Bibliotecario con sus valores inicializados
     * 
     * @param administrador boolean
     * @param nombreUsuario String
     * @param contrasenia String
     */
    public Bibliotecario(boolean administrador, String nombreUsuario, String contrasenia) {
        super(administrador, nombreUsuario, contrasenia);
        this.identificador = incremento;
        
        incremento++;
    }
    
    /**
     * Construye un objeto Bibliotecario con todos sus valores por defecto
     */
    public Bibliotecario() {
    }

    /**
     * Devuelve el codigo que identifica al bibliotecario
     * 
     * @return identificador Integer
     */
    public Integer getIdentificador() {
        return identificador;
    }

    /**
     * Setea un nuevo valor para el codigo identificador del bibliotecario
     * 
     * @param identificador Integer
     */
    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    /**
     * Devuelve la representacion del tipo de dato Bibliotecario en forma de String
     * 
     * @return String
     */
    @Override
    public String toString() {
        return String.format("%s"
                + "%nIdentificacion:%s", super.toString(), identificador);
    }
	
}
