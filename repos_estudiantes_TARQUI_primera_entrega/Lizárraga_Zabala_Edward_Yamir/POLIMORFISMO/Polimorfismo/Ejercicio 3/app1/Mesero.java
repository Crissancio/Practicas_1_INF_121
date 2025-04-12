
package app1;

public class Mesero extends Empleado {
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, float sueldoMes, int horasExtra, float sueldoHora, float propina) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    @Override
    public void mostrar() {
        System.out.println("Mesero: " + nombre + " - Sueldo total: $" + sueldoTotal());
    }
}

