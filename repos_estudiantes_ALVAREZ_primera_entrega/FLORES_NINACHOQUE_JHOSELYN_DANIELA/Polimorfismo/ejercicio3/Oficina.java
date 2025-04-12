package ejercicio3;

public class Oficina extends Ambiente {
	private int numEscritorios;

    public Oficina(String nombre, int escritorios) {
        this.nombre = nombre;
        this.numEscritorios = escritorios;
    }

    public void mostrar() {
        System.out.println("Oficina: " + nombre +"\nEscritorios: " + numEscritorios + "\nMuebles totales: " + cantidadMuebles());
    }
}
