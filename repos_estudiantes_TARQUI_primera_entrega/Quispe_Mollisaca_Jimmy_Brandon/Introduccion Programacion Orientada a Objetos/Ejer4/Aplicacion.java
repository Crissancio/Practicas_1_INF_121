package IntroPOO;

public class Aplicacion {
	private String nombre;
    private int tamano;

    public Aplicacion(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamano() {
        return tamano;
    }
}
