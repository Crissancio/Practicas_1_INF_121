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

    public static void main(String[] args) {
        VideoJuego v1 = new VideoJuego("Call", "Pubg", 1);
        VideoJuego v2 = new VideoJuego("Minecraft");

        v1.mostrar();
        v2.agregarJugadores(3);
        System.out.println("-----------------");
        v2.mostrar();
       
    }
    
}
