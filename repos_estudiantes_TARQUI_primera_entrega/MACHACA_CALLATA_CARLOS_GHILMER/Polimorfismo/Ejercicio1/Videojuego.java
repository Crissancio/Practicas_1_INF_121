/*  1. Sea la clase Videojuego:

a) Instanciar al menos 2 videojuegos
b) Sobrecargar el constructor 2 veces
c) Implementar un método mostrar()
d) Sobrecargar el método agregarJugadores() donde en el primero se agregue
solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar. */




package Polimorfismo.Ejercicio1;

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
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1; 
    }

   
    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 1; 
    }

  
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de Jugadores: " + cantidadJugadores);
    }

    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }

    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }

    public static void main(String[] args) {
        
        Videojuego juego1 = new Videojuego("Fornite", "pc", 5);
        Videojuego juego2 = new Videojuego("FIFA 22", "PS4" );

        
        juego1.mostrar();
        juego2.mostrar();

        
        juego1.agregarJugadores();
        juego2.agregarJugadores(3);

       
        System.out.println("\nDespués de agregar jugadores:");
        juego1.mostrar();
        juego2.mostrar();
    }
}