package Ejercicio3;

public class Estudiante {
	public String nombre;
	public double nota_1;
	public double nota_2;
	
	public Estudiante(String nombre, double nota_1, double nota_2) {
		this.nombre = nombre;
		this.nota_1 = nota_1;
		this.nota_2 = nota_2;
	}
	public double Promedio() {
		return(nota_1 + nota_2)/2;
	}
	public boolean Aprobo() {
		return Promedio() >=6;
	}
	public void mostrar() {
		System.out.println("Nombre "+nombre);
		System.out.println("Promedio "+Promedio());
		System.out.println("Aprobo"+(Aprobo()?" SI " : " NO "));
	}
}
