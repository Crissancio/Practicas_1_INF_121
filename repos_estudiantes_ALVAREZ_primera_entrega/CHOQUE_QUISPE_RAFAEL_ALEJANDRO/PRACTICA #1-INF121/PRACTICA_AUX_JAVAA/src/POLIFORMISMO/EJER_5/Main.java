/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POLIFORMISMO.EJER_5;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oficina oficina1 = new Oficina(5, 3, 2);
        Oficina oficina2 = new Oficina(8, 5, 3);
        Aula aula1 = new Aula("A301", 30, 15);
        Aula aula2 = new Aula("B202", 25, 10);
        Laboratorio lab1 = new Laboratorio("L101", 20, 10, 20);
        System.out.println("=== AMBIENTES ===");
        oficina1.mostrar();
        oficina2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        lab1.mostrar();
        System.out.println("\n=== TOTAL DE MUEBLES ===");
        System.out.println("Oficina 1 (simple): " + oficina1.cantidadMuebles());
        System.out.println("Oficina 1 (ponderado): " + oficina1.cantidadMuebles(2, 3)); 
        System.out.println("Aula A301 (simple): " + aula1.cantidadMuebles());
        System.out.println("Aula A301 (con 2 muebles/persona): " + aula1.cantidadMuebles(2));
        System.out.println("Laboratorio L101 (mesas=2u, sillas=1u): " + lab1.cantidadMuebles(2, 1));
    }

    
}
