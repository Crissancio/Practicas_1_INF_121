//3. Un restaurante organiza a su personal mediante las siguientes clases:
package restaurante;

public class Main {

	//a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
	
	
	public static void main(String[] args) {
		Cocinero coci = new Cocinero("chavelo",300,2,3);
		Mesero mesero1 = new Mesero("juan",200,3,23,12);
		Mesero mesero2 = new Mesero("carlos",500,5,13,2);
		Administrativo admin1 =new Administrativo("mario",23,"administra productos");
		Administrativo admin2 = new Administrativo("roberto",20,"administra el local");
		
		coci.sueldoTotal();
		System.out.println("------------------");
		mesero1.sueldoTotal();
		mesero2.sueldoTotal();
		System.out.println("--------------------");
		admin1.sueldoTotal();
		admin2.sueldoTotal();
			
		 System.out.println("\nEmpleados con sueldo igual a 200:");
		 verificarSueldo(coci, 300);  // Sueldo mensual del coci
		 verificarSueldo(mesero1, 200);  // Sueldo mensual del mesero1
		 verificarSueldo(mesero2, 500);  // Sueldo mensual del mesero2
		 verificarSueldo(admin1, 23);  // Sueldo mensual del adminin1
		 verificarSueldo(admin2, 20);  // Sueldo mensual del adminin2
	}

	//c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
	//SueldoMes igual a X.
	 public static void verificarSueldo(Object empleado, float sueldoX) {
	        if (empleado instanceof Cocinero) {
	            Cocinero c = (Cocinero) empleado;
	            if (c.getSueldoMes() == sueldoX) {
	                System.out.println("Cocinero " + c.getNombre() + " tiene un sueldo igual a " + sueldoX);
	            }
	        } else if (empleado instanceof Mesero) {
	            Mesero m = (Mesero) empleado;
	            if (m.getSueldoMes() == sueldoX) {
	                System.out.println("Mesero " + m.getNombre() + " tiene un sueldo igual a " + sueldoX);
	            }
	        } else if (empleado instanceof Administrativo) {
	            Administrativo a = (Administrativo) empleado;
	            if (a.getSueldoMes() == sueldoX) {
	                System.out.println("Administrativo " + a.getNombre() + " tiene un sueldo igual a " + sueldoX);
	            }
	        }
	        }
	    }      