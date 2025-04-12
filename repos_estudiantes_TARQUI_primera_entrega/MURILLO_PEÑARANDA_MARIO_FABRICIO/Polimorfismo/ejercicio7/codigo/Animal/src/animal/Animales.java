package animal;

/*
 * ENUNCIADO:
 * 7. Se hace referencia a algunos animales mediante las siguientes clases:
 * a) Instanciar 1 Perro, 1 Gato y 1 Pájaro
 * b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
 *    característico
 * c) Implementar un método moverse() que indique cómo se mueve cada animal
 */

abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();
    public abstract void moverse();
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " esta corriendo.");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice:  Miau miau!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " esta saltando.");
    }
}

class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " esta volando.");
    }
}

public class Animales {
    public static void main(String[] args) {
        Animal perro = new Perro("Shinji");
        Animal gato = new Gato("Kaoru");
        Animal pajaro = new Pajaro("Birdramon");

        perro.hacerSonido();
        perro.moverse();

        gato.hacerSonido();
        gato.moverse();

        pajaro.hacerSonido();
        pajaro.moverse();
    }
}
