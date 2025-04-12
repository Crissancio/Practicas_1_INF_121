class BloqueCofre {
    private int capacidad;
    private int resistencia;

    public BloqueCofre(int capacidad, int resistencia) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
    }

    public void accion() {
        System.out.println("El Bloque Cofre se abre para guardar hasta " + capacidad + " objetos.");
    }

    public void colocar() {
        System.out.println("Colocando el Bloque Cofre en la posición predeterminada.");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque Cofre en la orientación: " + orientacion);
    }

    public void romper() {
        System.out.println("El Bloque Cofre se rompe y pierde su contenido.");
    }
}

class BloqueTnt {
    private int daño;

    public BloqueTnt(int daño) {
        this.daño = daño;
    }

    public void accion() {
        System.out.println("El Bloque TNT está listo para explotar con un daño de " + daño + ".");
    }

    public void colocar() {
        System.out.println("Colocando el Bloque TNT en la posición predeterminada.");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque TNT en la orientación: " + orientacion);
    }

    public void romper() {
        System.out.println("¡El Bloque TNT explota al romperse!");
    }
}

class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println("El Bloque Horno " + color + " se enciende para cocinar hasta " + capacidadComida + " alimentos.");
    }

    public void colocar() {
        System.out.println("Colocando el Bloque Horno en la posición predeterminada.");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque Horno en la orientación: " + orientacion);
    }

    public void romper() {
        System.out.println("El Bloque Horno se rompe y deja caer sus materiales.");
    }
}

public class MinecraftSimulacion {
    public static void main(String[] args) {
       
        BloqueCofre cofre1 = new BloqueCofre(10, 5);
        BloqueCofre cofre2 = new BloqueCofre(20, 8);

        BloqueTnt tnt1 = new BloqueTnt(50);
        BloqueTnt tnt2 = new BloqueTnt(100);

        BloqueHorno horno1 = new BloqueHorno("Gris", 3);
        BloqueHorno horno2 = new BloqueHorno("Negro", 5);

        cofre1.accion();
        cofre2.accion();

        tnt1.accion();
        tnt2.accion();

        horno1.accion();
        horno2.accion();

        cofre1.colocar();
        cofre2.colocar("sobre una mesa");

        tnt1.colocar("en la pared");
        tnt2.colocar();

        horno1.colocar("en la esquina");
        horno2.colocar();

        cofre1.romper();
        tnt2.romper();
        horno2.romper();
    }
}

