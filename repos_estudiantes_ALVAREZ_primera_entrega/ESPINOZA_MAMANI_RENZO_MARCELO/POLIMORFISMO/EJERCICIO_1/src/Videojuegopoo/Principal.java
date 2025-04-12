package Videojuegopoo;

public class Principal {
    
	public static void main(String[] args) {
        // a) Instanciar al menos 2 videojuegos
        Videojuego juego1 = new Videojuego("The Legend of Zelda", "Nintendo Switch");
        Videojuego juego2 = new Videojuego("Cyberpunk 2077", "PC", 1000000);
        
        // Mostrar información inicial
        System.out.println("--- Información inicial ---");
        juego1.mostrar();
        System.out.println(); // Salto de línea
        juego2.mostrar();
        
        // Agregar jugadores
        juego1.agregarJugadores(); // Agrega 1 jugador
        juego1.agregarJugadores(5); // Agrega 5 jugadores
        
        juego2.agregarJugadores(10000); // Agrega 10000 jugadores
        
        // Mostrar información después de agregar jugadores
        System.out.println("\n--- Después de agregar jugadores ---");
        juego1.mostrar();
        System.out.println(); // Salto de línea
        juego2.mostrar();
    }
}
