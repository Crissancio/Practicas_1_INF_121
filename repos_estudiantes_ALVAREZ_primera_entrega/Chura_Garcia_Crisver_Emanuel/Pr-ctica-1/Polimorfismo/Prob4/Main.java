//4. Sean las siguientes clases que detallan 2 tipos de automóviles:
public class Main {
    public static void main(String[] args) {
        // a) Instanciar 2 objetos Bus y 1 objeto Camioneta
        Bus bus1 = new Bus("antiguo", "ABC123", "Jose", 45, 6);
        Bus bus2 = new Bus("nuevo", "DEF456", "Fabian", 85, 5);
        Camioneta camioneta = new Camioneta("Toyota", "MACH1N3T1M3", null, 45);

        // b) Sobrecargar el método asignarConductor() en Camioneta, donde primero solo
        // se añada el nombre del conductor, y el segundo añada al conductor y pida años
        // de experiencia para mostrarlo junto a su nombre.
        camioneta.asignarConductor("Marty Mcfly");
        camioneta.asignarConductor("Emanuel", 2);
        // c) Sobrecargar el método registrarViaje() en Bus, donde se pida una distancia
        // y esta misma se aumente al kilometraje, y en otro que se pida distancia,
        // lugar de destino y nroPasajeros
        bus1.registrarViaje(45);
        bus2.registrarViaje(78, "Cumaravi", 5);
    }
}
