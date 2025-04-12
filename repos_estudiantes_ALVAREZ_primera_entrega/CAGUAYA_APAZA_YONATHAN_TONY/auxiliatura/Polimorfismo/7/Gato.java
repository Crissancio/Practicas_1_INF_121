package animales;
public class Gato {
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: miau");
    }

    public void moverse() {
        System.out.println(nombre + " salta");
    }

    public void mostrar() {
        System.out.println("Gato: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("-------------------");
    }
}
