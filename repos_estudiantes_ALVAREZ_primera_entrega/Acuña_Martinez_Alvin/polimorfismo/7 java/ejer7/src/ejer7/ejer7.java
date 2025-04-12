package ejer7;

public class ejer7 {

    // Clase abstracta Animal
    abstract static class Animal {
        public abstract String hacerSonido();
        public abstract String moverse();
    }

    // Subclase Perro
    static class Perro extends Animal {
        @Override
        public String hacerSonido() {
            // b) Sobrecargar hacerSonido() para que el Perro emita su sonido característico
            return "El perro dice: ¡Guau!";
        }

        @Override
        public String moverse() {
            // c) Implementar moverse() indicando que el Perro corre
            return "El perro corre.";
        }
    }

    // Subclase Gato
    static class Gato extends Animal {
        @Override
        public String hacerSonido() {
            // b) Sobrecargar hacerSonido() para que el Gato emita su sonido característico
            return "El gato dice: ¡Miau!";
        }

        @Override
        public String moverse() {
            // c) Implementar moverse() indicando que el Gato salta
            return "El gato salta.";
        }
    }

    // Subclase Pájaro
    static class Pajaro extends Animal {
        @Override
        public String hacerSonido() {
            // b) Sobrecargar hacerSonido() para que el Pájaro emita su sonido característico
            return "El pájaro dice: ¡Pío pío!";
        }

        @Override
        public String moverse() {
            // c) Implementar moverse() indicando que el Pájaro vuela
            return "El pájaro vuela.";
        }
    }

    // Clase Main
    public static void main(String[] args) {
        // a) Instanciar 1 Perro, 1 Gato y 1 Pájaro
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal pajaro = new Pajaro();

        // Mostrar resultados
        System.out.println(perro.hacerSonido());
        System.out.println(perro.moverse());

        System.out.println(gato.hacerSonido());
        System.out.println(gato.moverse());

        System.out.println(pajaro.hacerSonido());
        System.out.println(pajaro.moverse());
    }
}
