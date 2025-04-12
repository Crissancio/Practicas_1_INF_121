/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

/**
 *
 * @author Fabricio
 */
/*
 * ENUNCIADO:
 * 5. Crea una clase Estudiante con nombre, nota_1, nota_2
 * a) Agrega un método para calcular el promedio
 * b) Agrega un método para verificar si aprobó (promedio >=6)
 * c) Crea tres estudiantes, muestra sus promedios y si aprobaron
 */
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
        return calcularPromedio() >= 6.0;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", 7.5, 8.0);
        Estudiante e2 = new Estudiante("Ana", 4.0, 5.5);
        Estudiante e3 = new Estudiante("Luis", 6.0, 6.0);

        System.out.println(e1.nombre + ": Promedio = " + e1.calcularPromedio() + " (" + (e1.aprobo() ? "Aprobo" : "Reprobo") + ")");
        System.out.println(e2.nombre + ": Promedio = " + e2.calcularPromedio() + " (" + (e2.aprobo() ? "Aprobo" : "Reprobo") + ")");
        System.out.println(e3.nombre + ": Promedio = " + e3.calcularPromedio() + " (" + (e3.aprobo() ? "Aprobo" : "Reprobo") + ")");
    }
}