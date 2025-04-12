package Ejercicio9;

public class BloqueCofre {
    private int capacidad;
    private int resistencia;
    private String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    //b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
    //distintos mensajes según el tipo de bloque.
    public void accion() {
        System.out.println("El bloque Cofre de tipo " + tipo + " tiene una capacidad de " + capacidad + " y una resistencia de " + resistencia);
    }
    //c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
    //orientaciones (por ejemplo, en el suelo o en la pared).
    public void colocar(String orientacion) {
        System.out.println("El Bloque Cofre se coloca en la " + orientacion);
    }

    public void colocar(String orientacion, int altura) {
        System.out.println("El Bloque Cofre se coloca en la " + orientacion + " a una altura de " + altura + " bloques");
    }
    //d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
    //distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    public void romper() {
        System.out.println("El bloque Cofre de tipo " + tipo + " se rompe y su contenido se dispersa.");
    }
}
