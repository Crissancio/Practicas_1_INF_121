/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER7;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular cel = new Celular();
        cel.instalarApp("telegram", 120);
        cel.instalarApp("instagram", 300);
        cel.instalarApp("facebook", 500);

        cel.usarApp("telegram", 20);
        cel.usarApp("instagram", 10);
        cel.usarApp("facebook", 30);

        cel.mostrarBateria();
        System.out.println(cel);
    }
    
}
