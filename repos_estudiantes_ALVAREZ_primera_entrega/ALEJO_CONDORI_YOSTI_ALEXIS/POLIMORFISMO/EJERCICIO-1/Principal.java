package Ejercicio1;

public class Principal {
	public static void main(String[]args) {
        Videojuego j1 = new Videojuego();
        Videojuego j2 = new Videojuego("Fortnite", "PC", 100);
        Videojuego j3 = new Videojuego("Dota", "PC", 10);
        j1.mostrar();
        j2.mostrar();
        j3.mostrar();
        j1.agregarJugadores();  
        j2.agregarJugadores(10); 
        j3.agregarJugadores();
        j1.mostrar();
        j2.mostrar();
        j3.mostrar();   
	}
}
