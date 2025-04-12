package poliformismo;


abstract class Bloque{
	abstract void accion();
	abstract void romper();
	void colocar() {
		System.out.println("colocar bloque en el suelo");
	}
	void colocar(String orientacion) {
		System.out.println("colocar  bloque en la "+ orientacion);
	}
	
}

class BloqueCofre extends Bloque{
	private int capacidad;
	private int resistencia;
	private String tipo;
	public BloqueCofre(int capacidad, int resistencia, String tipo) {
		this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
	}
	public void accion() {
		System.out.println("El cofre se puede guardar objetos");
	}
	public void romper() {
		System.out.println("cofre se rompio");
	}
	
}

class BloqueTnt extends Bloque{
	private String tipo;
	private int daño;
	public BloqueTnt(String tipo, int daño) {
		this.tipo = tipo;
		this.daño = daño;
	}
	public void accion() {
		System.out.println("va a explotar!!!");
	}
	public void romper() {
		System.out.println("la dinamita exploto causando "+this.daño);
	}
}

class BloqueHorno extends Bloque{
	private String color;
	private int capacidadComida;
	public BloqueHorno(String color, int capacidadComida) {
		this.color = color;
		this.capacidadComida = capacidadComida;
	}
	public void accion() {
		System.out.println("Sirvepara hacer comida");
	}
	public void romper() {
		System.out.println("Ya no se puede cocinar");
	}
}

public class Minecraft {
	public static void main(String[] args) {
		BloqueCofre cofre1 = new BloqueCofre(20, 5, "Madera");
        BloqueCofre cofre2 = new BloqueCofre(40, 7, "Hierro");
        BloqueTnt tnt1 = new BloqueTnt("Explosiva", 50);
        BloqueTnt tnt2 = new BloqueTnt("Nuclear", 100);
        BloqueHorno horno1 = new BloqueHorno("Gris", 10);
        BloqueHorno horno2 = new BloqueHorno("Negro", 15);
        cofre1.accion();
        tnt1.accion();
        horno1.accion();
        System.out.println("------------------------------");

        cofre2.romper();
        tnt2.romper();
        horno2.romper();
        System.out.println("----------------------------------");
        cofre1.colocar();
        tnt1.colocar("pared");
	}
}
