//1. Sea la clase Videojuego
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void mostrar() {
        System.out.println("Videojuego: " + nombre + ", de plataforma: " + plataforma
                + ", jugadores en juego: " + cantidadJugadores);
    }

    public void agregarJugadores() {
        System.out.println("El videojuegojuego: " + nombre + ", de plataforma: " + plataforma
                + ", se integro 1 jugador, ahora son: " + (cantidadJugadores + 1) + " jugadores en juego");
    }

    public void agregarJugadores(int nuevaCantidadDeJugadores) {
        if (nuevaCantidadDeJugadores > 1) {
            System.out.println("El videojuegojuego: " + nombre + ", de plataforma: " + plataforma
                    + ", se integraron: " + nuevaCantidadDeJugadores + " jugadores, ahora son: "
                    + (cantidadJugadores + nuevaCantidadDeJugadores) + " jugadores en juego");
        } else {
            agregarJugadores();
        }
    }

    public static void main(String[] args) {
        // a) Instanciar al menos 2 videojuegos
        // b) Sobrecargar el constructor 2 veces
        Videojuego vid1 = new Videojuego("Super Mario Bros.", "Consola", 1);
        Videojuego vid2 = new Videojuego("StarCraft", "PC", 1);
        // c) Implementar un método mostrar()
        vid1.mostrar();
        vid2.mostrar();
        // d) Sobrecargar el método agregarJugadores() donde en el primero se agregue
        // solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
        vid1.agregarJugadores();
        vid2.agregarJugadores(7);
    }

}