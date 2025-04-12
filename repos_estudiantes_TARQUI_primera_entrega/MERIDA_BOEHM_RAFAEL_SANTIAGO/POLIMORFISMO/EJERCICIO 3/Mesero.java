package EJERCICIO3;

public class Mesero {
    public String nombre;
    public float sueldoMes;
    public int horasExtra;
    public float sueldoHora;
    public float propina;

    public Mesero(String nombre, float sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float sueldoTotal() {
        return this.sueldoMes + (this.horasExtra * this.sueldoHora) + this.propina;
    }

    public void mostrarPorSueldoX(float x) {
        if (this.sueldoMes == x) {
            System.out.println(this.toString());
        }
    }

    public String toString() {
        return "Mesero: " + this.nombre + ", Sueldo Total: " + this.sueldoTotal();
    }
}
