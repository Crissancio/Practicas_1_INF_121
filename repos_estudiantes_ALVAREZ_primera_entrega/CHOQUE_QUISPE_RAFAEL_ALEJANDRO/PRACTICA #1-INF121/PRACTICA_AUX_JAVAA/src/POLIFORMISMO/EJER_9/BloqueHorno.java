/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_9;

/**
 *
 * @author Trabajo
 */
public class BloqueHorno {
    String color;
    int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }
    public void accion() {
        System.out.println("Horno " + color + " cocinando " + capacidadComida + " alimentos");
    }

    public void colocar() {
        System.out.println("Horno colocado en el suelo");
    }

    public void colocar(String materialBase) {
        System.out.println("Horno colocado sobre " + materialBase);
    }

    public void romper() {
        System.out.println("Horno roto. Se perdieron los alimentos!");
    }
}