/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER9;

/**
 *
 * @author LENOVO
 */
public class Computadora {
    private String cpu;
    private int disco;
    private int ram;
    private boolean encendida;

    public Computadora(String cpu, int disco, int ram) {
        this.cpu = cpu;
        this.disco = disco;
        this.ram = ram;       
        this.encendida = false;
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Computadora encendida");
        } else {
            System.out.println("Esta encendida");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Computadora apagada");
        } else {
            System.out.println("Esta apagada");
        }
    }

    public void mostrarEstado() {
        String estado = encendida ? "Esta encendida" : "Esta apagada";
        System.out.println("Estado actual: " + estado);
    }

    public String toString() {
        return "Computadora: " + "\nCPU='" + cpu + "\nRAM=" + ram + "GB" +
                "\nDisco=" + disco + "GB" +
                "\nEncendida=" + encendida;
               
    }
    
}
