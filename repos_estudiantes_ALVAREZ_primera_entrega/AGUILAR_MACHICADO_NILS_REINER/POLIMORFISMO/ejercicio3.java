class Empleado {
    protected String nombre;
    protected double sueldoHora;
    protected int horas;

    public Empleado(String nombre, double sueldoHora, int horas) {
        this.nombre = nombre;
        this.sueldoHora = sueldoHora;
        this.horas = horas;
    }

    public double sueldoTotal() {
        return sueldoHora * horas;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Sueldo Total: " + sueldoTotal());
    }

    public boolean sueldoIgualA(double monto) {
        return sueldoTotal() == monto;
    }
}

class Cocinero extends Empleado {
    public Cocinero(String nombre, double sueldoHora, int horas) {
        super(nombre, sueldoHora, horas);
    }

    @Override
    public double sueldoTotal() {
        return super.sueldoTotal() + 100;
    }
}

class Mesero extends Empleado {
    private double propina;

    public Mesero(String nombre, double sueldoHora, int horas, double propina) {
        super(nombre, sueldoHora, horas);
        this.propina = propina;
    }

    @Override
    public double sueldoTotal() {
        return super.sueldoTotal() + propina;
    }
}

class Administrativo extends Empleado {
    public Administrativo(String nombre, double sueldoHora, int horas) {
        super(nombre, sueldoHora, horas);
    }
}

public class Restaurante {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new Cocinero("Luis", 20, 40),
            new Mesero("Ana", 15, 35, 50),
            new Mesero("Carlos", 15, 40, 60),
            new Administrativo("Rosa", 18, 38),
            new Administrativo("Miguel", 17, 36)
        };

        for (Empleado e : empleados) {
            e.mostrar();
        }

        System.out.println("\n-- Empleados con sueldo igual a 650 --");
        for (Empleado e : empleados) {
            if (e.sueldoIgualA(650)) {
                e.mostrar();
            }
        }
    }
}