
package EJER7;

public class Gato {
 
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }

    

    public void hacerSonido(String volumen) {
        System.out.println("El gato maúlla muy  " + volumen);
    }

    public void moverse() {
        System.out.println("El gato salta");
    }
}


