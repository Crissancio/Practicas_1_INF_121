
package app4;

public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println("🔥 Horno encendido. Puede cocinar " + capacidadComida + " alimentos.");
    }

    public void colocar() {
        System.out.println("Horno colocado en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Horno colocado en la " + orientacion + ".");
    }

    public void romper() {
        System.out.println("El horno se rompio. Ya no puedes cocinar!");
    }
}

