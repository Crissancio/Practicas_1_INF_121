class Bus{
    private String modelo;
    private String placa;
    private String conductor;
    private int kilometraje;
    private int numPasajeros;
    public Bus(String modelo, String placa, String conductor, int kilometraje, int numPasajeros) {
        this.modelo = modelo;
        this.placa = placa;
        this.conductor = conductor;
        this.kilometraje = kilometraje;
        this.numPasajeros = numPasajeros;
    }
    public void registrarViaje(String distancia) {
        this.kilometraje = kilometraje + distancia;
        System.out.println("El kilometraje del Bus es: ", this.kilometraje, "km");
    }
    public void destino(String destino, int distancia) {
        this.destino = destino;
        this.distancia = distancia;
        System.out.println("El destino es: ", destino, "y la distancia del inicio ahi es: ", distancia, "km");
    }
    public void mostrar() {
        System.out.println("Conductor: " + conductor +" Placa: " + placa + " Modelo: " + modelo + " Placa: " + placa + " Numero de pasajeros " + numPasajeros);
    }
}
class Camioneta {
    private String modelo;
    private String placa;
    private String conductor;
    private int kilometraje;
    public int años;
    public Camioneta(String modelo, String placa, String conductor, int kilometraje) {
        this.modelo = modelo;
        this.placa = placa;
        this.conductor = conductor;
        this.kilometraje = kilometraje;
    }
    public void asignarConductor(String nombre) {
        this.conductor = nombre;
        System.out.println("El conductor asignado es: " + nombre);
    }
    public void añoDeExperiencia(String nombre, int años) {
        this.conductor = nombre;
        this.años = años;
        System.out.println("El conductor: " + nombre + "tiene: " + años + " de experiencia");
    }
    public void mostrar() {
        System.out.println("Camioneta: " + conductor + " Placa: " + placa + " Modelo: " + modelo + ", Kilometraje: " + kilometraje);
    }
}