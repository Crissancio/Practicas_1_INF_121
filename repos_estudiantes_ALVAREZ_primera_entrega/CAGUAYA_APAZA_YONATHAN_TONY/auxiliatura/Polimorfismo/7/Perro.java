package animales;
public class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: guau guau");
    }

    public void moverse() {
        System.out.println(nombre + " corre");
    }

    public void mostrar() {
        System.out.println("Perro: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("-------------------");
    }
}

