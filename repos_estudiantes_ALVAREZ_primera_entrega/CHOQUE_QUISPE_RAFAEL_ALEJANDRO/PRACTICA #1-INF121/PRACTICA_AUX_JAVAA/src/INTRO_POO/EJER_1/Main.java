/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package INTRO_POO.EJER_1;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Persona persona1 = new Persona("Andrea", 20, "La Paz");
        Persona persona2 = new Persona("Carlos", 17, "Cochabamba");
        Persona persona3 = new Persona("Lucia", 25, "Santa Cruz");
        persona1.mostrarSaludo();
        persona1.esMayorDeEdad();
        persona2.mostrarSaludo();
        persona2.esMayorDeEdad();
        persona3.mostrarSaludo();
        persona3.esMayorDeEdad();
    }
    
}
