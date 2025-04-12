package Animales;

public class Pajaro {
	private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Método hacerSonido sobrecargado
    public void hacerSonido() {
        System.out.println(nombre + " el " + tipo + " dice: ¡Pío pío!");
    }

    public void hacerSonido(String cantoEspecial) {
        System.out.println(nombre + " el " + tipo + " canta: " + cantoEspecial);
    }

    // Método moverse
    public void moverse() {
        System.out.println(nombre + " está volando elegantemente.");
    }
}
