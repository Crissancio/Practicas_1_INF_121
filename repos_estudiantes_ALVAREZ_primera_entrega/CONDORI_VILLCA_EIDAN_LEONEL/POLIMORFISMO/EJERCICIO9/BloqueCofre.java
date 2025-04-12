package POLIMORFISMO.EJERCICIO9;
public class BloqueCofre {
	private int capacidad,resistencia;
	private String tipo;
	public BloqueCofre(int capacidad,int resistencia,String tipo){
		this.capacidad = capacidad;
		this.resistencia = resistencia;
		this.tipo = tipo;
	}
	public void accion() {
		System.out.print("El cofre de "+ tipo+" puede almacenar "+capacidad+" bloques\n");
	}
	public void colocar(){
		System.out.println("El cofre de "+tipo+" se ha colocado en el suelo");
		
	}
	public void colocar(String lugar) {
		System.out.println("Al lado de "+ lugar);
	}
	public void romper() {
		System.out.println("EL cofre de "+tipo+" a superado sus "+resistencia+" de vida y los objetos estan exparcidos");
	}
}
