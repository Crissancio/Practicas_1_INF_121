package Polimorfismo.Ejercicio3;

public class Administrativo extends Empleado {
    String cargo;

    public Administrativo(String nombre, int sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    public float calcularSueldoTotal() {
        return sueldoMes;
    }

    @Override
    public void mostrarEmpleado() {
        super.mostrarEmpleado();
        System.out.println("Tipo: Administrativo, Cargo: " + cargo + ", Sueldo Total: " + calcularSueldoTotal());
    }
}
