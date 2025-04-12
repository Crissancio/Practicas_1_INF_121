/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POLIFORMISMO.EJER_3;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocinero chef = new Cocinero("Juan", 1000, 5, 15.5f);
        Mesero mesero1 = new Mesero("Maria", 800, 3, 10.0f, 120.5f);
        Mesero mesero2 = new Mesero("Pedro", 750, 2, 10.0f, 80.0f);
        Administrativo admin1 = new Administrativo("Ana", 1200.0f, "Contabilidad");
        Administrativo admin2 = new Administrativo("Luis", 1100.0f, "RRHH");
        System.out.println("--- Sueldos totales ---");
        System.out.println(chef.nombre + ": $" + chef.calcularSueldo());
        System.out.println(mesero1.nombre + ": $" + mesero1.calcularSueldo());
        System.out.println(mesero2.nombre + ": $" + mesero2.calcularSueldo());
        System.out.println(admin1.nombre + ": $" + admin1.calcularSueldo());
        System.out.println(admin2.nombre + ": $" + admin2.calcularSueldo());
        System.out.println("\n--- Empleados con sueldo $900 ---");
        float x = 900.0f;
        if (chef.calcularSueldo(x)) System.out.println(chef.nombre + " (Cocinero)");
        if (mesero1.calcularSueldo(x)) System.out.println(mesero1.nombre + " (Mesero)");
        if (mesero2.calcularSueldo(x)) System.out.println(mesero2.nombre + " (Mesero)");
        if (admin1.calcularSueldo(x)) System.out.println(admin1.nombre + " (Administrativo)");
        if (admin2.calcularSueldo(x)) System.out.println(admin2.nombre + " (Administrativo)");
    }
    
}
