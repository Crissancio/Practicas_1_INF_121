//9. Realiza la abstracción de una Computadora

package Ejercicio9;

public class Computadora {
    private String procesador;
    private int memoriaRAM; 
    private int almacenamiento;
    private boolean encendida;

    public Computadora(String procesador, int memoriaRAM, int almacenamiento) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.encendida = false;
    }
    //a) Muestra los componentes principales de la computadora
    public void mostrarComponentes() {
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
    }
    //b) Muestra el estado de la computadora (encendido o apagado)
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora se ha encendido.");
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

    public void mostrarEstado() {
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }

    public static void main(String[] args) {
        //c) Crea una instancia y simula encender y apagar la computadora.
        Computadora compuAbs = new Computadora("Ryzen3", 12, 256);
        compuAbs.mostrarComponentes();
        compuAbs.mostrarEstado();
        compuAbs.encender();
        compuAbs.mostrarEstado();
        compuAbs.apagar();
        compuAbs.mostrarEstado();
    }
}