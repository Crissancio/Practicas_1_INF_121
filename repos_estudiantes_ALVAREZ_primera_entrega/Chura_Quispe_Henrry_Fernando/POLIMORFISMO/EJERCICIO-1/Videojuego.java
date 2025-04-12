//POLIFORMISMO
//1. Sea la clase Videojuego:
package poliformismo;

public class Videojuego {
	private String nombre;
	private String plataforma;
	private int cantidadJugadores;
	
	
	//b) Sobrecargar el constructor 2 veces
	public Videojuego() {
		
	}
	public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
		this.nombre=nombre;
		this.plataforma=plataforma;
		this.cantidadJugadores=cantidadJugadores;
		
	}
	public Videojuego(String nombre, String plataforma) {
	    this.nombre = nombre;
	    this.plataforma = plataforma;
	    this.cantidadJugadores = 0; // Valor por defecto
	}

	
	//c) Implementar un método mostrar()
	
	public void mostrar() {
		System.out.println("el nombre es "+nombre+" la plataforma es "+plataforma + " con una cantidad de jugadores "+cantidadJugadores);
	}
	
	//d) Sobrecargar el método agregarJugadores() donde en el primero se agregue
	//solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
	
	public void agregarJugadores(String nombrejugado) {
		System.out.println(" el nombre del primer jugador es  "+nombrejugado);
		
	}
	public void agregarJugadores(int cantidad) {
		cantidadJugadores=cantidadJugadores+cantidad;
		System.out.println("cantidad a umentar es "+cantidad+" y la cantidad de jugadores restantes son "+cantidadJugadores);
		
	}
	
	public static void main(String[] args) {
		//a) Instanciar al menos 2 videojuegos
		Videojuego juego = new Videojuego("teken","steam",3);
		Videojuego juego2 = new Videojuego("left 4","steam",4);
		
		juego.mostrar();
		juego.agregarJugadores("pepe");
		juego.agregarJugadores(3);
		System.out.println("---------------------------------");
		//2
		juego2.mostrar();
		juego2.agregarJugadores("ronald");
		juego2.agregarJugadores(6);
		
	}

}
