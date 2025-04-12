package Ejercicio5;

public class Computadora {
	public String procesador;
	public String memoriaRAM;
	public String almacenamiento;
	public boolean estado;
	public Computadora(String procesador, String memoriaRAM, String almacenamiento) {
		this.procesador = procesador;
		this.memoriaRAM = memoriaRAM;
		this.almacenamiento = almacenamiento;
		this.estado = false;
	}
	public void mostrarComponentes() {
		System.out.println("Procesador: "+procesador);
		System.out.println("Memoria RAM: "+memoriaRAM);
		System.out.println("Almacenamiento: "+almacenamiento);
	}	
	public void mostrarEstado() {
		if(estado) {
			System.out.println("LA CPU ESTA ENCENDIDA");
		}
		System.out.println("LA CPU ESTA APAGADA");
	}
	public void enceder() {
		estado= true;
		System.out.println("ENCENDIENDO CPU");
	}
	public void apagar() {
		estado=false;
		System.out.println("APAGANDO CPU");
	}
}
