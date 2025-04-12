package ejercicio5;

public class Computadora {
	private String procesador;
    private int ramGB;
    private int almacenamientoGB;
    private boolean encendida;

    public Computadora(String procesador, int ramGB, int almacenamientoGB) {
        this.procesador = procesador;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
        this.encendida = false;
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Computadora encendida. Procesador: " + procesador);
        } else {
            System.out.println("La computadora ya está encendida");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Computadora apagada");
        } else {
            System.out.println("La computadora ya está apagada");
        }
    }

    public void mostrarEstado() {
        String estado = encendida ? "Encendida" : "Apagada";
        System.out.println("Estado: " + estado + 
                         "\nProcesador: " + procesador +
                         "\nRAM: " + ramGB + "GB" +
                         "\nAlmacenamiento: " + almacenamientoGB + "GB");
    }
}
