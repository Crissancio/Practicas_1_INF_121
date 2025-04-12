package Ejercicio_5;

public class Estudiante {
	 public String nombre;
	 public double nota_1;
	 public double nota_2;

	    public Estudiante(String nombre, double nota_1, double nota_2) {
	        this.nombre = nombre;
	        this.nota_1 = nota_1;
	        this.nota_2 = nota_2;
	    }

	    public double calcularPromedio() {
	        return (this.nota_1 + this.nota_2) / 2;
	    }

	    public void aprobo() {
	        if (this.calcularPromedio() >= 6) {
	            System.out.println("Sí aprobó");
	        } else {
	            System.out.println("No aprobó");
	        }
	    }

	    public String toString() {
	        return "Estudiante: " + this.nombre +
	               ", Promedio: " + this.calcularPromedio();
	    }
}
