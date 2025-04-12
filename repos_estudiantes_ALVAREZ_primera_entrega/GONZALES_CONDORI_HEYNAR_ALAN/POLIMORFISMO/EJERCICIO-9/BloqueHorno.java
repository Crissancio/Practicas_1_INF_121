
package Ejercicios.Ejercicio_9;


public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    // Sobrescribir el método accion
    public void accion() {
        System.out.println("Acción del Bloque Horno de color " + color + ": Cocinando comida...");
    }

    // Sobrecarga del método colocar
    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque Horno en orientación: " + orientacion);
    }

    // Método romper
    public void romper() {
        System.out.println("Rompiendo el Bloque Horno de color " + color + ": El horno se destruye.");
    }
}
