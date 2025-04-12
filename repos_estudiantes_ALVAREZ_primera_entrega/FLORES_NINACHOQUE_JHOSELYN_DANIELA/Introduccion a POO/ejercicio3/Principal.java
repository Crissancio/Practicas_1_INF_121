package ejercicio3;

public class Principal {
	public static void main(String[] args) {
		Estudiante e1=new Estudiante("Angela",10,5);
		Estudiante e2=new Estudiante("Mateo",9,7);
		Estudiante e3=new Estudiante("Alex",5,4);
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
		e1.mostrarPromedioYAprobacion();
		e2.mostrarPromedioYAprobacion();
		e3.mostrarPromedioYAprobacion();
		
		
	}
}
