/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INTRO_POO.EJER_1;

/**
 *
 * @author Trabajo
 */
public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void mostrarSaludo() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Si tiene " + edad + " edad, es mayor de edad");
        } else {
            System.out.println("No tiene " + edad + " edad, es menor de edad");
        }
    }
}