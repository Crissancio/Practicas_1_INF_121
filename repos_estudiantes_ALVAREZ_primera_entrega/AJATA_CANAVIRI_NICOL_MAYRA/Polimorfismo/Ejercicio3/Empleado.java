package Polimorfismo.Ejercicio3;

public class Empleado {
    String nombre;
    int sueldoMes;

    public Empleado(String nombre, int sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldoMes() {
        return sueldoMes;
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre + ", Sueldo Mensual: " + sueldoMes);
    }
}
