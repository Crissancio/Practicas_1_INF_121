package polimorfismo;

class Videojuego{
	private String nombre;
	private String plataforma;
	private int cantidadJugadores;
	public Videojuego(String n,String p) {
		this.nombre=n;
		this.plataforma=p;
		this.cantidadJugadores=1;
	}
	public Videojuego(String n,String p,int cj) {
		this.nombre=n;
		this.plataforma=p;
		this.cantidadJugadores=cj;
	}
	public void mostrar() {
		System.out.println("nombre:"+nombre+",plataforma:"+plataforma+",jugadotres:"+cantidadJugadores);
	}
	public void agregarjugadores() {
		cantidadJugadores +=1;
	}
	public void agregarjugadores(int c) {
		cantidadJugadores +=c;
	}
	
	public static void main(String[] args) {
		Videojuego juego1=new Videojuego("fifa 23","playstasion");
		Videojuego juego2=new Videojuego("minecraf","pc");
		juego1.mostrar();
		juego2.mostrar();
		juego1.agregarjugadores();
		juego2.agregarjugadores(2);
		juego1.mostrar();
		juego2.mostrar();
		

	}

}
