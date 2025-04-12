package poliformismo;

class Oficina{
	private int nroSillas;
	private int nroEscritorios;
	private int nroEstanterias;
	public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
		this.nroSillas = nroSillas;
		this.nroEscritorios = nroEscritorios;
		this.nroEstanterias = nroEstanterias;
	}
	public void mostrar() {
		System.out.println("Nro de Sillas " +this.nroSillas+ ". Nro de escritorios " +this.nroEscritorios+ ". Nro de estanteria " + this.nroEstanterias);
	}
	public int cantidadMueble(int nroSillas) {
		int c = this.nroSillas;
		return c;
		
	}
	public int cantidadMueble(int nroSillas, int nroEscritorios) {
		int c = this.nroSillas + this.nroEscritorios;
		return c;
		
	}
	public int cantidadMueble(int nroSillas, int nroEscritorios, int nroEstanterias) {
		int c = this.nroSillas + this.nroEscritorios + this.nroEstanterias;
		return c;
		
	}
}

class Aula{
	private String nombre;
	private int capacidad;
	private int nropupitre;
	
	public Aula(String nombre, int capacidad, int nropupitre) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.nropupitre = nropupitre;
	}
	public void mostrar() {
		System.out.println("Nombre: " +this.nombre+ ". Capacidad: " +this.capacidad+ ". Nro de pupitre " + this.nropupitre);
	}
	public int cantidadMueble(int nroSillas) {
		int c = this.nropupitre;
		return c;
	}
}

class Laboratorio{
	private String nombre;
	private int capacidad;
	private int nroMesas;
	private int nroSillas;
	public Laboratorio(String nombre, int capacidad, int nroMesas , int nroSillas){
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.nroMesas = nroMesas;
		this.nroSillas = nroSillas;
	}
	public void mostrar() {
		System.out.println("Nombre: " +this.nombre+ ". Capacidad: " +this.capacidad+ ". Nro de mesas " +this.nroMesas+" Nro de Sillas " +this.nroSillas);
	}
	public int cantidadMueble() {
		int c = this.nroSillas;
		return c;
		
	}
	public int cantidadMueble(int nroSillas, int nroMesas) {
		int c = this.nroSillas + this.nroMesas;
		return c;
		
	}
}


public class Universidad {
	public static void main(String[] args) {
		Oficina of1 = new Oficina(43,42,45);
		Oficina of2 = new Oficina(33,12,75);
		Aula al1 = new Aula("a", 34, 34);
		Aula al2 = new Aula("b", 33, 32);
		Laboratorio lab1 = new Laboratorio("lab-1", 35, 23, 76);
		
		System.out.println("---------------------------");
		of1.mostrar();
		of2.mostrar();
		al1.mostrar();
		al2.mostrar();
		lab1.mostrar();
		
		System.out.println("---------------------------");
		
		System.out.println(of1.cantidadMueble(0, 0, 0));
		System.out.println(al1.cantidadMueble(0));
		System.out.println(lab1.cantidadMueble(0, 0));
		
	}
	
}
