package Polimorfismo.Ejercicio7;

class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido del animal");
    }

    public void moverse() {
        System.out.println("Movimiento del animal");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Perro: ¡Guau!");
    }

    @Override
    public void moverse() {
        System.out.println("Corre");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Gato: ¡Miau!");
    }

    @Override
    public void moverse() {
        System.out.println("Camina y salta");
    }
}

class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pajaro: ¡Pio pio!");
    }

    @Override
    public void moverse() {
        System.out.println("Vuela");
    }
}

public class Animal_main {
    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Perla");
        Gato miGato = new Gato("Whisky");
        Pajaro miPajaro = new Pajaro("Roon");

        System.out.println("Sonidos de los animales:");
        miPerro.hacerSonido();
        miGato.hacerSonido();
        miPajaro.hacerSonido();

        
        System.out.println("\nMovimientos de los animales:");
        miPerro.moverse();
        miGato.moverse();
        miPajaro.moverse();
    }
}