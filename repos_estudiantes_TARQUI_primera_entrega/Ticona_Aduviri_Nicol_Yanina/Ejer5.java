/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer5;

/**
 *
 * @author HP-RYZEN 5
 */
public class Ejer5 {

    public static void main(String[] args) {
        System.out.println("------------ Estudiantes ------------");
        Estudiante es1 = new Estudiante("Gabriela", 6, 7);
        Estudiante es2 = new Estudiante("Matias", 8, 10);
        Estudiante es3 = new Estudiante("Mateo", 6, 3);
        
        System.out.println("------------ promedios y aprobo o reprobo ------------");
        es1.mostrar();
        es2.mostrar();
        es3.mostrar();
        
    }
}
