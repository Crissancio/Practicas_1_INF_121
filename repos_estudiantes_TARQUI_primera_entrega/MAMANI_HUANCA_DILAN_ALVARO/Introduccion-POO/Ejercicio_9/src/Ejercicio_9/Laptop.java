package Ejercicio_9;

public class Laptop extends Computadora{
	
	public Laptop(String procesadorx, int ramX, int almacenamientoX) {
		super(procesadorx, almacenamientoX, ramX);
	}
	
	//Implementacion de los metodos ABSTRACTOS
	//Encender
	@Override
	public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("La laptop se esta encendiendo...");
        } else {
            System.out.println("La laptop ya esta encendida.");
        }
    }
	//Apagar
	@Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("La laptop se esta apagando...");
        } else {
            System.out.println("La laptop ya esta apagada.");
        }
    }

    // Mmostrar estado actual
    public void mostrarEstado() {
        if (encendido) {
            System.out.println("Estado: ENCENDIDO");
        } else {
            System.out.println("Estado: APAGADO");
        }
    }
}
