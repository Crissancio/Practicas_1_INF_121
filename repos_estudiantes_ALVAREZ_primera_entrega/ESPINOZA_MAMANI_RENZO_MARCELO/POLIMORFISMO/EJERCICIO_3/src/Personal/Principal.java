package Personal;

public class Principal {
	 public static void main(String[] args) {
	        Cocinero cocinero = new Cocinero("Luis", 3000, 10, 50);
	        Mesero mesero1 = new Mesero("Ana", 2500, 5, 40, 200);
	        Mesero mesero2 = new Mesero("Carlos", 2600, 8, 35, 150);
	        Administrativo admin1 = new Administrativo("Beatriz", 2800, "Contadora");
	        Administrativo admin2 = new Administrativo("Jorge", 3000, "Gerente");

	        System.out.println("=== Sueldos Totales ===");
	        System.out.println("Cocinero: " + cocinero.sueldoTotal());
	        System.out.println("Mesero 1: " + mesero1.sueldoTotal());
	        System.out.println("Mesero 2: " + mesero2.sueldoTotal());
	        System.out.println("Administrativo 1: " + admin1.sueldoTotal());
	        System.out.println("Administrativo 2: " + admin2.sueldoTotal());

	        float x = 3000;
	        System.out.println("\n=== Empleados con sueldoMes = " + x + " ===");
	        cocinero.mostrarSiSueldoIgual(x);
	        mesero1.mostrarSiSueldoIgual(x);
	        mesero2.mostrarSiSueldoIgual(x);
	        admin1.mostrarSiSueldoIgual(x);
	        admin2.mostrarSiSueldoIgual(x);
	    }
}
