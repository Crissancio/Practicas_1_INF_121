public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Snoopy", "beagle", 5);
        Gato gato = new Gato("Flow", "negro");
        Pajaro pajaro = new Pajaro("Lucas", "Pato");

        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }
}
