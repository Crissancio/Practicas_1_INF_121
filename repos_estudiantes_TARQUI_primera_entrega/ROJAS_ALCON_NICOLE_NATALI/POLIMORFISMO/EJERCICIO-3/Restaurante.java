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
    public double SueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
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

    public double SueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
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

    public double SueldoTotal() {
        return sueldoMes;
    }
}

public class Restaurante {
    public static void main(String[] args) {
        Cocinero c1 = new Cocinero("Bernardo", 2600, 10, 20.5f);
        Mesero m1 = new Mesero("Ismael", 2000, 5, 18.0f, 150);
        Mesero m2 = new Mesero("Daniela", 2000, 8, 18.0f, 200);
        Administrativo a1 = new Administrativo("Pedro", 4100f, "Contador");
        Administrativo a2 = new Administrativo("María", 2800f, "Secretaria");

        System.out.println("Sueldos Totales:");
        System.out.println("Cocinero: " + c1.SueldoTotal());
        System.out.println("Mesero 1: " + m1.SueldoTotal());
        System.out.println("Mesero 2: " + m2.SueldoTotal());
        System.out.println("Administrativo 1: " + a1.SueldoTotal());
        System.out.println("Administrativo 2: " + a2.SueldoTotal());

        System.out.println("\nEmpleados con sueldo base igual a 2000:");
        if (m1.sueldoMes == 2000) System.out.println(m1.nombre);
        if (m2.sueldoMes == 2000) System.out.println(m2.nombre);
    }
}

