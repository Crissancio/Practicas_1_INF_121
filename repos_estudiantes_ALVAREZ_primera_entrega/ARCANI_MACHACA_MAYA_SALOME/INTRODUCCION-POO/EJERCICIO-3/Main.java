/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER3;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1 = new Coche("Suzuki", "Swift");
        Coche c2 = new Coche("Renault", "Duster");
        c1.acelerar();
        c1.frenar();
        c1.acelerar();

        c2.acelerar();
        c2.frenar();
        c2.frenar();  

        System.out.println(c1);
        System.out.println(c2);
    }
    
}
