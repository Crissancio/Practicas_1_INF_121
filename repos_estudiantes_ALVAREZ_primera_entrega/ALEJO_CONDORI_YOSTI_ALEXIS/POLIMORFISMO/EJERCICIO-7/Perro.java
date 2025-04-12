package Ejercicio7;

public class Perro {
	private String nombre;
	private int edad;
	private String raza;

	public Perro(String nombre, int edad, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	public void hacerSonido() {
		System.out.println(nombre+" dice: ¡Guau!");
	}
	public void hacerSonido(int veces) {
		for (int i = 0; i < veces; i++) {
			System.out.print("¡Guau! ");
		}
		System.out.println();
	}
	public void moverse() {
		System.out.println("el "+nombre + " corre");
	}
}
