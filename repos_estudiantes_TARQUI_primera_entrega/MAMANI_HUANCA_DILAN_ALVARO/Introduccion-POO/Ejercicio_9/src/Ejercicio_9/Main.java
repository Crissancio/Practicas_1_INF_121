package Ejercicio_9;

public class Main {

	public static void main(String[] args) {
		// Crear una instancia de Laptop
        Laptop Lap1 = new Laptop("Intel Core i7", 16, 512);

        // Mostrar componentes
        System.out.println("<COMPONENTES DE LA COMPUTADORA>");
        Lap1.mostrarComponentes();

        // Mostrar estado, encender y apagar
        System.out.println("\n<ESTADO INICIAL>");
        Lap1.mostrarEstado();

        System.out.println("\n<ENCENDIENDO LA COMPUTADORA>");
        Lap1.encender();
        Lap1.mostrarEstado();

        System.out.println("\n<APAGANDO LA COMPUTADORA>");
        Lap1.apagar();
        Lap1.mostrarEstado();

	}

}
