/* Ejercicio1 polimorfismo: Sea la clase VideoJuego
   a) Instanciar al menos 2 videojuegos
   b) Sobrecargar el constructor 2 veces
   c) Implementar un método mostrar()
   d) Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
 */
class Main {
    public static void main(String[] args) {
       // a) instanciando al menos 2 videojuegos
        VideoJuego a = new VideoJuego("call of duty", "PlayStation"); // b) Sobrecargando el constructor
        VideoJuego b = new VideoJuego("clashRoyal", "play story", 2); // b) Sobrecargando el constructor
        // c) método mostrar() implementado
        a.mostrar();
        /* 
         d) Sobrecargado el método agregarJugadores() primero se agrego solo 1 jugador.
         */
        a.agregarJugadores();
        // d) Sobrecargado el método agregarJugadores() segundo ingresando una cantidad de jugadores a aumentar.
        a.agregarJugadores(4);
        /* 
         d) Sobrecargado el método agregarJugadores() primero se agrego solo 1 jugador.
         */
        b.agregarJugadores();
        // c) método mostrar() implementado
        b.mostrar();
         // d) Sobrecargado el método agregarJugadores() segundo ingresando una cantidad de jugadores a aumentar.
        b.agregarJugadores(2);
    }
}