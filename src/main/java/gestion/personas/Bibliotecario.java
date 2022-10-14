package gestion.personas;

public class Bibliotecario extends Usuario {
    private static int incremento = 1;
    
    private int identificador;
    
    public Bibliotecario() {
    }

    public Bibliotecario(boolean administrador, String nombreUsuario, String contrasenia) {
        super(administrador, nombreUsuario, contrasenia);
        this.identificador = incremento;
        
        incremento++;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "%nIdentificacion:%s", super.toString(), identificador);
    }
	
}
