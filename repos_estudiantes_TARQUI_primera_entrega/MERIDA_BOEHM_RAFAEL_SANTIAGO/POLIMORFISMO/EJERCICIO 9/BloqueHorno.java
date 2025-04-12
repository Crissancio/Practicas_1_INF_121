package EJERCICIO9;
	
public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println("El horno está cocinando alimentos.");
    }

    public void colocar() {
        System.out.println("Colocando horno en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando horno en la " + orientacion + ".");
    }

    public void romper() {
        System.out.println("El horno se rompió y dejó caer los ingredientes.");
    }

    @Override
    public String toString() {
        return "BloqueHorno [color=" + color + ", capacidadComida=" + capacidadComida + "]";
    }
}

