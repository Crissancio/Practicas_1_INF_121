package IntroduccionPOO.Ejercicio5;

public class Estudiante {
    String nombre;
    double nota1;
    double nota2;

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
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        if (aprobo()) {
            System.out.println("Resultado: Aprobado\n");
        } else {
            System.out.println("Resultado: Reprobado\n");
        }
    }

    // main
    public static void main(String[] args) {
      
        Estudiante estudiante1 = new Estudiante("María", 7.5, 8.0);
        Estudiante estudiante2 = new Estudiante("Luis", 5.5, 6.0);
        Estudiante estudiante3 = new Estudiante("Ana", 4.0, 5.5);

        estudiante1.mostrarResultado();
        estudiante2.mostrarResultado();
        estudiante3.mostrarResultado();
    }
}

