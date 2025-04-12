package ejer;

class Computadora {
	String procesador;
	int ram;
	int almacenamiento;
	boolean encendido;
	
	public Computadora(String procesador, int ram, int almacenamiento) {
		this.procesador = procesador;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.encendido = false;
	}
	public void mostrar() {
		System.out.println("procesador: "+this.procesador);
		System.out.println("ram: "+this.ram);
		System.out.println("almacenamiento: "+this.almacenamiento);
	}
	public void mostrarEstado() {
		if(encendido) {
			System.out.println("Encendido");
		} else {
			System.out.println("Apagado");
		}
	}
	public void encender() {
		if(!encendido) {
			encendido = true;
			System.out.println("Encendiendo...");
		}else {
			System.out.println("Ya está encendida");
		}
	}
	public void apagar() {
		if (encendido) {
			encendido = false;
			System.out.println("Apagando...");
		} else {
			System.out.println("Ya está apagado");
		}
	}
	public static void main(String[] args) {
		Computadora x = new Computadora("i3", 12, 512);
		x.mostrar();
		x.mostrarEstado();
		x.encender();
		x.mostrarEstado();
		x.apagar();
		x.mostrarEstado();
	}
}
