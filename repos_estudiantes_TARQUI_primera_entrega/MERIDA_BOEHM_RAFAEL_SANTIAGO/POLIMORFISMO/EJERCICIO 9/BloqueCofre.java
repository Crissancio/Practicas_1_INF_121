package EJERCICIO9;

public class BloqueCofre {
    private int capacidad;
    private int resistencia;
    private String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Este cofre puede almacenar objetos.");
    }

    public void colocar() {
        System.out.println("Colocando cofre en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando cofre en la " + orientacion + ".");
    }

    public void romper() {
        System.out.println("¡El cofre se rompió y los objetos cayeron!");
    }

    @Override
    public String toString() {
        return "BloqueCofre [capacidad=" + capacidad + ", resistencia=" + resistencia + ", tipo=" + tipo + "]";
    }
}
