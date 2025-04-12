public class Perro {
    private String nombre, raza;
    private int edad;

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("Guau!!");
    }

    public void moverse() {
        System.out.println(nombre + " corre");
    }
}