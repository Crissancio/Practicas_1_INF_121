
package Ejercicios.Ejercicio_9;


public class BloqueTnt {
    private String tipo;
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    // Sobrescribir el método accion
    public void accion() {
        System.out.println("Acción del Bloque TNT de tipo " + tipo + ": ¡Explosión inminente!");
    }

    // Sobrecarga del método colocar
    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque TNT en orientación: " + orientacion);
    }

    // Método romper
    public void romper() {
        System.out.println("Rompiendo el Bloque TNT de tipo " + tipo + ": ¡Boom! El TNT explota.");
    }
}
