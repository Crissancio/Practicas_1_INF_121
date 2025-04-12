public class Computadora {
    private String estado;
    public Computadora() {
        estado = "apagada";
    }
    public void mostrarComponentes() {
        System.out.println("Procesador, RAM, Disco Duro, Tarjeta Madre");
    }
    public void encender() {
        estado = "encendida";
        System.out.println("La computadora está encendida");
    }
    public void apagar() {
        estado = "apagada";
        System.out.println("La computadora está apagada");
    }
}