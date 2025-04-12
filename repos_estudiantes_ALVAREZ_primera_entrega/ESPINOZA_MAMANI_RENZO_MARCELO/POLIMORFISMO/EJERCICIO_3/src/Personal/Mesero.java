package Personal;

public class Mesero {
	private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private float propina;

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

    public void mostrarSiSueldoIgual(float x) {
        if (sueldoMes == x) {
            System.out.println(nombre + " (Mesero) tiene sueldoMes = " + x);
        }
    }
}
