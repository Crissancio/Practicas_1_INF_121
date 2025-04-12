public class Minecraft {
    public static void main(String[] args) {
        BloqueCofre bloque1 = new BloqueCofre(30, 10, "madera");
        BloqueCofre bloque2 = new BloqueCofre(50, 20, "hierro");

        BloqueTnt bloque3 = new BloqueTnt("básica", 100);
        BloqueTnt bloque4 = new BloqueTnt("potente", 200);

        BloqueHorno bloque5 = new BloqueHorno("gris", 5);
        BloqueHorno bloque6 = new BloqueHorno("negro", 10);

        Object[] bloques = {bloque1, bloque2, bloque3, bloque4, bloque5, bloque6};

        for (Object bloque : bloques) {
            if (bloque instanceof BloqueCofre) {
                ((BloqueCofre) bloque).accion();
                ((BloqueCofre) bloque).colocar("suelo");
                ((BloqueCofre) bloque).romper();
            } else if (bloque instanceof BloqueTnt) {
                ((BloqueTnt) bloque).accion();
                ((BloqueTnt) bloque).colocar("suelo");
                ((BloqueTnt) bloque).romper();
            } else if (bloque instanceof BloqueHorno) {
                ((BloqueHorno) bloque).accion();
                ((BloqueHorno) bloque).colocar("suelo");
                ((BloqueHorno) bloque).romper();
            }
            System.out.println("------------------------");
        }
    }
}

class BloqueCofre {
    int capacidad;
    int resistencia;
    String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Este cofre puede almacenar objetos.");
    }

    public void colocar(String orientacion) {
        System.out.println("Cofre colocado en: " + orientacion);
    }

    public void romper() {
        System.out.println("Has roto un cofre, los objetos salen volando.");
    }
}

class BloqueTnt {
    String tipo;
    int dano;

    public BloqueTnt(String tipo, int dano) {
        this.tipo = tipo;
        this.dano = dano;
    }

    public void accion() {
        System.out.println("La TNT está lista para explotar.");
    }

    public void colocar(String orientacion) {
        System.out.println("TNT colocada en: " + orientacion);
    }

    public void romper() {
        System.out.println("La TNT se activa y explota.");
    }
}

class BloqueHorno {
    String color;
    int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println("Este horno puede cocinar comida.");
    }

    public void colocar(String orientacion) {
        System.out.println("Horno colocado en: " + orientacion);
    }

    public void romper() {
        System.out.println("El horno se rompe y suelta los objetos cocinados.");
    }
}
