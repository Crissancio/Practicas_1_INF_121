
package Ejercicio1;

public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    //b) Sobrecargar el constructor 2 veces
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }
    public Videojuego() {
        this.nombre = "sinNombre";
        this.plataforma = "sinPlataforma";
        this.cantidadJugadores = 0;
    }
    //c) Implementar un método mostrar()
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de Jugadores: " + cantidadJugadores);
    }
    
    //d) Sobrecargar el método agregarJugadores() donde en el primero se agregue
    //solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
        System.out.println("Se agregó 1 jugador. Total jugadores: " + cantidadJugadores);
    }
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Total jugadores: " + cantidadJugadores);
    }
    public static void main(String[] args) {
        //a) Instanciar al menos 2 videojuegos
        Videojuego juego1 = new Videojuego("Left 4 Dead", "Steam", 4);
        Videojuego juego2 = new Videojuego("Call of Duty", "PC");
        juego1.agregarJugadores();
        juego1.agregarJugadores(3);
        juego2.agregarJugadores();
        juego2.agregarJugadores(5);
        juego1.mostrar();
        juego2.mostrar();
    }
}