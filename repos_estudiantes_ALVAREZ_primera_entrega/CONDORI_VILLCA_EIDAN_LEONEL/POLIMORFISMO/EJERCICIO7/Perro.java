package POLIMORFISMO.EJERCICIO7;

public class Perro {
    private String nombre,raza;
    private int edad;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau Guau!");
    }

    public void moverse() {
        System.out.println(nombre + " corre y salta rápidamente.");
    }
}
