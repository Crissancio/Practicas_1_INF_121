
package app3;

public class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }

    public void moverse() {
        System.out.println(nombre + " esta volando.");
    }
}

