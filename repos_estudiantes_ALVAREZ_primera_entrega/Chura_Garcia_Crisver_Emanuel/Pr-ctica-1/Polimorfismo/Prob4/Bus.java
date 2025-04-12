//4. Sean las siguientes clases que detallan 2 tipos de automóviles:
public class Bus {
    private String modelo, placa, conductor;
    private int kilometraje, nroPasajeros;

    public Bus(String modelo, String placa, String conductor, int kilometraje, int nroPasajeros) {
        this.modelo = modelo;
        this.placa = placa;
        this.conductor = conductor;
        this.kilometraje = kilometraje;
        this.nroPasajeros = nroPasajeros;
    }

    // c) Sobrecargar el método registrarViaje() en Bus, donde se pida una distancia
    // y esta misma se aumente al kilometraje, y en otro que se pida distancia,
    // lugar de destino y nroPasajeros
    public void registrarViaje(int distrancia) {
        System.out.println("Kilometraje actualizado: " + (kilometraje + distrancia));
    }

    public void registrarViaje(int distrancia, String lugarDestino, int nroPasajeros) {
        System.out.println("Kilometraje actualizado: " + (kilometraje + distrancia) + ", Destino: " + lugarDestino
                + ", Pasajeros: " + (this.nroPasajeros + nroPasajeros));

    }
}