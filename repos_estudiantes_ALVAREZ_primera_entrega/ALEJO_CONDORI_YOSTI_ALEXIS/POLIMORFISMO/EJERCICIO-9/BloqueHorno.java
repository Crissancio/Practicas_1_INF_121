package Ejercicio9;

public class BloqueHorno {
    private String color;
    private int capacidadComida;
    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }
    public void accion() {
        System.out.println("Usaste horno de color "+color+". Capacidad de comida: "+capacidadComida+".");
    }
    public void colocar() {
        System.out.println("Horno colocado en el suelo");
    }

    public void colocar(String orientacion) {
        System.out.println("Horno colocado en "+orientacion);
    }
    public void romper() {
        System.out.println("Rompiste horno de color "+color+". Se destruyeron los alimentos.");
    }
}
