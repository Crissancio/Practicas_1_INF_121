public class Main {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("FIFA 24", "PlayStation", 2);
        Videojuego juego2 = new Videojuego("Minecraft", "PC");
        juego1.mostrar();
        juego2.mostrar();
        juego1.agregarJugadores();
        juego2.agregarJugadores(3);
    }
}
