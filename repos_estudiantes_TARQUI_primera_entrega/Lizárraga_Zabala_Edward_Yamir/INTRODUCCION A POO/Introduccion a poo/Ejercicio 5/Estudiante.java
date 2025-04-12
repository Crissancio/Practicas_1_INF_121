
package estudiante;

public class Estudiante {
    public String nombre;
    public double nota1;
    public double nota2;

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
        System.out.println(nombre + " tiene un promedio de " + promedio);
        if (aprobo()) {
            System.out.println(nombre + " aprobo.\n");
        } else {
            System.out.println(nombre + " no aprobo.\n");
        }
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Laura", 7.5, 6.0);
        Estudiante e2 = new Estudiante("Pedro", 5.0, 4.5);
        Estudiante e3 = new Estudiante("Sofia", 8.0, 9.0);

        e1.mostrarResultado();
        e2.mostrarResultado();
        e3.mostrarResultado();
    }
}

