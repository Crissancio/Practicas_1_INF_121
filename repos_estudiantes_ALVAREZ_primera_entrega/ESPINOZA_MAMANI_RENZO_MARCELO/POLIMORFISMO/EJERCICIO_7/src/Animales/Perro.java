package Animales;

public class Perro {
	private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    // Método hacerSonido sobrecargado
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    public void hacerSonido(int veces) {
        System.out.print(nombre + " dice: ");
        for (int i = 0; i < veces; i++) {
            System.out.print("Guau ");
        }
        System.out.println();
    }

    // Método moverse
    public void moverse() {
        System.out.println(nombre + " está corriendo alegremente.");
    }
}
