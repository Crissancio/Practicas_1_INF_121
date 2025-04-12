package EJERCICIO7;

public class mainEj7 {

	public static void main(String[] args) {
        Perro perro = new Perro("Max");
        Gato gato = new Gato("Michi");
        Pajaro pajaro = new Pajaro("Piolín");

        System.out.println(perro);
        perro.hacerSonido();
        perro.moverse();

        System.out.println("-----------------------");

        System.out.println(gato);
        gato.hacerSonido();
        gato.moverse();

        System.out.println("-----------------------");

        System.out.println(pajaro);
        pajaro.hacerSonido();
        pajaro.moverse();
    }


}
