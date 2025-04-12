package MInecraft;

public class BloqueTnT {
	private String tipo;
	private int daño;
	
	
	public BloqueTnT(String tipo,int daño) {
		this.tipo=tipo;
		this.daño=daño;
		
	}
//b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
	//distintos mensajes según el tipo de bloque.
	public void accion() {
		System.out.println("el TNT de tipo "+tipo+" hace un daño de " +daño);
	}
	
	//c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
	//orientaciones (por ejemplo, en el suelo o en la pared).
	public void colocar(String orientacion) {
		System.out.println(orientacion);
	}
	//d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
	//distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
	public void romper() {
		System.out.println("SE ROMPIO----- la tnt se guardo en el inventario");
	}
}
