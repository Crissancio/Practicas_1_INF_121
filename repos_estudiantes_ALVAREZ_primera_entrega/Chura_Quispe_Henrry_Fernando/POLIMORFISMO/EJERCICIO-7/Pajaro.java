package Animales;

public class Pajaro {
	private String sonido;
	private String movimiento;
	
	
	
	public Pajaro(String sonido,String movimiento) {
		this.sonido=sonido;
		this.movimiento=movimiento;
	}
	
	
	//b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
	//característico.
	public void hacerSonido() {
		System.out.println("el pajaro hace  el sonido "+sonido);
	}
	//c) Implementar un método moverse() que indique cómo se mueve cada animal
	//(correr, saltar, volar, etc.).
	public void moverse() {
		System.out.println("el movimiento que hace el Pajaro es "+movimiento);
	}
	
}
