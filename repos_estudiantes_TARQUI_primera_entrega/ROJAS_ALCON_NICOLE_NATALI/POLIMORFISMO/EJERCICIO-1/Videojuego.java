public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public Videojuego(String nombre, String plataforma) {
        this(nombre, plataforma, 1);
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
    }
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Dragon Ball", "PlayStation", 2);
        Videojuego juego2 = new Videojuego("Left4Dead", "PC");  
    
        System.out.println("== Videojuego 1 ==");
        juego1.mostrar();

        System.out.println("\n== Videojuego 2 ==");
        juego2.mostrar();

        juego1.agregarJugadores();       
        juego2.agregarJugadores(3);      

        System.out.println("\n== Después de agregar jugadores ==");
        System.out.println("\n== Videojuego 1 ==");
        juego1.mostrar();

        System.out.println("\n== Videojuego 2 ==");
        juego2.mostrar();
    }
}
