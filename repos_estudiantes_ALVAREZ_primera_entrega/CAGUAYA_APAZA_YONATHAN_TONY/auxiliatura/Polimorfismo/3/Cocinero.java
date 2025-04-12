package restaurante;

public class Cocinero {
    private String nombre;
    private float sueldoMes;
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, float sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }

    public void mostrar() {
        System.out.println("Cocinero: " + nombre);
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
