
package app3;

public class App3 {
    public static void main(String[] args) {
        // a) Instanciar los animales
        Perro perro = new Perro("Rocky", 3, "Labrador");
        Gato gato = new Gato("Michi", "Blanco");
        Pajaro pajaro = new Pajaro("Piolin", "Canario");

        // b) Llamar al método hacerSonido()
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();

        System.out.println();

        // c) Llamar al método moverse()
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }
}

