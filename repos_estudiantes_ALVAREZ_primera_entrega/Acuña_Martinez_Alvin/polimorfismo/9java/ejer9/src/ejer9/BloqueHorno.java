package ejer9;

public class BloqueHorno {
    private String color;
    private int capacidadComida;

    // Constructor
    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
        System.out.println("Horno creado: Color " + color + ", Capacidad " + capacidadComida + " alimentos");
    }

    public void accion() {
        System.out.println("Usando horno " + color + " (Capacidad: " + capacidadComida + " comidas)");
    }

    public void colocar() {
        colocar("suelo");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando horno en la " + orientacion);
    }

    public void romper() {
        System.out.println("¡Horno roto! La comida se perdió.");
    }
}