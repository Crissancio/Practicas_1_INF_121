package Polimorfismo;

public class Videojuego {
	
	private
	String nombre;
	String plataforma;
	int cantidadJugadores;
	

	public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantidadJugadores = cantidadJugadores;
	}
	
	public Videojuego(String nombre, String plataforma) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantidadJugadores = 1;
	}
	
	
	public Videojuego() {
		this.nombre = "Roquet League";
		this.plataforma = "PlayStation";
		this.cantidadJugadores = 1;
	}
	
	public void mostrar() {
		System.out.println("Videojuego [nombre=" + nombre + ", plataforma=" + plataforma + ", cantidadJugadores="
				+ cantidadJugadores + "]");
	}
	
	public void agregarJugadores() {
	        cantidadJugadores += 1;
	        System.out.println("Se agregó 1 jugador. Total ahora: " + cantidadJugadores);
	}
	public void agregarJugadores(int nuevosJugadores) {
	        cantidadJugadores += nuevosJugadores;
	        System.out.println("Se agregaron " + nuevosJugadores + " jugadores. Total ahora: " + cantidadJugadores);
	}

	public static void main(String[] args) {
		Videojuego v1 = new Videojuego("Minecraft", "PC", 5);
        Videojuego v2 = new Videojuego("FIFA 23", "PlayStation");

        System.out.println("--- Videojuego 1 ---");
        v1.mostrar();
        System.out.println("--- Videojuego 2 ---");
        v2.mostrar();

        v1.agregarJugadores();
        v1.agregarJugadores(3);

        v2.agregarJugadores();
        v2.agregarJugadores(4);
	}

}
