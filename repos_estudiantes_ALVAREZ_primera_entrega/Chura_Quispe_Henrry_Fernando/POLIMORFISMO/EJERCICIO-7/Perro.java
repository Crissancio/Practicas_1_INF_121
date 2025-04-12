package Animales;

public class Perro {
	private String sonido;
	private String movimiento;
	
	public Perro(String sonido,String movimiento) {
		this.sonido=sonido;
		this.movimiento=movimiento;
	}
	
	//b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
	//característico.
	public void hacerSonido() {
		System.out.println("el Perro hace  el sonido "+sonido);
	}
	
	//c) Implementar un método moverse() que indique cómo se mueve cada animal
	//(correr, saltar, volar, etc.).
	public void moverse() {
		System.out.println("el movimiento que hace el Perro es "+movimiento);
	}
}
