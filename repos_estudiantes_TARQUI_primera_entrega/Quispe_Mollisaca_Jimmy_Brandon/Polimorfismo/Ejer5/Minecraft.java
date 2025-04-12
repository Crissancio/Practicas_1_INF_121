package Polimorfismo;

public class Minecraft {
    String tipoBloque;
    int capacidad;
    int resistencia;
    String color;
    int capacidadComida;
    int daño;

    // Constructor para BloqueCofre
    public Minecraft(String tipoBloque, int capacidad, int resistencia) {
        this.tipoBloque = tipoBloque;
        this.capacidad = capacidad;
        this.resistencia = resistencia;
    }

    // Constructor para BloqueTnt
    public Minecraft(String tipoBloque, int daño) {
        this.tipoBloque = tipoBloque;
        this.daño = daño;
    }

    // Constructor para BloqueHorno
    public Minecraft(String tipoBloque, String color, int capacidadComida) {
        this.tipoBloque = tipoBloque;
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    // Método hacerAccion para BloqueCofre
    public void hacerAccion(int resistencia) {
        System.out.println("El Bloque Cofre tipo " + tipoBloque + " abre un espacio de capacidad " + capacidad + ".");
    }

    // Método hacerAccion para BloqueTnt
    public void hacerAccion(double daño) {
        System.out.println("El Bloque TNT tipo " + tipoBloque + " está listo para explotar con un daño de " + daño + ".");
    }

    // Método hacerAccion para BloqueHorno
    public void hacerAccion(String color) {
        System.out.println("El Bloque Horno de color " + color + " cocina alimentos con capacidad de " + capacidadComida + " unidades.");
    }

    // Método colocar para Bloques
    public void colocar(String orientacion) {
        System.out.println("El bloque " + tipoBloque + " se ha colocado en la " + orientacion + ".");
    }

    // Método romper para BloqueCofre
    public void romper(int resistencia) {
        System.out.println("El Bloque Cofre tipo " + tipoBloque + " se rompe y los objetos caen al suelo.");
    }

    // Método romper para BloqueTnt
    public void romper(double daño) {
        System.out.println("El Bloque TNT tipo " + tipoBloque + " explota causando un daño de " + daño + ".");
    }

    // Método romper para BloqueHorno
    public void romper(String color) {
        System.out.println("El Bloque Horno de color " + color + " se rompe y pierde su capacidad de cocinar alimentos.");
    }

    public static void main(String[] args) {
        // Instanciar bloques
        Minecraft cofre1 = new Minecraft("Cofre", 64, 10);
        Minecraft cofre2 = new Minecraft("Cofre", 128, 20);

        Minecraft tnt1 = new Minecraft("TNT", 50);
        Minecraft tnt2 = new Minecraft("TNT", 100);

        Minecraft horno1 = new Minecraft("Horno", "Rojo", 10);
        Minecraft horno2 = new Minecraft("Horno", "Negro", 20);

        System.out.println("--- Bloque Cofre ---");
        cofre1.hacerAccion(10);
        cofre2.hacerAccion(20);
        cofre1.colocar("suelo");
        cofre2.colocar("pared");
        cofre1.romper(10);
        cofre2.romper(20);

        System.out.println("\n--- Bloque TNT ---");
        tnt1.hacerAccion(50);
        tnt2.hacerAccion(100);
        tnt1.colocar("suelo");
        tnt2.colocar("pared");
        tnt1.romper(50);
        tnt2.romper(100);

        System.out.println("\n--- Bloque Horno ---");
        horno1.hacerAccion("Rojo");
        horno2.hacerAccion("Negro");
        horno1.colocar("suelo");
        horno2.colocar("pared");
        horno1.romper("Rojo");
        horno2.romper("Negro");
    }
}