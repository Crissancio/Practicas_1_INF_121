/*
9. Realiza la abstracción de una Computadora 
a)	Muestra los componentes principales de la computadora
b)	Muestra el estado de la computadora (encendido o apagado)
c)	Crea una instancia y simula encender y apagar la computadora.

*/
package Ejercicios;


public class Computadora {
   // Atributos de la computadora (componentes principales)
    private String procesador;
    private String memoria;
    private String almacenamiento;
    private boolean estado; // true = encendida, false = apagada

    // Constructor 
    public Computadora(String procesador, String memoria, String almacenamiento) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
        this.estado = false; // La computadora comienza apagada
    }

    // Método para encender la computadora
    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("La computadora ha sido encendida.");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    // Método para apagar la computadora
    public void apagar() {
        if (estado) {
            estado = false;
            System.out.println("La computadora ha sido apagada.");
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    // Método para mostrar los componentes principales de la computadora
    public void mostrarComponentes() {
        System.out.println("Componentes principales de la computadora:");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria: " + memoria);
        System.out.println("Almacenamiento: " + almacenamiento);
    }

    // Método para mostrar el estado actual de la computadora
    public void mostrarEstado() {
        if (estado) {
            System.out.println("La computadora está encendida.");
        } else {
            System.out.println("La computadora está apagada.");
        }
    }

   
    public static void main(String[] args) {
        // Crear una instancia de la computadora
        Computadora miComputadora = new Computadora("Intel Core i7", "16 GB", "1 TB SSD");

        // Mostrar  componentes principales
        miComputadora.mostrarComponentes();

        // Mostrar  estado inicial de la computadora
        miComputadora.mostrarEstado();

        // Encender  computadora
        miComputadora.encender();

        // Mostrar  estado después de encenderla
        miComputadora.mostrarEstado();

        // Apagar  computadora
        miComputadora.apagar();

        // Mostrar  estado después de apagarla
        miComputadora.mostrarEstado();
    }
}


