package restaurante;

public class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes; 
    }

    public void mostrar() {
        System.out.println("Administrativo: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo mensual: " + sueldoMes);
        System.out.println("Sueldo total: " + sueldoTotal());
        System.out.println("---------------------------");
    }

    public void mostrar(float x) {
        if (sueldoMes == x) {
            mostrar();
        }
    }
}
