package EJERCICIO1;

public class Videojuego {
    public String nombre;
    public String plataforma;
    public int cantidadJugadores;

    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "PC";
        this.cantidadJugadores = 0;
    }

    // Constructor sobrecargado
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    //Agregar 1 jugador
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }

    //Agregar una cantidad específica de jugadores
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }

    public String toString() {
        return "Videojuego - Nombre: " + this.nombre +
               ", Plataforma: " + this.plataforma +
               ", Jugadores: " + this.cantidadJugadores;
    }
}
