/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIFORMISMO.EJER_7;

/**
 *
 * @author Trabajo
 */
public class Perro {
    String nombre;
    int edad;
    String raza;
    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }
    public void hacerSonido(int intensidad) {
        String sonido = "" + "GUAU ".repeat(intensidad).trim() + "!";
        System.out.println(nombre + " (raza: " + raza + ") grune: " + sonido);
    }

    public void moverse() {
        System.out.println(nombre + " esta corriendo.");
    }
}

