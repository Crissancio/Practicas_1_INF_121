package Ejercicio_5;

public class AppEstudiante {
	
	   public static void main(String[] args) {
	        Estudiante e1 = new Estudiante("Juan", 8.5, 7.0);
	        Estudiante e2 = new Estudiante("Laura", 5.5, 4.0);
	        Estudiante e3 = new Estudiante("Mario", 6.0, 6.0);

	        System.out.println(e1.toString());
	        e1.aprobo();

	        System.out.println(e2.toString());
	        e2.aprobo();

	        System.out.println(e3.toString());
	        e3.aprobo();
	    }

}
