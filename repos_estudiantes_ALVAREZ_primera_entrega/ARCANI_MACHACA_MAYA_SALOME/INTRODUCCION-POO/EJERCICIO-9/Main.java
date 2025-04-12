/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER9;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Computadora pc = new Computadora("Intel i5", 8, 512);

        System.out.println(pc);
        System.out.println( "--------------");
        pc.mostrarEstado();
        pc.encender();
        pc.mostrarEstado();
        pc.apagar();
        pc.mostrarEstado();

        
      
    }
    
}
