
package app4;

public class App4 {
    public static void main(String[] args) {
        // a) Instanciar al menos 2 bloques de cada tipo
        BloqueCofre cofre1 = new BloqueCofre(30, 10, "Madera");
        BloqueCofre cofre2 = new BloqueCofre(50, 15, "Hierro");

        BloqueTnt tnt1 = new BloqueTnt("Explosiva", 100);
        BloqueTnt tnt2 = new BloqueTnt("MegaTNT", 200);

        BloqueHorno horno1 = new BloqueHorno("Gris", 4);
        BloqueHorno horno2 = new BloqueHorno("Negro", 6);

        // b) Ejecutar método accion()
        cofre1.accion();
        cofre2.accion();

        tnt1.accion();
        tnt2.accion();

        horno1.accion();
        horno2.accion();

        System.out.println();

        // c) Sobrecarga colocar()
        cofre1.colocar();
        cofre2.colocar("pared");

        tnt1.colocar();
        tnt2.colocar("techo");

        horno1.colocar();
        horno2.colocar("pared");

        System.out.println();

        // d) Ejecutar romper()
        cofre1.romper();
        tnt1.romper();
        horno1.romper();
    }
}

