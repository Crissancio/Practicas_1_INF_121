/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_9;

/**
 *
 * @author Trabajo
 */
public class BloqueCofre {
    int capacidad;
    int resistencia;
    String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    public void accion() {
        System.out.println("Abriendo cofre " + tipo + " (Capacidad: " + capacidad + " slots)");
    }
    public void colocar() {
        System.out.println("Cofre colocado en el suelo");
    }
    public void colocar(String orientacion) {
        System.out.println("Cofre colocado en la " + orientacion);
    }
    public void romper() {
        System.out.println("Cofre roto! Soltando items...");
    }
}
