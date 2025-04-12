package Polimorfismo;

public class Animales {
    String nombre;
    int edad;
    String raza;
    String color;
    String tipo;

    public Animales(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public Animales(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Animales(String nombre, String tipo, boolean esPajaro) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido(String raza) {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    public void hacerSonido(int placeholder) {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }

    public void hacerSonido(boolean esPajaro) {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }

    public void moverse(String raza) {
        System.out.println(nombre + " corre rápidamente.");
    }

    public void moverse(int placeholder) {
        System.out.println(nombre + " salta con agilidad.");
    }

    public void moverse(boolean esPajaro) {
        System.out.println(nombre + " vuela por los cielos.");
    }

    public static void main(String[] args) {
        Animales perro = new Animales("Homero", 5, "Labrador");
        Animales gato = new Animales("Pepe", "Negro");
        Animales pajaro = new Animales("Finx", "Canario", true);

        System.out.println("--- Sonidos de los animales ---");
        perro.hacerSonido("Pastor Aleman");
        gato.hacerSonido(0);
        pajaro.hacerSonido(true);

        System.out.println("\n--- Movimientos de los animales ---");
        perro.moverse("Pastor Aleman");
        gato.moverse(0);
        pajaro.moverse(true);
    }
}