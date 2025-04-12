
package app4;

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
        System.out.println("Cofre abierto. Puedes almacenar hasta " + capacidad + " objetos.");
    }

    public void colocar() {
        System.out.println("Cofre colocado en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Cofre colocado en la " + orientacion + ".");
    }

    public void romper() {
        System.out.println("El cofre se rompio y solto sus objetos.");
    }
}

