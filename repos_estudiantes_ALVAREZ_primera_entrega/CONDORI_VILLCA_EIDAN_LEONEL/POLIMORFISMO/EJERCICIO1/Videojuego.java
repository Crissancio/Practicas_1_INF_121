package POLIMORFISMO.EJERCICIO1;
//a) Instanciar al menos 2 videojuegos
//b) Sobrecargar el constructor 2 veces
//c) Implementar un método mostrar()
//d) Sobrecargar el método agregarJugadores() donde en el primero se agregue
//solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
public class Videojuego {
    private String nombre,plataforma;
    private int cantidadJugadores;
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
        System.out.println("Cantidad de Jugadores: " + cantidadJugadores);
    }

    
    public void agregarJugadores() {
        cantidadJugadores += 1;
    }

    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
    }
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Assassin's Creed", "PS5");
        Videojuego juego2 = new Videojuego("Minecraft", "PC", 4);
        System.out.println("--Juego 1 ");
        juego1.mostrar();

        System.out.println("\n--Juego 2");
        juego2.mostrar();
        juego1.agregarJugadores();         
        juego2.agregarJugadores(3);       
        System.out.println("\n--Actualizando el Juego 1 ");
        juego1.mostrar();
        System.out.println("\n--Actualizando el Juego 2 ");
        juego2.mostrar();
    }
}
