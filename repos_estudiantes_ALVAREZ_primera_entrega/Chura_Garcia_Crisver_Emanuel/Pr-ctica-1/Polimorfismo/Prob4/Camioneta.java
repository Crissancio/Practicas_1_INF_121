//4. Sean las siguientes clases que detallan 2 tipos de automóviles:
public class Camioneta {
    private String modelo, placa, conductor;
    private int kilometraje;

    public Camioneta(String modelo, String placa, String nombre, int kilometraje) {
        this.modelo = modelo;
        this.placa = placa;
        this.conductor = nombre;
        this.kilometraje = kilometraje;
    }

    // b) Sobrecargar el método asignarConductor() en Camioneta, donde primero solo
    // se añada el nombre del conductor, y el segundo añada al conductor y pida años
    // de experiencia para mostrarlo junto a su nombre.
    public void asignarConductor(String nombre) {
        if (this.conductor == null) {
            System.out.println("Conductor: " + nombre + " del vehiculo con placa: " + placa);
            this.conductor = nombre;
        } else {
            System.out.println("Conductor ya designado");
        }
    }

    public void asignarConductor(String nombre, int añosExperiencia) {
        if (this.conductor == null) {
            System.out.println("Conductor: " + nombre + " con " + añosExperiencia + " años de experiencia"
                    + " del vehiculo con placa: " + placa);
            this.conductor = nombre;
        } else {
            if (this.conductor != null) {
                System.out.println("Conductor: " + nombre + " con " + añosExperiencia + " años de experiencia"
                        + " del vehiculo con placa: " + placa);
                this.conductor = nombre;
            } else {
                System.out.println("Conductor ya designado");
            }
        }
    }
}
