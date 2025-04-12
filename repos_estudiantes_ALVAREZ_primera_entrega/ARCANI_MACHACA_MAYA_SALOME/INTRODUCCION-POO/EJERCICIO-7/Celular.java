/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER7;

/**
 *
 * @author LENOVO
 */
public class Celular {
    private String[] nomApp;
    private int[] tamAps;
    private int cantApp;
    private int espDispo;
    private int bateria;
    private boolean encendido;

    public Celular() {
        nomApp = new String[20];
        tamAps = new int[20];
        cantApp = 0;
        espDispo = 1024;
        bateria = 100;
        encendido = true;
    }

    public void instalarApp(String nombre, int tamano) {
        if (!encendido) {
            System.out.println("Celular apagado. No se puede instalar.");
            return;
        }
        if (cantApp >= 20 || espDispo < tamano) {
            System.out.println("No se puede instalar " + nombre + ": espacio insuficiente o limite de apps.");
            return;
        }
        nomApp[cantApp] = nombre;
        tamAps[cantApp] = tamano;
        cantApp++;
        espDispo -= tamano;
        System.out.println("Aplicacion " + nombre + " instalada.");
    }

    public void usarApp(String nombre, int minutos) {
        if (!encendido) {
            System.out.println("Celular apagado. No se puede usar apps.");
            return;
        }
        for (int i = 0; i < cantApp; i++) {
            if (nomApp[i].equals(nombre)) {
                int tamano = tamAps[i];
                double consumo;
                if (tamano > 250) consumo = 5;
                else if (tamano > 100) consumo = 2;
                else consumo = 1;
                int gasto = (int)((minutos / 10.0) * consumo);
                bateria -= gasto;
                if (bateria <= 0) {
                    bateria = 0;
                    encendido = false;
                    System.out.println("Bateria agotada. Celular apagado.");
                } else {
                    System.out.println("Usando " + nombre + " por " + minutos + " minutos. Bateria ahora: " + bateria + "%");
                }
                return;
            }
        }
        System.out.println("Aplicacion no encontrada.");
    }

    public void mostrarBateria() {
        System.out.println("Bateria restante: " + bateria + "%");
    }

    @Override
    public String toString() {
        String listaApps = "";
        for (int i = 0; i < cantApp; i++) {
            listaApps += nomApp[i] + " (" + tamAps[i] + "Mb), ";
        }
        return "Celular{" +
                "Apps instaladas=[" + listaApps + "]" +
                ", Espacio restante=" + espDispo + "Mb" +
                ", Bateria=" + bateria + "%" +
                ", Encendido=" + encendido +
                '}';
    }    
    
}
