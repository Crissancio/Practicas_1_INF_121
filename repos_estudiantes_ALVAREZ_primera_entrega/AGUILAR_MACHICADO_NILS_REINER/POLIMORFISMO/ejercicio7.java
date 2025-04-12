class Animal {
    public String hacerSonido() {
        return "Sonido genérico";
    }

    public String moverse() {
        return "Se mueve de alguna manera";
    }
}

class Perro extends Animal {
    @Override
    public String hacerSonido() {
        return "¡Guau!";
    }

    @Override
    public String moverse() {
        return "Corre con sus patas";
    }
}

class Gato extends Animal {
    @Override
    public String hacerSonido() {
        return "¡Miau!";
    }

    @Override
    public String moverse() {
        return "Salta ágilmente";
    }
}

class Pajaro extends Animal {
    @Override
    public String hacerSonido() {
        return "¡Pío!";
    }

    @Override
    public String moverse() {
        return "Vuela por el cielo";
    }
}

public class Animales {
    public static void main(String[] args) {
        Animal[] animales = { new Perro(), new Gato(), new Pajaro() };

        for (Animal a : animales) {
            System.out.println("Sonido: " + a.hacerSonido());
            System.out.println("Movimiento: " + a.moverse());
            System.out.println();
        }
    }
}
