package Polimorfismo.Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Empleado> personal;

    public Restaurant() {
        this.personal = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.personal.add(empleado);
    }

    public void mostrarEmpleadosConSueldo(int sueldo) {
        System.out.println("\nEmpleados con sueldo mensual de " + sueldo + ":");
        boolean encontrado = false;
        for (Empleado empleado : personal) {
            if (empleado.getSueldoMes() == sueldo) {
                empleado.mostrarEmpleado();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron empleados con ese sueldo.");
        }
    }

    public void mostrarEmpleados() {
        System.out.println("\nListado de todo el personal:");
        for (Empleado empleado : personal) {
            empleado.mostrarEmpleado();
        }
    }

    public static void main(String[] args) {
        Restaurant miRestaurante = new Restaurant();

        Cocinero cocinero1 = new Cocinero("Juan Perez", 2500, 10, 25.5f);
        Mesero mesero1 = new Mesero("Ana Gomez", 1800, 15, 18.0f, 350.0f);
        Mesero mesero2 = new Mesero("Carlos Lopez", 1900, 8, 19.5f, 280.0f);
        Administrativo administrativo1 = new Administrativo("Laura Vargas", 3000, "Contador");
        Administrativo administrativo2 = new Administrativo("Pedro Diaz", 2800, "RRHH");

        miRestaurante.agregarEmpleado(cocinero1);
        miRestaurante.agregarEmpleado(mesero1);
        miRestaurante.agregarEmpleado(mesero2);
        miRestaurante.agregarEmpleado(administrativo1);
        miRestaurante.agregarEmpleado(administrativo2);

        System.out.println("\nCalculo de sueldos totales:");
        cocinero1.mostrarEmpleado();
        mesero1.mostrarEmpleado();
        administrativo1.mostrarEmpleado();

        miRestaurante.mostrarEmpleadosConSueldo(1800);
        miRestaurante.mostrarEmpleadosConSueldo(3500);

        miRestaurante.mostrarEmpleados();
    }
}