package Minceraft;

public class BloqueTnt {
	 private String tipo;
	    private int daño;

	    public BloqueTnt(String tipo, int daño) {
	        this.tipo = tipo;
	        this.daño = daño;
	    }

	    // Método accion sobrescrito
	    public void accion() {
	        System.out.println("¡La TNT " + tipo + " está a punto de explotar con " + daño + " de daño!");
	    }

	    // Método colocar sobrecargado
	    public void colocar() {
	        System.out.println("TNT colocada en el suelo");
	    }

	    public void colocar(String orientacion) {
	        System.out.println("TNT colocada en " + orientacion + " (¡Ten cuidado!)");
	    }

	    // Método romper sobrescrito
	    public void romper() {
	        System.out.println("¡BOOM! La TNT ha explotado causando " + daño + " de daño");
	    }
}
