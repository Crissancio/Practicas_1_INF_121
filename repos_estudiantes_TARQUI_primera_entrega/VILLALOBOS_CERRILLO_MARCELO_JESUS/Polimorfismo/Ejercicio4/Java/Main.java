public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Mercedes", "ABC123", "Juan", 10000, 50);
        Bus bus2 = new Bus("Volvo", "XYZ456", "Pedro", 20000, 40);
        Camioneta camioneta1 = new Camioneta("Toyota", "LMN789", "Maria", 15000);
        bus1.mostrar();
        bus2.mostrar();
        camioneta1.asignarConductor("Carlos");
        camioneta1.añoDeExperiencia("Carlos", 5);
        camioneta1.mostrar();
        bus1.registrarViaje(50);
        bus2.registrarViaje(50);
        bus1.destino("Oruro", 94);
        bus2.destino("Coroico", 104);
    }
}
