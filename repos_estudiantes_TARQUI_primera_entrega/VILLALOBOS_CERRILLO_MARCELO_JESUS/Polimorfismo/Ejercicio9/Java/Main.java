public class Main {
    public static void main(String[] args) {
        BloqueCofre b1 = new BloqueCofre(10, 5, "madera");
        BloqueTnt b2 = new BloqueTnt("explosiva", 100);
        BloqueHorno b3 = new BloqueHorno("gris", 3);
        b1.accionar();
        b2.accionar();
        b3.accionar();
        b1.colocar("el suelo");
        b2.colocar("la pared");
        b1.romper();
        b2.romper();
        b3.romper();
    }
}
