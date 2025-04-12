/*  5. Crea una clase Estudiante con nombre, nota_1, nota_2
a) Agrega un método para calcular el promedio
b) Agrega un método para verificar si aprobó (promedio &gt;=6)
c) Crea tres estudiantes, muestra sus promedios y si aprobaron */

package Intropoo.Ejercicio3;

public class Estudiante {
    private String nombre;
    private double nota_1;
    private double nota_2;

    public Estudiante(String nombre, double nota_1, double nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    // a) metodo calcular promedio

    public double calcularPromedio() {
        return (nota_1 + nota_2) / 2;
        
    }

    // b) metodo verifiAprovacion

    public double verificarAprovacion() {
        double promedio = calcularPromedio();
        if (promedio >= 6) {
            System.out.println(nombre + " aprobo la materia.");
        } else {
            System.out.println(nombre + " No aprobo la materia.");
        }
        return promedio;
    }
    public void mostrarPromedio() {
        System.out.println("El promedio de " + nombre + " es: " + calcularPromedio());
    }
   


    public static void main(String[] args) {

        // c) Crear 3 estudiantes y mostrar su promedio y si aprobaron
        Estudiante e1 = new Estudiante("Carlos", 5, 6);
        Estudiante e2 = new Estudiante("Mauricio", 7, 8);
        Estudiante e3 = new Estudiante("Manuel", 4, 5);
       
        System.out.println("------ Estudiante1 ------");
        e1.mostrarPromedio();
        e1.verificarAprovacion();
        System.out.println("------ Estudiante2 ------");
        e2.mostrarPromedio();  
        e2.verificarAprovacion();         
        System.out.println("------ Estudiante3 ------");
        e3.mostrarPromedio();
        e3.verificarAprovacion();
        
       
        
        
       
       
    }
 
    
}
