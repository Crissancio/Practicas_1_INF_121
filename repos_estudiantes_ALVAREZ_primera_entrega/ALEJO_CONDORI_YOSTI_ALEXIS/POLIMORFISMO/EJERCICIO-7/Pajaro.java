package Ejercicio7;

public class Pajaro {
	private String nombre;
	private String tipo;
	public Pajaro(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public void hacerSonido() {
		System.out.println(nombre+" dice: ¡Pío!");
	}
	public void hacerSonido(int veces) {
		for (int i = 0; i < veces; i++) {
			System.out.print("¡Pío! ");
		}
		System.out.println();
	}
	public void moverse() {
		System.out.println("el "+nombre + " vuela");
	}
}
