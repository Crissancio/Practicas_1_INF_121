package labmaquinas;

public class Computadora {

	private String marca;

	private String modelo;

	private String procesador;

	private int ramGB;

	private int almacenamientoGB;

	private boolean encendida;
	

	public Computadora(String marca, String modelo, String procesador, int ramGB, int almacenamientoGB) {

	this.marca = marca;

	this.modelo = modelo;

	this.procesador = procesador;

	this.ramGB = ramGB;

	this.almacenamientoGB = almacenamientoGB;

	this.encendida = false; 

	}

	public void encender() {

	if (!encendida) {

	encendida = true;

	System.out.println("La computadora se está encendiendo...");
	System.out.println("¡Computadora encendida!");

	} else {

	System.out.println("La computadora ya está encendida.");

	}

	}

	public void apagar() {

	if (encendida) {

	encendida = false;

	System.out.println("La computadora  se está apagando...");
    System.out.println("¡Computadora apagada!");

	} else {

	System.out.println("La computadora ya está apagada.");

	}

	}

	public void mostrarEstado() {

	String estado = encendida ? "encendida" : "apagada";
	System.out.println("Estado actual: " + estado);

	}

	public String getMarca() { 
		return marca; 
		}

	public String getModelo() { 
		return modelo; 
		}

	public String getProcesador() { 
		return procesador; 
		}

	public int getRamGB() { 
		return ramGB; 
		}

	public int getAlmacenamientoGB() { 
		return almacenamientoGB; 
		}

	public boolean isEncendida() { 
		return encendida; 
		}


	public static void main(String[] args) {

	Computadora miPC = new Computadora("Asus", "ExpertCenter AiO", "Intel ® Celeron ®", 8,32);
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("Computadora");
    System.out.println("-----------------------------------------------------------------------");
	System.out.println("- Marca: " + miPC.getMarca());
	System.out.println("- Modelo: " + miPC.getModelo());
	System.out.println("- Procesador: " + miPC.getProcesador());
	System.out.println("- RAM: " + miPC.getRamGB() + " GB");
	System.out.println("- Almacenamiento: " + miPC.getAlmacenamientoGB() + " GB");
    System.out.println("-----------------------------------------------------------------------");
	miPC.mostrarEstado();
    System.out.println("-----------------------------------------------------------------------");
	System.out.println("\nEncendiendo la computadora...");
	miPC.encender();
	miPC.mostrarEstado();
    System.out.println("-----------------------------------------------------------------------");
	System.out.println("\nApagando la computadora...");
	miPC.apagar();
	miPC.mostrarEstado();
    System.out.println("-----------------------------------------------------------------------");
	}
}
