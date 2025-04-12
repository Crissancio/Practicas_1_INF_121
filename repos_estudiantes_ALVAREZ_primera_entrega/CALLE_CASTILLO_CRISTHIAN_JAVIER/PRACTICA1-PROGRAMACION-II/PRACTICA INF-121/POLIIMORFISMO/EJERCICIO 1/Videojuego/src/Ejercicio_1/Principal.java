package Ejercicio_1;

public class Principal {
    
	public static void main(String[] args) {
        
        Videojuego juego1 = new Videojuego("The Legend of Zelda", "Nintendo Switch");
        Videojuego juego2 = new Videojuego("Cyberpunk 2077", "PC", 1000000);
        
        System.out.println("--- Información inicial ---");
        juego1.mostrar();
        System.out.println(); 
        juego2.mostrar();
        
        juego1.agregarJugadores(); 
        juego1.agregarJugadores(5); 
        
        juego2.agregarJugadores(10000); 
        
        System.out.println("\n--- Después de agregar jugadores ---");
        juego1.mostrar();
        System.out.println(); 
        juego2.mostrar();
    }
}
