/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_7;

/**
 *
 * @author Trabajo
 */
public class Gato {
    String nombre;
    String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau!");
    }
    public void hacerSonido(String animo) {
        String sonido = animo.equals("feliz") ? "Ronroneo" : "Bufido";
        System.out.println(nombre + " (color: " + color + ") hace: " + sonido);
    }
    public void moverse() {
        System.out.println(nombre + " esta saltando sigilosamente.");
    }
}