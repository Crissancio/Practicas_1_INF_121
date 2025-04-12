package Ejercicio7;

public class Gato {
	private String nombre;
	private String color;
	public Gato(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	public void hacerSonido() {
		System.out.println(nombre+" dice: ¡Miau!");
	}
	public void hacerSonido(int veces) {
		for (int i = 0; i < veces; i++) {
			System.out.print("¡Miau! ");
		}
		System.out.println();
	}
	public void moverse() {
		System.out.println("el "+nombre + " salta");
	}
}
