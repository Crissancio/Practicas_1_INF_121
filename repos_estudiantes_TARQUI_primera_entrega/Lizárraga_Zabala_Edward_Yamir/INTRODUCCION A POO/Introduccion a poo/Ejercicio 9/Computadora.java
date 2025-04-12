
package computadora;

import java.util.Scanner;

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

    public void mostrarComponentes() {
        System.out.println("Componentes de la Computadora:");
        System.out.println("- Procesador: " + procesador);
        System.out.println("- RAM: " + ramGB + " GB");
        System.out.println("- Almacenamiento: " + almacenamientoGB + " GB");
    }

    public void mostrarEstado() {
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computadora pc = new Computadora("Intel Core i5", 16, 512);
        String comando;

        System.out.println("Simulador de Computadora");
        System.out.println("Comandos: encender, apagar, estado, componentes, salir");

        do {
            System.out.print(">> ");
            comando = scanner.nextLine().toLowerCase();

            switch (comando) {
                case "encender": pc.encender(); break;
                case "apagar": pc.apagar(); break;
                case "estado": pc.mostrarEstado(); break;
                case "componentes": pc.mostrarComponentes(); break;
                case "salir": System.out.println("Apagando simulador..."); break;
                default: System.out.println("Comando no reconocido.");
            }
        } while (!comando.equals("salir"));

        scanner.close();
    }
}

