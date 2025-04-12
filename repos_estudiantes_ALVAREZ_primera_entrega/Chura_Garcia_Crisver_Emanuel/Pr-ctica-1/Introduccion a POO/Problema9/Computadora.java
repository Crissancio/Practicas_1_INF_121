//9. Realiza la abstracción de una Computadora
public class Computadora {
    private boolean CPU, teclado, monitor, mouse, parlantes, fuente_de_energia;

    public Computadora(boolean CPU, boolean teclado, boolean monitor, boolean mouse, boolean parlantes,
            boolean fuente_de_energia) {
        this.CPU = CPU;
        this.teclado = teclado;
        this.monitor = monitor;
        this.mouse = mouse;
        this.parlantes = parlantes;
        this.fuente_de_energia = fuente_de_energia;
    }

    // a) Muestra los componentes principales de la computadora
    public void MostrarComponentes() {
        System.out.println("Componentes:");
        if (CPU == true) {
            System.out.println("CPU");
        }
        if (teclado == true) {
            System.out.println("Teclado");
        }
        if (monitor == true) {
            System.out.println("Monitor");
        }
        if (mouse == true) {
            System.out.println("Mouse");
        }
        if (parlantes == true) {
            System.out.println("Parlantes");
        }
        if (fuente_de_energia == true) {
            System.out.println("Fuente de energía");
        }
    }

    // b) Muestra el estado de la computadora (encendido o apagado)
    public void EstadoComputadora() {
        System.out.println("estado de la computadora:");
        if (fuente_de_energia == true) {
            System.out.println("Encendido");
        } else {
            System.out.println("Apagado");
        }
    }

    public static void main(String[] args) {
        // c) Crea una instancia y simula encender y apagar la computadora.
        Computadora computadora = new Computadora(true, true, true, true, true, false);
        computadora.MostrarComponentes();
        computadora.EstadoComputadora();
        computadora.fuente_de_energia = true;
        computadora.EstadoComputadora();
    }
}