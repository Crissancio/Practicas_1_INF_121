public class Main3 {
    public static void main(String[] args) throws Exception {
        Coche coche1 = new Coche("Mazda", "RX8");
        Coche coche2 = new Coche("Toyota", "Corolla");

        //Acelerando y frenando los coches
        coche1.acelerar();
        coche1.acelerar();
        coche1.acelerar();
        coche1.frenar();

        coche2.acelerar();
        coche2.frenar();
        coche2.frenar();
        coche2.acelerar();

        //Mostrando velocidades
        coche1.mostrarVelocidad();
        coche2.mostrarVelocidad();
    }
}
