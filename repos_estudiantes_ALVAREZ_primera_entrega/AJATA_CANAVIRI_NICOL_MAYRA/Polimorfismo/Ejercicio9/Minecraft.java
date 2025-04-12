package Polimorfismo.Ejercicio9;

public class Minecraft {
    public static void main(String[] args) {
        BloqueCofre cofre1 = new BloqueCofre("Cofre", 30, 100);
        BloqueCofre cofre2 = new BloqueCofre("Cofre", 50, 200);

        BloqueTnt tnt1 = new BloqueTnt("TNT", 100);
        BloqueTnt tnt2 = new BloqueTnt("TNT", 150);

        BloqueHorno horno1 = new BloqueHorno("Horno", "Gris", 3);
        BloqueHorno horno2 = new BloqueHorno("Horno", "Negro", 5);

        cofre1.accion();
        tnt1.accion();
        horno1.accion();

        cofre1.colocar();
        tnt1.colocar("pared");
        horno1.colocar("suelo");

        cofre2.romper();
        tnt2.romper();
        horno2.romper();
    }
}
