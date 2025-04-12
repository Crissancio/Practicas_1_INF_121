public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("Hilux");
        Auto a2 = new Auto("Takoma", "5932OLH");

        a1.verAuto();
        a2.verAuto();

        a1.nuevoAuto();
        a2.nuevoAuto();

        a1.verAuto();
        a2.verAuto();
    }
}
