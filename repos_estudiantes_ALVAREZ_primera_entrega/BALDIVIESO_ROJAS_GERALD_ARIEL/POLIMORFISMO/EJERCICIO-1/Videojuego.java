package poliformismo;

class Videojuego {
	private String nombre;
	private String plataforma;
	private int cantidadJugadores;
	
	public Videojuego() {
		this.nombre = "Desconocido";
		this.plataforma = "Desconocida";
		this.cantidadJugadores =1;
	}
	
	public Videojuego(String nombre, String plataforma) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantidadJugadores = 1;
	}
	
	public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantidadJugadores = cantidadJugadores;
		
	}
	
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Plataforma: " + plataforma);
		System.out.println("Cantidad de jugadores: " + cantidadJugadores);
	}
	
	public void agregarJugadores() {
		this.cantidadJugadores += 1;
		
	}
	public void agregarJugadores(int cantidad) {
		this.cantidadJugadores += cantidad;
		System.out.println("se agregaron " + cantidad);
	}
	
	public static void main(String[] args) {
		Videojuego jue1 = new Videojuego("mine", "pc");
		Videojuego jue2 = new Videojuego("fife", "palr", 5);
		
		jue1.mostrar();
        System.out.println();
        jue2.mostrar();
        
        jue1.agregarJugadores(); 
        jue2.agregarJugadores(3); 
        System.out.println();
        jue1.mostrar();
        System.out.println();
        jue2.mostrar();
	}
	
}
