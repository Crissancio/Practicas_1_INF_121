package Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		//A) Instanciamos al menos 2 VideoJuegos
		VideoJuego v1=new VideoJuego();
		VideoJuego v2=new VideoJuego("FIFA 2025", "Steam",3);
		//Agregamos +1 Jugador
		v1.agregarJugadores();
		//Agregamos +3 Jugadores
		v2.agregarJugadores(3);
		//Mostramos
		v1.Mostrar();
		v2.Mostrar();

	}

}
