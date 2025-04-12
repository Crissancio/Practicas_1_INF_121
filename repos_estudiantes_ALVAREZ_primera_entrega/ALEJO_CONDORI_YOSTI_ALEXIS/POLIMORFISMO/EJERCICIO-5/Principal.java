package Ejercicio5;

public class Principal {
	public static void main(String [] args) {
    Oficina o1 = new Oficina(4, 2, 3);
    Oficina o2 = new Oficina(3, 2, 1);
    Aula a1 = new Aula("A-101", 30, 50);
    Aula a2 = new Aula("A-102", 40, 40);
    Laboratorio lab1 = new Laboratorio("Lab Informática", 25, 10, 25);
    o1.mostrar();
    o2.mostrar();
    a1.mostrar();
    a2.mostrar();
    lab1.mostrar();
    o1.cantidadMuebles("Muebles en oficina 1");
    o2.cantidadMuebles("Muebles en oficina 2");
    a1.cantidadMuebles(true);
    a2.cantidadMuebles(true);
    lab1.cantidadMuebles("Muebles en laboratorio", true);
	}
}
