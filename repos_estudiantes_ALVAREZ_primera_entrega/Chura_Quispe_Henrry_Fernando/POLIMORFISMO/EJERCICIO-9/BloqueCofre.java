package MInecraft;

public class BloqueCofre {
	private int capacidad;
	private int resistencia;
	private String tipo ;
	
	
	public BloqueCofre(int capacidad,int resistencia,String tipo) {
		this.capacidad=capacidad;
		this.resistencia=resistencia;
		this.tipo=tipo;
	}
	
	//b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
	//distintos mensajes según el tipo de bloque.
	public void accion() {
		System.out.println("el cofre almacena objetos con una capacidad de  "+capacidad+" con una resistencia de "+resistencia+" y el material que esta hecho es de "+tipo);
		
	}
	//c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
	//orientaciones (por ejemplo, en el suelo o en la pared).
	public void colocar(String orientacion) {
		System.out.println(orientacion);
	}
	//d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
	//distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
	public void romper() {
		System.out.println("SE ROMPIO----- se cayo al piso todo lo almacenado en el cofre");
	}
}
