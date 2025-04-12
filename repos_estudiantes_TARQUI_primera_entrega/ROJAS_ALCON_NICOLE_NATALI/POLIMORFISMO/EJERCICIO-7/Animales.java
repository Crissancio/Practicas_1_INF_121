class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String hacerSonido() {
        return "El perro " + nombre + " dice: ¡Guau guau!";
    }

    public String moverse() {
        return "El perro " + nombre + " corre rápidamente.";
    }
}
class Gato {
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String hacerSonido() {
        return "El gato " + nombre + " dice: ¡Miau miau!";
    }

    public String moverse() {
        return "El gato " + nombre + " salta ágilmente.";
    }
}
class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String hacerSonido() {
        return "El pájaro " + nombre + " dice: ¡Pío pío!";
    }

    public String moverse() {
        return "El pájaro " + nombre + " vuela por los cielos.";
    }
}
public class Animales {
    public static void main(String[] args) {
        Perro perro = new Perro("Moly", 3, "Cocker");
        Gato gato = new Gato("Chetos", "Naranjado");
        Pajaro pajaro = new Pajaro("Piolín", "Canario");

        System.out.println(perro.hacerSonido());
        System.out.println(gato.hacerSonido());
        System.out.println(pajaro.hacerSonido());

        System.out.println(perro.moverse());
        System.out.println(gato.moverse());
        System.out.println(pajaro.moverse());
    }
}
