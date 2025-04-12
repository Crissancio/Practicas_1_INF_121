/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POLIFORMISMO.EJER_1;

/**
 *
 *@author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Mario Kart");
        Videojuego juego2 = new Videojuego("Zelda", "Aventura");
        Videojuego juego3 = new Videojuego("FIFA", "Deportes", 4);
        System.out.println("--- Informacion inicial ---");
        juego1.mostrar();
        juego2.mostrar();
        juego3.mostrar();
        juego1.agregarJugadores(); 
        juego2.agregarJugadores(3); 
        System.out.println("\n--- Despues de agregar jugadores ---");
        juego1.mostrar();
        juego2.mostrar();
    }
    
}
