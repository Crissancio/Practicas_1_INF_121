package ejercicio2;

public class Principal {
	public static void main(String[] args) {
		
		Cocinero c=new Cocinero("Maria", 1900, 10, 9);
		Mesero m1=new Mesero("Mario", 1500, 7, 15, 5);
		Mesero m2=new Mesero("Javier", 1550, 8, 18, 6);
		Administrativo a1=new Administrativo("Juan", 2100, "Gerente");
		Administrativo a2=new Administrativo("Rosa", 2000, "Cajera");
		Empleado em[]= {c,m1,m2,a1,a2};
		
		
		for (Empleado emp : em) {
            emp.mostrar();
        }
		for (Empleado emp : em) {
            if (emp.sueldoIgualA(1500)) {
                emp.mostrar();
            }
        }
	}
}
