package ejercicio3;

public class Aula extends Ambiente {
	 private int capacidad;

	 public Aula(String nombre, int capacidad) {
	     this.nombre = nombre;
	     this.capacidad = capacidad;
	 }
	 public void mostrar() {
		 System.out.println("Aula: " + nombre +"\nCapacidad: " + capacidad +"\nMuebles totales: " + cantidadMuebles());
	    }
}
