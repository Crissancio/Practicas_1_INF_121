package EJERCICIO3;

public class Cocinero {
    public String nombre;
    public float sueldoMes;
    public int horasExtra;
    public float sueldoHora;

    public Cocinero(String nombre, float sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal() {
        return this.sueldoMes + (this.horasExtra * this.sueldoHora);
    }

    public void mostrarPorSueldoX(float x) {
        if (this.sueldoMes == x) {
            System.out.println(this.toString());
        }
    }

    public String toString() {
        return "Cocinero: " + this.nombre + ", Sueldo Total: " + this.sueldoTotal();
    }
}
