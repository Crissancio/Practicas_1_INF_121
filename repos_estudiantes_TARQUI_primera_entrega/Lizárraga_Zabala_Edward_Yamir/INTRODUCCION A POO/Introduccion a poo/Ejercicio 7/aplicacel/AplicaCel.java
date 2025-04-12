
package aplicacel;

import java.util.Scanner;

public class AplicaCel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Celular miCelular = new Celular();

        System.out.println("Bienvenido a tu celular");
        while (true) {
            if (miCelular.bateria <= 0) {
                System.out.println("El celular está apagado por falta de batería.");
                break;
            }

            System.out.println("\nQue deseas hacer?");
            System.out.println("1. Instalar aplicacion");
            System.out.println("2. Usar aplicacion");
            System.out.println("3. Ver bateria");
            System.out.println("4. Ver espacio disponible");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la app: ");
                    String nombreApp = scanner.nextLine();
                    System.out.print("Peso de la app en MB: ");
                    int peso = scanner.nextInt();
                    scanner.nextLine();
                    miCelular.instalarApp(nombreApp, peso);
                    break;

                case 2:
                    System.out.print("Nombre de la app que deseas usar: ");
                    String appUsar = scanner.nextLine();
                    System.out.print("Cuantos minutos deseas usarla?: ");
                    int minutos = scanner.nextInt();
                    scanner.nextLine();
                    miCelular.usarApp(appUsar, minutos);
                    break;

                case 3:
                    miCelular.mostrarBateria();
                    break;
                
                case 6:
                    miCelular.mostrarEspacioDisponible();
                    break;


                case 5:
                    System.out.println("Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no valida.");
            }
        }

        scanner.close();
    }
}


