package Polimorfismo;
class Cocinero {
    String nombre;
    int sueldoMes;
    int horasExtra;
    float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    public void mostrarInfo() {
        System.out.println("Cocinero [nombre=" + nombre + ", sueldoMes=" + sueldoMes +
                ", horasExtra=" + horasExtra + ", sueldoHora=" + sueldoHora + "]");
    }
}

class Mesero {
    String nombre;
    int sueldoMes;
    int horasExtra;
    float sueldoHora;
    float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    public void mostrarInfo() {
        System.out.println("Mesero [nombre=" + nombre + ", sueldoMes=" + sueldoMes +
                ", horasExtra=" + horasExtra + ", sueldoHora=" + sueldoHora + ", propina=" + propina + "]");
    }
}

class Administrativo {
    String nombre;
    float sueldoMes;
    String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }

    public void mostrarInfo() {
        System.out.println("Administrativo [nombre=" + nombre + ", sueldoMes=" + sueldoMes +
                ", cargo=" + cargo + "]");
    }
}

public class Restaurante {
    public static void mostrarPorSueldo(Object[] empleados) {
        System.out.println("Información de todos los empleados:");
        for (Object empleado : empleados) {
            if (empleado instanceof Cocinero) {
                ((Cocinero) empleado).mostrarInfo();
            } else if (empleado instanceof Mesero) {
                ((Mesero) empleado).mostrarInfo();
            } else if (empleado instanceof Administrativo) {
                ((Administrativo) empleado).mostrarInfo();
            }
        }
    }

    public static void mostrarPorSueldo(float sueldo, Object[] empleados) {
        System.out.println("Empleados con sueldo mensual igual a " + sueldo + ":");
        for (Object empleado : empleados) {
            if (empleado instanceof Cocinero && ((Cocinero) empleado).sueldoMes == sueldo) {
                ((Cocinero) empleado).mostrarInfo();
            } else if (empleado instanceof Mesero && ((Mesero) empleado).sueldoMes == sueldo) {
                ((Mesero) empleado).mostrarInfo();
            } else if (empleado instanceof Administrativo && ((Administrativo) empleado).sueldoMes == sueldo) {
                ((Administrativo) empleado).mostrarInfo();
            }
        }
    }

    public static void main(String[] args) {
    	
        Cocinero cocinero = new Cocinero("Carlos", 2000, 10, 15.5f);
        Mesero mesero1 = new Mesero("Luis", 1500, 5, 10.0f, 300.5f);
        Mesero mesero2 = new Mesero("Juan", 1800, 3, 8.0f, 200.0f);
        Administrativo admin1 = new Administrativo("Ana", 2500.0f, "Gerente");
        Administrativo admin2 = new Administrativo("Pedro", 1500.0f, "Supervisor");

        Object[] empleados = {cocinero, mesero1, mesero2, admin1, admin2};

        mostrarPorSueldo(empleados);

        mostrarPorSueldo(1500, empleados);
    }
}