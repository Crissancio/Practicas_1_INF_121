package ejercicio1;
public class Videojuego {
	private String nombre,plataforma;
	private int cantJugadores;
	public Videojuego() {
		this.nombre = "";
		this.plataforma = "";
		this.cantJugadores = 0;
	}
	public Videojuego(String nombre, String plataforma) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantJugadores = 0;
	}
	public Videojuego(String nombre, String plataforma, int cantJugadores) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantJugadores = cantJugadores;
	}
	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", plataforma=" + plataforma + ", cantJugadores=" + cantJugadores + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	public void agregarJugadores() {
        this.cantJugadores += 1;
    }
	public void agregarJugadores(int cant) {
        this.cantJugadores += cant;
    }
}
