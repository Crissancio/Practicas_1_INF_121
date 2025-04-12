package EJERCICIO5;
//Crea una clase Estudiante con nombre, nota_1, nota_2
//a) Agrega un método para calcular el promedio
//b) Agrega un método para verificar si aprobó (promedio &gt;=6)
//c) Crea tres estudiantes, muestra sus promedios y si aprobaron
public class Estudiante {
	private String nombre;
	private float nota_1,nota_2;
	public Estudiante(String nombre,float nota_1,float nota_2) {
		this.nombre = nombre;
		this.nota_1 = nota_1;
		this.nota_2 = nota_2;
	}
	public float Promedio() {
		return (nota_1 + nota_2) / 2;
	}
	public boolean Aprovo() {
		return Promedio() >= 6;
	}
	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Jorge",8,5);
		Estudiante est2 = new Estudiante("Maria",6,10);
		Estudiante est3 = new Estudiante("Migel",3,5);
		
		est1.Promedio();
		System.out.print("El promedio de " + est1.nombre + " es: " + est1.Promedio());
		est1.Aprovo();
		System.out.print("\nAprovo : " + est1.Aprovo());
		est2.Promedio();
		System.out.print("\nEl promedio de " + est2.nombre + " es: "+ est2.Promedio());
		est2.Aprovo();
		System.out.print("\nAprovo : " + est2.Aprovo());
		est3.Promedio();
		System.out.print("\nEl promedio de " +est3.nombre + " es: " + est3.Promedio());
		est3.Aprovo();
		System.out.print("\nAprovo : " + est3.Aprovo());
	}

}
