package animales;
public class Animales {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Max", 4, "Labrador");
        Gato gato1 = new Gato("Luna", "Negro");
        Pajaro pajaro1 = new Pajaro("Piolin", "Canario");

        perro1.mostrar();
        gato1.mostrar();
        pajaro1.mostrar();

        perro1.hacerSonido();
        gato1.hacerSonido();
        pajaro1.hacerSonido();

        perro1.moverse();
        gato1.moverse();
        pajaro1.moverse();
    }
}

