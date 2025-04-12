public class Main{
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla", 0);
        Coche c2 = new Coche("Ford", "Focus", 20);
        c1.acelerar();
        c1.frenar();
        c2.acelerar();
        c2.frenar();
        System.out.println(c1.velocidad);
        System.out.println(c2.velocidad);
    }
}