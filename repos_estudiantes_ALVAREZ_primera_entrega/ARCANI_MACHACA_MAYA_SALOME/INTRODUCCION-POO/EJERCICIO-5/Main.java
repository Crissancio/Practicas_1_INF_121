/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER5;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Salome", 5, 9);
        Estudiante e2 = new Estudiante("Luis", 2,5 );
        Estudiante e3 = new Estudiante("Betty", 5, 5);

        System.out.println(e1);
        System.out.println("-------------------");
        System.out.println(e2);
        System.out.println("-------------------");
        System.out.println(e3);
    }
    
}
