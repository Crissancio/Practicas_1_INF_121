package minecraft;
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
        System.out.println("El cofre tipo " + tipo + " ha sido abierto.");
    }

    public void colocar() {
        System.out.println("Cofre colocado en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Cofre colocado en la orientacion: " + orientacion);
    }

    public void romper() {
        System.out.println("El cofre fue roto, los objetos han sido expulsados.");
    }
}
