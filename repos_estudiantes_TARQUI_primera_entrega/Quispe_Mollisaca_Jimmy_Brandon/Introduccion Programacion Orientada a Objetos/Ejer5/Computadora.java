package IntroPOO;

public class Computadora {
    private String procesador;
    private int memoriaRAM;
    private int almacenamiento;
    private boolean encendida;
    private String sistemaOperativo;

    public Computadora(String procesador, int memoriaRAM, int almacenamiento, String sistemaOperativo) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.sistemaOperativo = sistemaOperativo;
        this.encendida = false;
    }

    public void mostrarComponentes() {
        System.out.println("Componentes principales:");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Sistema Operativo: " + sistemaOperativo);
    }

    public void mostrarEstado() {
        if (encendida) {
            System.out.println("La computadora está encendida.");
        } else {
            System.out.println("La computadora está apagada.");
        }
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora se ha encendido. Sistema Operativo: " + sistemaOperativo);
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La computadora se ha apagado.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    public void cambiarSistemaOperativo(String nuevoSistemaOperativo) {
        sistemaOperativo = nuevoSistemaOperativo;
        System.out.println("Sistema operativo cambiado a: " + sistemaOperativo);
    }

    public static void main(String[] args) {
        Computadora miComputadora = new Computadora("Intel Core i7", 16, 512, "Windows 11");
        miComputadora.mostrarComponentes();
        miComputadora.mostrarEstado();
        miComputadora.encender();
        miComputadora.mostrarEstado();
        miComputadora.apagar();
        miComputadora.mostrarEstado();
    }
}