package Videojuegopoo;

public class Videojuego {
	// Atributos
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    
    // Constructores
    // Constructor por defecto
    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "No especificada";
        this.cantidadJugadores = 0;
    }
    
    // Constructor sobrecargado 1 (con nombre y plataforma)
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }
    
    // Constructor sobrecargado 2 (con todos los parámetros)
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    
    // Método mostrar
    public void mostrar() {
        System.out.println("Nombre del juego: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
    }
    
    // Métodos agregarJugadores
    // Versión para agregar 1 jugador
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }
    
    // Versión para agregar N jugadores
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }
}
