/*
2. Crea una clase Empleado con nombre y sueldo
a) Agrega un método para calcular el sueldo anual
b) Agrega un método para aplicar un aumento del 10%
c) Crea dos empleados y muestra sus sueldos antes y después del aumento
 */
package empleado;


public class Empleado {

private String nombre;
private float sueldo;

    public Empleado(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public void calcularSueldo(float total){
        total = sueldo * 12;
        System.out.println("El sueldo anual es: " + total);
    }
    
    public void aumento(double aumento){
        aumento = (sueldo * 0.1 )+ sueldo;
        System.out.println("Su sueldo aumentado por mes es: " + aumento);
    }
    
    public static void main(String[] args) {
    
    Empleado empleado1 = new Empleado("Carlos", 1000);
    System.out.println("El sueldo de " + empleado1.nombre + " es " + empleado1.sueldo);
    empleado1.calcularSueldo(0);
    empleado1.aumento(0);
        
    Empleado empleado2 = new Empleado("Juan", 3500);
        System.out.println("El sueldo de " + empleado2.nombre + " es " + empleado2.sueldo);
        empleado2.calcularSueldo(0);
        empleado2.aumento(0);
    }
    
}
