package computadora;

public class Computadora {
    private String procesador;
    private int memoriaRAM;       
    private int almacenamiento;  
    private String tarjetaGrafica;
    private boolean encendida;

    public Computadora(String procesador, int memoriaRAM, int almacenamiento, String tarjetaGrafica) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.tarjetaGrafica = tarjetaGrafica;
        this.encendida = false; 
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora se ha encendido.");
        } else {
            System.out.println("La computadora ya estaba encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La computadora se ha apagado.");
        } else {
            System.out.println("La computadora ya estaba apagada.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Tarjeta grafica: " + tarjetaGrafica);
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Computadora pc = new Computadora("Intel Core i7", 16, 512, "NVIDIA GTX 1660");
        pc.mostrarEstado();
        pc.encender();
        pc.mostrarEstado();
        pc.apagar();
        pc.mostrarEstado();
    }
}
