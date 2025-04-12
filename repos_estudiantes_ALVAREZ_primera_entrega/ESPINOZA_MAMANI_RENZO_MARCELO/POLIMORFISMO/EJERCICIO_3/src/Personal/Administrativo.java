package Personal;

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

    public void mostrarSiSueldoIgual(float x) {
        if (sueldoMes == x) {
            System.out.println(nombre + " (Administrativo) tiene sueldoMes = " + x);
        }
    }
}
