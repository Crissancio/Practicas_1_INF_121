/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_9;

/**
 *
 * @author Trabajo
 */
public class BloqueTnt {
    String tipo;
    int daño;

    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion() {
        System.out.println("" + tipo + " activada! Cuidado!");
    }
    public void colocar() {
        System.out.println("TNT colocada en el suelo");
    }

    public void colocar(boolean conPalanca) {
        System.out.println("TNT colocada " + (conPalanca ? "con palanca" : "sin palanca"));
    }
    public void romper() {
        System.out.println("BOOM! La TNT causo " + daño + " de dano");
    }
}
