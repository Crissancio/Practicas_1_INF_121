package EJERCICIO1;

public class mainVideojuego {

	public static void main(String[] args) {
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego("FIFA 25", "PlayStation", 4);

        juego1.mostrar();
        juego2.mostrar();

        juego1.agregarJugadores();       //suma 1
        juego2.agregarJugadores(3);      //suma 3

        System.out.println(juego1.toString());
        System.out.println(juego2.toString());
    }

}
