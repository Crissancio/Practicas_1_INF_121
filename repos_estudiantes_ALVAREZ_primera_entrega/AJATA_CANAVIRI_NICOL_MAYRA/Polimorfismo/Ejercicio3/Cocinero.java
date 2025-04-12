package Polimorfismo.Ejercicio3;

public class Cocinero extends Empleado {
    int horasExtra;
    float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float calcularSueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    @Override
    public void mostrarEmpleado() {
        super.mostrarEmpleado();
        System.out.println("Tipo: Cocinero, Horas Extra: " + horasExtra + ", Sueldo por Hora: " + sueldoHora + ", Sueldo Total: " + calcularSueldoTotal());
    }
}
