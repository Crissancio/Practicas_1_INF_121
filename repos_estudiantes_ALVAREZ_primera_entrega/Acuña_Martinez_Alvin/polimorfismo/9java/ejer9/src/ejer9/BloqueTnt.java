package ejer9;

public class BloqueTnt {
    private String tipo;
    private int daño;

    // Constructor
    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
        System.out.println("TNT creada: Tipo " + tipo + ", Daño " + daño);
    }

    // Método acción específico
    public void accion() {
        System.out.println("Preparando TNT tipo " + tipo + " (Daño: " + daño + " puntos)");
    }

    // Sobrecarga de colocar()
    public void colocar() {
        colocar("suelo");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando TNT en la " + orientacion + " (¡Cuidado!)");
    }

    // Método romper específico
    public void romper() {
        System.out.println("¡BOOM! La TNT explotó (Daño: " + daño + ")");
    }
}