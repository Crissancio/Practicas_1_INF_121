package animales;
public class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: pio pio");
    }

    public void moverse() {
        System.out.println(nombre + " vuela");
    }

    public void mostrar() {
        System.out.println("Pajaro: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("-------------------");
    }
}
