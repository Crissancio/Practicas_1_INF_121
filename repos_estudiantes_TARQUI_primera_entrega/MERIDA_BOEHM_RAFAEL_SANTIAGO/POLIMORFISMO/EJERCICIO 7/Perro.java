package EJERCICIO7;

public class Perro {
    public String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El perro " + this.nombre + " dice: ¡Guau guau!");
    }

    public void moverse() {
        System.out.println("El perro " + this.nombre + " corre rápidamente.");
    }

    public String toString() {
        return "Perro -> Nombre: " + this.nombre;
    }
}

