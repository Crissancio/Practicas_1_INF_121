package estudiantesjava;

public class Estudiante {
	private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 6;
    }

    public void mostrarResultado() {
        double promedio = calcularPromedio();
        String estado = aprobo() ? "Aprobó" : "No aprobó";
        System.out.printf("%s - Promedio: %.2f - %s%n", nombre, promedio, estado);
    }
}
