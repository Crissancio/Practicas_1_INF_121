
package app1;

public class Cocinero extends Empleado {
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, float sueldoMes, int horasExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    @Override
    public void mostrar() {
        System.out.println("Cocinero: " + nombre + " - Sueldo total: $" + sueldoTotal());
    }
}

