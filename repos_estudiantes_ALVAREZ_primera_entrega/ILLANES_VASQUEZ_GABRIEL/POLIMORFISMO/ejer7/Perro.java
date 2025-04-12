
package EJER7;
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
        System.out.println("El perro ladra: ¡Guau Guau!");
    }

    public void hacerSonido(String volumen) {
        System.out.println("El perro ladra con volumen " + volumen + ": ¡GUAU GUAU!");
    }


    public void moverse() {
        System.out.println("El perro corre");
    }
}
