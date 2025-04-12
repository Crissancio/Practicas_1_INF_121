/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computadora;

/**
 *
 * @author USUARIO
 */
public class Computadora {
    private String procesador;
    private int memoriaRam;
    private int almacenamiento;
    private boolean encendida;

    public Computadora(String procesador, int memoriaRam, int almacenamiento) {
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.encendida = false;
    }

    public String encender() {
        this.encendida = true;
        return "La computadora está encendida.";
    }

    public String apagar() {
        this.encendida = false;
        return "La computadora está apagada.";
    }

    public String mostrarEstado() {
        return encendida ? "La computadora está encendida." : "La computadora está apagada.";
    }

    public String mostrarComponentes() {
        return "Procesador: " + procesador + ", RAM: " + memoriaRam + "GB, Almacenamiento: " + almacenamiento + "GB";
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Computadora
        Computadora miComputadora = new Computadora("Intel i7", 16, 512);

        // Mostrar componentes principales
        System.out.println(miComputadora.mostrarComponentes());

        // Simular encender y apagar la computadora
        System.out.println(miComputadora.encender());
        System.out.println(miComputadora.mostrarEstado());
        System.out.println(miComputadora.apagar());
        System.out.println(miComputadora.mostrarEstado());
    }
}
