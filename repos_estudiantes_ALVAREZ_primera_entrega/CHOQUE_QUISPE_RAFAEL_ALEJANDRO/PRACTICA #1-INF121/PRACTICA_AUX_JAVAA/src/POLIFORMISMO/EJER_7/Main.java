/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POLIFORMISMO.EJER_7;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 3, "Pastor Aleman");
        Gato gato = new Gato("Luna", "Negro");
        Pajaro pajaro = new Pajaro("Piolin", "Canario");
        System.out.println("--- SONIDOS ---");
        perro.hacerSonido();
        perro.hacerSonido(3); 
        gato.hacerSonido();
        gato.hacerSonido("feliz");
        pajaro.hacerSonido();
        pajaro.hacerSonido(true); 
        System.out.println("\n--- MOVIMIENTO ---");
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }    
}
