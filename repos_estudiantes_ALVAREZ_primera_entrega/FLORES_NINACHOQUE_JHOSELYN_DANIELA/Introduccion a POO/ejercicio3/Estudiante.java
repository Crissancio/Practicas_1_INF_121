package ejercicio3;

public class Estudiante {
	public String nombre;
	public int nota1,nota2;
	public Estudiante(String nombre, int nota1, int nota2) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
	public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }
	public boolean aprobo() {
        return calcularPromedio() >= 6;
    }
	public void mostrarPromedioYAprobacion() {
		System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Aprobado: " + (aprobo() ? "Si" : "No"));
	}
	
	
}
