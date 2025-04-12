package Ejercicio_9;

public abstract class Computadora {
	private String procesador;
	private int almacenamiento;
	private int ram;
	boolean encendido=false;
	//Constructor
	public Computadora(String procesadorX, int almacenamientoX, int ramx) {
		this.procesador=procesadorX;
		this.almacenamiento =almacenamientoX;
		this.ram=ramx;
	}
	
	//Mostrar Componentes
	public void mostrarComponentes() {
		System.out.println("<--COMPONENTES-->");
		System.out.println("MicroProcesador:"+ this.procesador);
		System.out.println("Almacenamiento: "+this.almacenamiento);
		System.out.println("RAM: "+this.ram);
	}
	
	//Metodos Abstractos: ENCENDIDO/APAGADO (Se implementan en las clases Hijas)
	public abstract void encender();
	public abstract void apagar();
	
}
