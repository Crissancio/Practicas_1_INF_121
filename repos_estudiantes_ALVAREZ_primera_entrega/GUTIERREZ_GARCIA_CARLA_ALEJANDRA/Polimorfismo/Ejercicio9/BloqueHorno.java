package Ejercicio9;

public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println("El bloque Horno de color " + color + " tiene una capacidad de comida de " + capacidadComida);
    }
    //c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
    //orientaciones (por ejemplo, en el suelo o en la pared).
    public void colocar(String orientacion) {
        System.out.println("El Bloque Horno se coloca en la " + orientacion);
    }

    public void colocar(String orientacion, int altura) {
        System.out.println("El Bloque Horno se coloca en la " + orientacion + " a una altura de " + altura + " bloques");
    }
    //d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
    //distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    public void romper() {
        System.out.println("El bloque Horno de color " + color + " se rompe y la comida vuela.");
    }
    
}
