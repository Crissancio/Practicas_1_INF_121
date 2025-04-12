package computadorajava;
public class computadora {
    // Atributos principales
    private String procesador;
    private int ramGB;
    private int almacenamientoGB;
    private String tarjetaGrafica;
    private boolean encendida;

    // Constructor
    public computadora(String procesador, int ramGB, int almacenamientoGB, String tarjetaGrafica) {
        this.procesador = procesador;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
        this.tarjetaGrafica = tarjetaGrafica;
        this.encendida = false;
    }

    // Método para mostrar componentes
    public void mostrarComponentes() {
        System.out.println("Componentes principales de la computadora:");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + ramGB + " GB");
        System.out.println("Almacenamiento: " + almacenamientoGB + " GB");
        System.out.println("Tarjeta Gráfica: " + tarjetaGrafica);
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        if (encendida) {
            System.out.println("Estado de la computadora: Encendida");
        } else {
            System.out.println("Estado de la computadora: Apagada");
        }
    }

    // Método para encender
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora se ha encendido.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    // Método para apagar
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La computadora se ha apagado.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }
}
