package EJERCICIO7;

public class Gato {
    public String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El gato " + this.nombre + " dice: ¡Miau!");
    }

    public void moverse() {
        System.out.println("El gato " + this.nombre + " salta ágilmente.");
    }

    public String toString() {
        return "Gato -> Nombre: " + this.nombre;
    }
}

