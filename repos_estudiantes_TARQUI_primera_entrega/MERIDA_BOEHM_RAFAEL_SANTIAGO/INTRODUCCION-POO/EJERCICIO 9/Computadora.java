package Ejercicio_9;

public class Computadora {
    public String procesador;
    public int memoriaRam;
    public int almacenamiento;
    public boolean estadoEncendida;

    public Computadora(String procesador, int memoriaRam, int almacenamiento) {
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.estadoEncendida = false;
    }

    public void encender() {
        if (!this.estadoEncendida) {
            this.estadoEncendida = true;
            System.out.println("La computadora se ha encendido.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (this.estadoEncendida) {
            this.estadoEncendida = false;
            System.out.println("La computadora se ha apagado.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    public String toString() {
        return "Computadora - Procesador: " + this.procesador +
               ", RAM: " + this.memoriaRam + "GB, Almacenamiento: " + this.almacenamiento + "GB, Estado: " +
               (this.estadoEncendida ? "Encendida" : "Apagada");
    }
}
