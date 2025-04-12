/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER1;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Maya", 20, "La Paz");
        Persona p2 = new Persona("Luis", 17, "Cochabamba");
        Persona p3 = new Persona("Harim", 22, "Snta Cruz");

        System.out.println(p1.mostrarSaludo());
        System.out.println(p2.mostrarSaludo());
        System.out.println(p3.mostrarSaludo());
        
        System.out.println("--------------------------");

        System.out.println(p1.getNombre() +" es mayor de edad: " +p1.mayEdad());
        System.out.println(p2.getNombre() +" es mayor de edad: " +p2.mayEdad());
        System.out.println(p3.getNombre() +" es mayor de edad: " +p3.mayEdad());
    }
    
}
