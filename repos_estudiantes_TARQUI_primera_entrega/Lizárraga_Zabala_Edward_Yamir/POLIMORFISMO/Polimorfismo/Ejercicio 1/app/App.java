
package app;

public class App {
    public static void main(String[] args) {
        // a) Instanciar al menos 2 videojuegos usando distintos constructores
        Videojuego juego1 = new Videojuego("FIFA 23", "PS5", 4);
        Videojuego juego2 = new Videojuego("Among Us");

        // c) Mostrar los datos de cada videojuego
        juego1.mostrar();
        juego2.mostrar();

        // d) Usar los métodos sobrecargados para agregar jugadores
        juego1.agregarJugadores();      // +1
        juego1.agregarJugadores(2);     // +2

        juego2.agregarJugadores();      // +1
        juego2.agregarJugadores(5);     // +5
    }
}

