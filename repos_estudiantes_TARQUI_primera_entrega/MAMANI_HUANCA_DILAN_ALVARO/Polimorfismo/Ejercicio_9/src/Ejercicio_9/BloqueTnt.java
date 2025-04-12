package Ejercicio_9;

public class BloqueTnt {
	private String tipo;
	private int daño;
	
	public BloqueTnt(String tipox, int dañox) {
		this.tipo=tipox;
		this.daño=dañox;
	}
	//b) Creamos el Metodo accion()
	public void accion() {
		System.out.println("!BOOM! La TNT Explota.");
	}
	//c) Sobrecarga el Metodo colocar()
	public void colocar() {
		System.out.println("La TNT ha sido colocada en el Suelo.");
	}
	public void colocar(String orientacion) {
		System.out.println("La TNT ha sido colocada en: "+orientacion+".");
	}
	public void romper() {
		System.out.println("TNT se convierte en un Item.");
	}
}
