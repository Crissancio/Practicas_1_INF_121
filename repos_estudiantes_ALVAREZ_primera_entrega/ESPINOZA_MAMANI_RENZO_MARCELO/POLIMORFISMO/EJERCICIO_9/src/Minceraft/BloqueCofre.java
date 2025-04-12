package Minceraft;

public class BloqueCofre {
	private int capacidad;
    private int resistencia;
    private String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    // Método accion sobrescrito
    public void accion() {
        System.out.println("Abriendo cofre " + tipo + " con capacidad de " + capacidad + " items");
    }

    // Método colocar sobrecargado
    public void colocar() {
        System.out.println("Cofre colocado en el suelo");
    }

    public void colocar(String orientacion) {
        System.out.println("Cofre colocado en " + orientacion);
    }

    // Método romper sobrescrito
    public void romper() {
        System.out.println("Rompiendo cofre... ¡Cuidado con los items que caen!");
    }
}
