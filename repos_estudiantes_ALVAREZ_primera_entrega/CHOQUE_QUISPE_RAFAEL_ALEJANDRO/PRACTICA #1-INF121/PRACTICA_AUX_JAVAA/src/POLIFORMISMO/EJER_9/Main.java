/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POLIFORMISMO.EJER_9;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BloqueCofre cofre1 = new BloqueCofre(27, 50, "roble");
        BloqueCofre cofre2 = new BloqueCofre(54, 100, "ender"); 
        BloqueTnt tnt1 = new BloqueTnt("normal", 10);
        BloqueTnt tnt2 = new BloqueTnt("super", 25);
        BloqueHorno horno1 = new BloqueHorno("negro", 3);
        BloqueHorno horno2 = new BloqueHorno("blanco", 6);
        System.out.println("--- ACCIONES ---");
        cofre1.accion();
        tnt2.accion();
        horno1.accion();
        System.out.println("\n--- COLOCAR ---");
        cofre2.colocar("pared");
        tnt1.colocar(true);
        horno2.colocar("piedra");
        System.out.println("\n--- ROMPER ---");
        cofre1.romper();
        tnt2.romper();
        horno2.romper();
    }
    
}
