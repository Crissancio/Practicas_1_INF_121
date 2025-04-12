
package app;

// Clase Videojuego
public class Videojuego {
    // Atributos privados
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    // Constructor completo
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    // Constructor sobrecargado 1 (nombre y plataforma)
    public Videojuego(String nombre, String plataforma) {
        this(nombre, plataforma, 1); // por defecto 1 jugador
    }

    // Constructor sobrecargado 2 (solo nombre)
    public Videojuego(String nombre) {
        this(nombre, "Plataforma desconocida", 1);
    }

    // Método para mostrar información
    public void mostrar() {
        System.out.println("Videojuego:");
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Plataforma: " + plataforma);
        System.out.println("- Cantidad de jugadores: " + cantidadJugadores);
        System.out.println();
    }

    // Método sobrecargado agregarJugadores() sin parámetros (suma 1)
    public void agregarJugadores() {
        cantidadJugadores += 1;
        System.out.println("Se agrego 1 jugador. Jugadores actuales: " + cantidadJugadores);
    }

    // Método sobrecargado agregarJugadores(int cantidad)
    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Jugadores actuales: " + cantidadJugadores);
    }
}

