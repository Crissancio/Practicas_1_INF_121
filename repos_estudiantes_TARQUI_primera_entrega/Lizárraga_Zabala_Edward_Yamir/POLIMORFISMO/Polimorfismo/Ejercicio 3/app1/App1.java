
package app1;

public class App1 {
    public static void main(String[] args) {
        // a) Instanciar empleados
        Cocinero cocinero = new Cocinero("Luis", 1000, 10, 15);

        Mesero mesero1 = new Mesero("Ana", 900, 5, 10, 50);
        Mesero mesero2 = new Mesero("Pedro", 900, 8, 10, 40);

        Administrativo admin1 = new Administrativo("Lucia", 1200, "Gerente");
        Administrativo admin2 = new Administrativo("Mario", 900, "Asistente");

        // b) Mostrar todos los empleados con sueldo total
        cocinero.mostrar();
        mesero1.mostrar();
        mesero2.mostrar();
        admin1.mostrar();
        admin2.mostrar();

        // c) Mostrar empleados con sueldo base igual a 900
        float x = 900;
        System.out.println("\nEmpleados con sueldo base igual a $" + x + ":");

        Empleado[] empleados = { cocinero, mesero1, mesero2, admin1, admin2 };

        for (Empleado e : empleados) {
            if (e.sueldoIgualA(x)) {
                e.mostrar();
            }
        }
    }
}

