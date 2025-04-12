//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Pajaro pajaro = new Pajaro();
        System.out.println(perro.hacerSonido("ladra"));
        System.out.println(gato.hacerSonido("maulla"));
        System.out.println(pajaro.hacerSonido("pia"));
        perro.moverse();
        gato.moverse();
        pajaro.moverse();

    }
}