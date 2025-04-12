public class Gato {
    private String nombre, color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println("Miau!!");
    }

    public void moverse() {
        if (nombre.equals("Garfield")) {
            System.out.println(nombre + " solo duerme y come lasaña");
        } else {
            System.out.println(nombre + " camina, corre y salta");
        }
    }
}