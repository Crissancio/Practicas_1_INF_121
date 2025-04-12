package Ejercicio_1;

public class mainEj1 {
	public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 22, "La Paz");
        Persona p2 = new Persona("Luis", 16, "Quito");
        Persona p3 = new Persona("Sofía", 30, "Bogotá");

        System.out.println(p1.saludar());
        System.out.println(p2.saludar());
        System.out.println(p3.saludar());
        System.out.println("--------------------------------");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("--------------------------------");
        
        System.out.println("¿" + p1.nombre + " es mayor? " + p1.esMayor());
        System.out.println("¿" + p2.nombre + " es mayor? " + p2.esMayor());
        System.out.println("¿" + p3.nombre + " es mayor? " + p3.esMayor());

        
    }
}