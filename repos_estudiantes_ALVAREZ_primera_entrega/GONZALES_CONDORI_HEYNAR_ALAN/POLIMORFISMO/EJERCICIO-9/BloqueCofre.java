
package Ejercicios.Ejercicio_9;


public class BloqueCofre {
    
    private int capacidad;
    private int resistencia;
    private String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    // Sobrescribir el método accion
    public void accion() {
        System.out.println("Acción del Bloque Cofre de tipo " + tipo + ": Abriendo cofre...");
    }

    // Sobrecarga del método colocar
    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque Cofre en orientación: " + orientacion);
    }

    // Método romper
    public void romper() {
        System.out.println("Rompiendo el Bloque Cofre de tipo " + tipo + ": El cofre se destruye.");
    }
}

