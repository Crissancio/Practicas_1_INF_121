
package ejercicio7;


public class Estudiante {
    public String nombre;
    public int nota_1, nota_2;
    
    public Estudiante(String nombre, int nota_1, int nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1; 
        this.nota_2 = nota_2;
    }
    
    public int Promedio() {
        return (this.nota_1 + this.nota_2) / 2;
    }
    
    public void mostrarPromedio() {
        System.out.println("El promedio de: " + nombre + " es "+ Promedio());
    }
    
    public void aprobado() {
        if (Promedio() > 6) {
            System.out.println(nombre + " Aprobó");
        } else {
            System.out.println(nombre + " Reprobó");
        }
    }
    
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", 9, 8);
        Estudiante e2 = new Estudiante("Ivan", 9, 10);
        Estudiante e3 = new Estudiante("Andres", 4, 6);
        
        e1.mostrarPromedio();
        e1.aprobado();
        e2.mostrarPromedio();
        e2.aprobado();
        e3.mostrarPromedio();
        e3.aprobado();
    }
}
