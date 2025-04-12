
package Ejercicio3;


public class Main {
    public static void main(String[] args) {

        Cocinero cocinero = new Cocinero("Luis", 2000, 10, 15.5f);
        Mesero mesero1 = new Mesero("Carlos", 1800, 8, 14f, 100f);
        Mesero mesero2 = new Mesero("Ana", 1900, 6, 13f, 120f);
        Administrativo admin1 = new Administrativo("María", 2200, "Contadora");
        Administrativo admin2 = new Administrativo("Pedro", 2000, "Jefe");
         
        cocinero.mostrar();
        System.out.println("Sueldo total Cocinero: " + cocinero.sueldoTotal());
        mesero1.mostrar();
        System.out.println("Sueldo total Mesero 1: " + mesero1.sueldoTotal());
        mesero2.mostrar();
        System.out.println("Sueldo total Mesero 2: " + mesero2.sueldoTotal());
        admin1.mostrar();
        System.out.println("Sueldo total Administrativo 1: " + admin1.sueldoTotal());
        admin2.mostrar();
        System.out.println("Sueldo total Administrativo 2: " + admin2.sueldoTotal());


        int sueldoX = 2000;
        cocinero.sueldoTotal(sueldoX);
        mesero1.sueldoTotal(sueldoX);
        mesero2.sueldoTotal(sueldoX);
        admin1.sueldoTotal(sueldoX);
        admin2.sueldoTotal(sueldoX);
    }
}

