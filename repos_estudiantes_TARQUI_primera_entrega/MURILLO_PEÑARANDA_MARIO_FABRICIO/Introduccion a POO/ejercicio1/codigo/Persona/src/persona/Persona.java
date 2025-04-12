/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

/**
 *
 * @author Fabricio
 */
/*
 * ENUNCIADO:
 * 1. Crea una clase Persona con nombre, edad y ciudad
 * a) Agrega un método para mostrar el saludo: "Hola, soy (nombre) de {ciudad}"
 * b) Crea tres personas y muestra su saludo
 * c) Agrega un método para verificar si es mayor de edad
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

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 25, "La Paz");
        Persona p2 = new Persona("Luis", 16, "Cochabamba");
        Persona p3 = new Persona("Maria", 30, "Santa Cruz");

        p1.saludar();
        p2.saludar();
        p3.saludar();

        System.out.println(p1.nombre + " es mayor: " + p1.esMayorDeEdad());
        System.out.println(p2.nombre + " es mayor: " + p2.esMayorDeEdad());
        System.out.println(p3.nombre + " es mayor: " + p3.esMayorDeEdad());
    }
}