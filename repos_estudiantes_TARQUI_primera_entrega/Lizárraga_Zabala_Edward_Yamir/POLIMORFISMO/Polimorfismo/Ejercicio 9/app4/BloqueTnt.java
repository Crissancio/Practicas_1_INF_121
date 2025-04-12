
package app4;

public class BloqueTnt {
    private String tipo;
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion() {
        System.out.println("TNT activada. Corre!");
    }

    public void colocar() {
        System.out.println("TNT colocada en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("TNT colocada en la " + orientacion + ".");
    }

    public void romper() {
        System.out.println("La TNT exploto causando " + daño + " de danio!");
    }
}

