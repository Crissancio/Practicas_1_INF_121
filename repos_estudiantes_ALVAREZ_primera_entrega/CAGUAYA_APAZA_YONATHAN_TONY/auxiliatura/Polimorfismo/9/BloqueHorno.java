package minecraft;
public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println("El horno de color " + color + " ha comenzado a cocinar.");
    }

    public void colocar() {
        System.out.println("Horno colocado en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Horno colocado en la orientacion: " + orientacion);
    }

    public void romper() {
        System.out.println("El horno fue roto, se perdio la comida.");
    }
}
