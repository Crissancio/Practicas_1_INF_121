package minecraft;
public class Minecraft {
    public static void main(String[] args) {
        BloqueCofre cofre1 = new BloqueCofre(27, 10, "Madera");
        BloqueCofre cofre2 = new BloqueCofre(54, 15, "Hierro");

        BloqueTnt tnt1 = new BloqueTnt("Basica", 20);
        BloqueTnt tnt2 = new BloqueTnt("Mega", 50);

        BloqueHorno horno1 = new BloqueHorno("Rojo", 5);
        BloqueHorno horno2 = new BloqueHorno("Gris", 8);

        cofre1.accion();
        tnt1.accion();
        horno1.accion();

        cofre2.colocar();
        cofre2.colocar("pared");

        tnt2.colocar();
        tnt2.colocar("pared");

        horno2.colocar();
        horno2.colocar("esquina");

        cofre1.romper();
        tnt1.romper();
        horno1.romper();
    }
}
