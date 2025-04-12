package Polimorfismo.Ejercicio1;

public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego() {
        this.nombre = "";
        this.plataforma = "";
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
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
    }

    public void agregarUnJugador() {
        cantidadJugadores += 1;
    }

    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
    }

    // Main 
    public static void main(String[] args) {

        Videojuego videojuego1 = new Videojuego("Minecraft", "PC");
        Videojuego videojuego2 = new Videojuego("FIFA 25", "PlayStation", 2);
        Videojuego videojuego3 = new Videojuego("Call of Duty", "Xbox", 2);

        System.out.println("Estado inicial:");
        videojuego1.mostrar();
        videojuego2.mostrar();
        videojuego3.mostrar();

  
        videojuego1.agregarUnJugador(); 
        videojuego2.agregarJugadores(2); 
        videojuego3.agregarUnJugador(); 

        System.out.println("\nDespues de agregar jugadores:");
        videojuego1.mostrar();
        videojuego2.mostrar();
        videojuego3.mostrar();
    }
}

