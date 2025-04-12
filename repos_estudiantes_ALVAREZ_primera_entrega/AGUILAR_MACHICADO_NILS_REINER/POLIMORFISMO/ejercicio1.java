public class Videojuego {
    private String nombre;
    private String genero;
    private int jugadores;

    public Videojuego() {
        this("Desconocido", "Aventura", 0);
    }
    public Videojuego(String nombre, String genero) {
        this(nombre, genero, 0);
    }

    public Videojuego(String nombre, String genero, int jugadores) {
        this.nombre = nombre;
        this.genero = genero;
        this.jugadores = jugadores;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Género: " + genero + ", Jugadores: " + jugadores);
    }

    public void agregarJugadores(int jugador) {
        this.jugadores += jugador;
    }

    public static void main(String[] args) {
        Videojuego v1 = new Videojuego();
        Videojuego v2 = new Videojuego("FIFA 25", "Deportes");
        Videojuego v3 = new Videojuego("Call of Duty", "Acción", 5);

        v2.agregarJugadores(1);
        v3.agregarJugadores(3);

        v1.mostrar();
        v2.mostrar();
        v3.mostrar();
    }
}
