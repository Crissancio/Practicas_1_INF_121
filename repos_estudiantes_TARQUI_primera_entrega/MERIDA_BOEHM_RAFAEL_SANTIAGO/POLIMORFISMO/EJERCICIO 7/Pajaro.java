package EJERCICIO7;

public class Pajaro {
    public String nombre;

    public Pajaro(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El pájaro " + this.nombre + " dice: ¡Pío pío!");
    }

    public void moverse() {
        System.out.println("El pájaro " + this.nombre + " vuela por el cielo.");
    }

    public String toString() {
        return "Pájaro -> Nombre: " + this.nombre;
    }
}
