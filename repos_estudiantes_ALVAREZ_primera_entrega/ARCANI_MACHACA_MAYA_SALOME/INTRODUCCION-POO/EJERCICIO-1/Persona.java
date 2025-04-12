/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER1;

/**
 *
 * @author LENOVO
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

    public String getNombre() {
        return nombre;
    }

    public String mostrarSaludo() {
        return "Hola, soy " + nombre + " de " + ciudad;
    }

    public boolean mayEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Ciudad: " + ciudad;
    }
}

