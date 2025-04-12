
package app1;

public class Empleado {
    protected String nombre;
    protected float sueldoMes;

    public Empleado(String nombre, float sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public float getSueldoMes() {
        return sueldoMes;
    }

    public void mostrar() {
        System.out.println("Empleado: " + nombre + " - Sueldo base: $" + sueldoMes);
    }

    
    public boolean sueldoIgualA(float x) {
        return sueldoMes == x;
    }
}

