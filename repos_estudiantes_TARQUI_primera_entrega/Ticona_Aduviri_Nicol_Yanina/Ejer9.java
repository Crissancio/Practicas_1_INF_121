/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer9;

/**
 *
 * @author HP-RYZEN 5
 */
public class Ejer9 {

    public static void main(String[] args) {
        System.out.println("------------- computadora -------------");
        Computadora c = new Computadora();
        c.mostrarcomp();
        
        System.out.println("------------- encender computadora -------------");
        c.encender();
        
        System.out.println("------------- mostrar componentes -------------");
        c.mostrarcomp();
        
        System.out.println("------------- apagar computadora -------------");
        c.apagar();
        
    }
}
