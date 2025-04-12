package Polimorfismo.Ejercicio3;

public class Mesero extends Empleado {
    int horasExtra;
    float sueldoHora;
    float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float calcularSueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    @Override
    public void mostrarEmpleado() {
        super.mostrarEmpleado();
        System.out.println("Tipo: Mesero, Horas Extra: " + horasExtra + ", Sueldo por Hora: " + sueldoHora + ", Propina: " + propina + ", Sueldo Total: " + calcularSueldoTotal());
    }
}
