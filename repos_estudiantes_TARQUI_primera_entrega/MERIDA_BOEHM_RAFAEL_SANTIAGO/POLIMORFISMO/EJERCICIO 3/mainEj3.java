package EJERCICIO3;

public class mainEj3 {

	  public static void main(String[] args) {
	        Cocinero c = new Cocinero("Luis", 1200, 10, 20);
	        Mesero m1 = new Mesero("Ana", 1100, 5, 15, 200);
	        Mesero m2 = new Mesero("Pedro", 1000, 8, 18, 150);
	        Administrativo a1 = new Administrativo("Laura", 1500, "Contadora");
	        Administrativo a2 = new Administrativo("Carlos", 1500, "Recursos Humanos");

	        System.out.println(c);
	        System.out.println(m1);
	        System.out.println(m2);
	        System.out.println(a1);
	        System.out.println(a2);

	        System.out.println("\nEmpleados con sueldo base 1500:");
	        c.mostrarPorSueldoX(1500);
	        m1.mostrarPorSueldoX(1500);
	        m2.mostrarPorSueldoX(1500);
	        a1.mostrarPorSueldoX(1500);
	        a2.mostrarPorSueldoX(1500);
	    }
}
