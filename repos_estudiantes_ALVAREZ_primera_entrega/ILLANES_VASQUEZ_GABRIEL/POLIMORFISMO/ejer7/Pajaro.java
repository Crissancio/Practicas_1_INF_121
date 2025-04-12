
package EJER7;

public class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println("El pájaro canta: ¡Pío Pío!");
    }

    

    public void hacerSonido(String volumen) {
        System.out.println("El pájaro canta con volumen " + volumen + ": ¡PÍO PÍO!");
    }

    public void moverse() {
        System.out.println("El pájaro vuela");
    }
}
