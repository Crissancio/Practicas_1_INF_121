//9. Para los bloques del juego Minecraft se usará los siguientes objetos:
public class Main {
    public static void main(String[] args) {
        // a)Crear e instanciar al menos 2 bloques de cada tipo
        BloqueCofre cofre1 = new BloqueCofre(64, 25, "Shulker");
        BloqueCofre cofre2 = new BloqueCofre(52, 50, "Nether");
        BloqueTnt tnt1 = new BloqueTnt("Normal", 26);
        BloqueTnt tnt2 = new BloqueTnt("ModNuclear", 100);
        BloqueHorno horno1 = new BloqueHorno("Gris", 64);
        BloqueHorno horno2 = new BloqueHorno("Azul", 58);
        // b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
        // distintos mensajes según el tipo de bloque.
        cofre1.accion();
        cofre2.accion();
        tnt1.accion();
        horno1.accion();
        // c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
        // orientaciones (por ejemplo, en el suelo o en la pared).
        cofre1.colocar("Suelo");
        cofre2.colocar("Pared");
        tnt1.colocar("Lava");
        tnt2.colocar("Agua");
        horno1.colocar("Aire");
        horno2.colocar("Pared");
        // d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
        // distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
        cofre1.romper();
        cofre2.romper();
        tnt1.romper();
        horno1.romper();
    }
}
