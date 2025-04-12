package restaurante;

public class Mesero {
    private String nombre;
    private float sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, float sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }

    public void mostrar() {
        System.out.println("Mesero: " + nombre);
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
