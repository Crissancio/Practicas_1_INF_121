/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_7;

/**
 *
 * @author Trabajo
 */
public class Pajaro {
    String nombre;
    String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public void hacerSonido() {
        System.out.println(nombre + " canta: Pio pio!");
    }

    public void hacerSonido(boolean esDeNoche) {
        String sonido = esDeNoche ? "Canto nocturno" : "Trino matutino";
        System.out.println(nombre + " (" + tipo + ") emite: " + sonido);
    }
    public void moverse() {
        System.out.println(nombre + " esta volando.");
    }
}
