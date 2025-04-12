package Minceraft;

public class BloqueHorno {
	 private String color;
	    private int capacidadComida;

	    public BloqueHorno(String color, int capacidadComida) {
	        this.color = color;
	        this.capacidadComida = capacidadComida;
	    }

	    // Método accion sobrescrito
	    public void accion() {
	        System.out.println("Horno " + color + " listo para cocinar " + capacidadComida + " alimentos");
	    }

	    // Método colocar sobrecargado
	    public void colocar() {
	        System.out.println("Horno colocado en el suelo");
	    }

	    public void colocar(String orientacion) {
	        System.out.println("Horno colocado en " + orientacion + " (asegúrate de dejar espacio para el humo)");
	    }

	    // Método romper sobrescrito
	    public void romper() {
	        System.out.println("Rompiendo horno... ¡Recuerda sacar la comida primero!");
	    }
}
