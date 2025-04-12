
package EJER7;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 4, "Labrador");
        Gato gato = new Gato("Michi", "Blanco");
        Pajaro pajaro = new Pajaro("Piolín", "Canario");

        perro.hacerSonido();
        perro.hacerSonido("despacio");
        perro.moverse();

        gato.hacerSonido();
        gato.hacerSonido("despacio");
        gato.moverse();

        pajaro.hacerSonido();
        pajaro.hacerSonido("fuerte");
        pajaro.moverse();
    }
}


