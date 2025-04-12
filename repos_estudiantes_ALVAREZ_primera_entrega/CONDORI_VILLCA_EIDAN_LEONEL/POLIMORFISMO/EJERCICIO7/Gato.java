package POLIMORFISMO.EJERCICIO7;
public class Gato {
    private String nombre,color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    public void moverse() {
        System.out.println(nombre + " salta y corre ágilmente.");
    }
}

