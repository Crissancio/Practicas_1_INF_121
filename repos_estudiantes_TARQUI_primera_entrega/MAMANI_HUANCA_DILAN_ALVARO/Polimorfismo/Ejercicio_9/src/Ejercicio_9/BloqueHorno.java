package Ejercicio_9;

public class BloqueHorno {
	private String color;
	private int capacidadComida;
	
	public BloqueHorno(String colorx, int capacidadComidax) {
		this.color=colorx;
		this.capacidadComida=capacidadComidax;
	}
	//b) Creamos el Metodo accion()
	public void accion() {
		System.out.println("El Horno Cocina los alimentos.");
	}
	//c) Sobrecarga el Metodo colocar()
	public void colocar() {
		System.out.println("El Horno ha sido colocado en el Suelo.");
	}
	public void colocar(String orientacion) {
		System.out.println("El Horno ha sido colocado en: "+orientacion+".");
	}
	//d) 
	public void romper() {
		System.out.println("El Horno se convierte en un Item. Se Cayo la Comida!");
	}
}
