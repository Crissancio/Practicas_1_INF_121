package POLIMORFISMO.EJERCICIO7;
public class Pajaro {
    private String nombre,tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }

    public void moverse() {
        System.out.println(nombre + " vuela por lo mas alto.");
    }
}
