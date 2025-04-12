/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1;

/**
 *
 * @author HP-RYZEN 5
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------- primer videojuego -------");
        Videojuego vj = new Videojuego();
        vj.mostrar();
        
        System.out.println("------- segundo videojuego -------");
        Videojuego vj2 = new Videojuego("yandere", "celular", 6);
        vj2.mostrar();
        
        System.out.println("------- agregar jugadores 1 -------");
        vj.agregarjugadores();
        System.out.println("------- agregar jugadores 2 -------");
        vj2.agregarjugadores(8);
        
        System.out.println("------- actualizado -------");
        vj.mostrar();
        vj2.mostrar();
        
    }
    
}
