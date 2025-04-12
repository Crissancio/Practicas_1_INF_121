package Ejercicio1;

public class Videojuego {
	private String nombre;
	private String plataforma;
	private int cantidadJugadores;
	public Videojuego() {
		nombre="No existe :v";
		plataforma="No existe :v";
		cantidadJugadores=0;
	}	
	public Videojuego(String nombre) {
		this.nombre = nombre;
		plataforma="No existe :v";
		cantidadJugadores=0;
	}
	public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantidadJugadores = cantidadJugadores;
	}
	public void mostrar() {
		System.out.println();
		System.out.println("Nombre: "+nombre);
		System.out.println("Plataforma: "+plataforma);
		System.out.println("Cantidad de jugadores: "+cantidadJugadores);
		System.out.println();
	}
	public void agregarJugadores() {
		cantidadJugadores +=1;
	}
	public void agregarJugadores(int cantidad) {
		cantidadJugadores +=cantidad;
	}
}
