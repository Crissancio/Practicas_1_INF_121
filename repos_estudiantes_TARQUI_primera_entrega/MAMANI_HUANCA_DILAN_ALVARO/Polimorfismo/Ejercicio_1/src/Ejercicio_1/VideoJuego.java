package Ejercicio_1;

public class VideoJuego {
	private String nombre;
	private String plataforma;
	private int cantidadJugadores;
	
	//B) SOBRECARGA DE CONSTRUCTOR 
	//Constructor por Defecto
	public VideoJuego() {
		this.nombre="Tekken-5";
		this.plataforma="Epic Games Store";
		this.cantidadJugadores=2;
	}
	//Constructor por Parametros
	public VideoJuego(String nombrex, String plaformax, int cantidadJugadoresX) {
		this.nombre=nombrex;
		this.plataforma=plaformax;
		this.cantidadJugadores=cantidadJugadoresX;
	}
	//C) IMPLEMENTAR UN METODO MOSTRAR()
	public void Mostrar() {
		System.out.println("< VIDEO JUEGO >");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Plataforma: "+this.plataforma);
		System.out.println("Cant.Jugadores: "+this.cantidadJugadores);
		//Mostramos la cantidad de Jugadores
		for (int i = 0; i < cantidadJugadores; i++) {
			System.out.println("Jugador "+(i+1));
		}
		System.out.println();
	}
	//D) Sobrecargar el método agregarJugadores()
	//Agregar 1 Jugador
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }
    //Agregar n Jugadores
    public void agregarJugadores(int nJugadores) {
        this.cantidadJugadores += nJugadores;
    }
}