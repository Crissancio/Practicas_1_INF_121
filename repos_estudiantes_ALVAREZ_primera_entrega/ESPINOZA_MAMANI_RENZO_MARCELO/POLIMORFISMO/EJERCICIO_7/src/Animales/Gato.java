package Animales;

public class Gato {
	private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Método hacerSonido sobrecargado
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    public void hacerSonido(boolean enfadado) {
        if (enfadado) {
            System.out.println(nombre + " dice: ¡MIAUUU! (está enfadado)");
        } else {
            hacerSonido();
        }
    }

    // Método moverse
    public void moverse() {
        System.out.println(nombre + " está saltando silenciosamente.");
    }
}
