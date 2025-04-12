package Ejercicio_9;

public class BloqueCofre {
	private int capacidad;
	private int resistencia;
	private String tipo;
	
	public BloqueCofre(int capacidadx, int resistenciax, String tipox) {
		this.capacidad=capacidadx;
		this.resistencia=resistenciax;
		this.tipo=tipox;
	}
	//b) Creamos el Metodo accion()
	public void accion() {
		System.out.println("En el Cofre puedes guardar Objetos.");
	}
	//c) Sobrecarga el Metodo colocar()
	public void colocar() {
		System.out.println("Cofre colocado en el Suelo.");
	}
	public void colocar(String orientacion) {
		System.out.println("Cofre colocado en: "+orientacion+".");
	}
	public void romper() {
		System.out.println("Cofre Roto! Se cayeron todos los objetos.");
	}
	
	
	
}
