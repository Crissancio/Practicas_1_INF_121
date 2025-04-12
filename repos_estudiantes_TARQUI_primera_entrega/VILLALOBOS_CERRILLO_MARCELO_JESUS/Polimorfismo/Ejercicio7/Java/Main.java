public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais", "Labrador", 3);
        Gato gato1 = new Gato("Michi", "Blanco");
        Pajaro pajaro1 = new Pajaro("Piolín", "Canario");
        perro1.hacerSonido();
        perro1.moverse();
        perro1.mostrar();
        gato1.hacerSonido();
        gato1.moverse();
        gato1.mostrar();
        pajaro1.hacerSonido();
        pajaro1.moverse();
        pajaro1.mostrar();
    }
}