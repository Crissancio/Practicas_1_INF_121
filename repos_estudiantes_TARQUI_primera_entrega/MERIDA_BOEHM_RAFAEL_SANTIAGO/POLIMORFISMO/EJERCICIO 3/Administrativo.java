package EJERCICIO3;

public class Administrativo {
    public String nombre;
    public float sueldoMes;
    public String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return this.sueldoMes;
    }

    public void mostrarPorSueldoX(float x) {
        if (this.sueldoMes == x) {
            System.out.println(this.toString());
        }
    }

    public String toString() {
        return "Administrativo: " + this.nombre + ", Cargo: " + this.cargo + ", Sueldo Total: " + this.sueldoTotal();
    }
}
