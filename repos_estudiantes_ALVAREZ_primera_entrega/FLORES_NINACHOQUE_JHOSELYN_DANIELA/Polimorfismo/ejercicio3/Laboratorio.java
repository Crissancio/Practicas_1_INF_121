package ejercicio3;

public class Laboratorio extends Ambiente {
	private String tipo;

    public Laboratorio(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public void mostrar() {
        System.out.println("Laboratorio: " + nombre +"\nTipo: " + tipo +"\nMuebles totales: " + cantidadMuebles());
    }
}
