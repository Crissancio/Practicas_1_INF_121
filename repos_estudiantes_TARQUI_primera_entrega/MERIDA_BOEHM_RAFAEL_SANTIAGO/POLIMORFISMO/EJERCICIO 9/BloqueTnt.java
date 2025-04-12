package EJERCICIO9;

public class BloqueTnt {
    private String tipo;
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion() {
        System.out.println("La TNT está lista para explotar.");
    }

    public void colocar() {
        System.out.println("Colocando TNT en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando TNT en la " + orientacion + ".");
    }

    public void romper() {
        System.out.println("¡Boom! La TNT explotó.");
    }

    @Override
    public String toString() {
        return "BloqueTnt [tipo=" + tipo + ", daño=" + daño + "]";
    }
}
