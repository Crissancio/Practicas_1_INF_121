package MInecraft;

public class BloqueHorno {
	private String color;
	private int capacidadComida;
	
	public BloqueHorno(String color,int capacidadComida) {
		this.color=color;
		this.capacidadComida=capacidadComida;
		
	}
	//b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
	//distintos mensajes según el tipo de bloque.
	public void accion() {
		System.out.println("el horno nos sirve para hacer comida , craftear vidrio o hacer carbon vegetal y es de color  "+color+" y una capacidad de "+capacidadComida);
	}
	//c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
	//orientaciones (por ejemplo, en el suelo o en la pared).
	public void colocar(String orientacion) {
		System.out.println(orientacion);
	}
	//d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
	//distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
	public void romper() {
		System.out.println("SE ROMPIO-----se perdio lo almacenado");
	}
}
