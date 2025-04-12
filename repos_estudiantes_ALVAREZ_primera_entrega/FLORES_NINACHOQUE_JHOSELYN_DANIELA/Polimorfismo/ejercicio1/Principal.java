package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		//a) Instanciar al menos 2 videojuegos
	    //b) Sobrecargar el constructor 2 veces
		//c) Implementar un método mostrar()
		//d) Sobrecargar el método agregarJugadores() donde en el primero se agregue 
		//solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
		Videojuego v1=new Videojuego();
		Videojuego v2=new Videojuego("Minecraft","Aventura");
		Videojuego v3=new Videojuego("Fifa 23","Xbox",3);
		
		v2.mostrar();
		v3.mostrar();
		v2.agregarJugadores();
		v2.mostrar();
		v2.agregarJugadores(5);
		v2.mostrar();
	}
}
