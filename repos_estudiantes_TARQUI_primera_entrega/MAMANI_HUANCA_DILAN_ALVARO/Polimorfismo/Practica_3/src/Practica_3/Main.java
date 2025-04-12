package Practica_3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//A) Instanciamos:
		//1 Cocinero
		Cocinero c1=new Cocinero("Carlos", 2500, 30, 50.0f);
		//2 Mesero
		Mesero m1=new Mesero("Ana", 2000, 5, 20.0f, 70.0f);
		Mesero m2=new Mesero("Luis", 2100, 8, 25.0f, 50.0f);
		//2 Administrativo
		Administrativo a1=new Administrativo("Pedro", 6000.0f, "Gerente");
		Administrativo a2=new Administrativo("Marta", 4500.0f, "Contadora");
		
		//Mostramos
		//b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
		//sumándole las horas extra, considerando el sueldo por hora y la propina
		//en caso de los meseros.
		System.out.println("Sueldo Cocinero: " + c1.sueldoTotal());
        System.out.println("Sueldo Mesero 1: " + m1.sueldoTotal());
        System.out.println("Sueldo Mesero 2: " + m2.sueldoTotal());
        System.out.println("Sueldo Admin. 1: " + a1.sueldoTotal());
        System.out.println("Sueldo Admin. 2: " + a2.sueldoTotal());
        
        //c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
        //SueldoMes igual a X.
        Scanner leer=new Scanner(System.in);
        float dato;
        System.out.println("\nIntro. el Sueldo: ");
        dato=leer.nextFloat();
        System.out.println("Empleados con sueldo total igual a " + dato + ":");
        if (c1.sueldoTotal(dato)) {
        	System.out.println("Cocinero: " + c1.getNombre());
        }
        if (m1.sueldoTotal(dato)) {
        	System.out.println("Mesero: " + m1.getNombre());
        }
        if (m2.sueldoTotal(dato)) {
        	System.out.println("Mesero: " + m2.getNombre());
        }
        if (a1.sueldoTotal(dato)) {
        	System.out.println("Administrativo: " + a1.getNombre());
        }
        if (a2.sueldoTotal(dato)) {
        	System.out.println("Administrativo: " + a2.getNombre());
        }
	}
}
