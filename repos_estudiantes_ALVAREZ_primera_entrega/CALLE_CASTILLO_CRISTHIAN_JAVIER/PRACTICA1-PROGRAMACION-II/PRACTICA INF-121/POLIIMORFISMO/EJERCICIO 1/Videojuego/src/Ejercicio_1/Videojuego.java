package Ejercicio_1;

public class Videojuego {
	
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    
    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "No especificada";
        this.cantidadJugadores = 0;
    }
    
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }
    
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    
    public void mostrar() {
        System.out.println("Nombre del juego: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
    }
    
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }
    
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }
}
