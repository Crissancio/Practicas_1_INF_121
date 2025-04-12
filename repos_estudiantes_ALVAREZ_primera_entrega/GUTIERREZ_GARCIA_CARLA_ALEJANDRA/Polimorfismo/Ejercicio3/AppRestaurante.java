package Ejercicio3;

public class AppRestaurante {
    public static void main(String[] args) {
        // a) Instanciar al menos 2 objetos de cada clase
        Cocinero cocinero1 = new Cocinero("Raul Cordobeza", 6500, 3, 150);
        Cocinero cocinero2 = new Cocinero("Maria Lopez", 7000, 5, 200);
        Mesero mese1 = new Mesero("Pablo Mese1", 4000, 2, 100, 300);
        Mesero mese2 = new Mesero("Teresa Mese2", 4000, 1, 100, 500);
        Administrativo admin1 = new Administrativo("Axel Admin", 5000, "Gerente");
        Administrativo admin2 = new Administrativo("Joaquin Admin", 4500, "Encargado");

        // b) Mostrar el sueldo total de cada empleado
        System.out.println("-------I N C I S O     B-------");
        cocinero1.sueldoTotal();
        cocinero2.sueldoTotal(5, 200);
        mese1.sueldoTotal();
        mese2.sueldoTotal(3, 150, 400); 
        admin1.sueldoTotal();
        admin2.sueldoTotal(10, 100); 

        // c) Mostrar empleados con sueldo igual a X
        System.out.println("-------I N C I S O     C-------");
        int x = 5000;
        cocinero1.mostrar(x);
        cocinero2.mostrar(x, "Este cocinero tiene un sueldo igual al buscado.");
        mese1.mostrar(x);
        mese2.mostrar(x, "Este mesero tiene un sueldo igual al buscado.");
        admin1.mostrar(x);
        admin2.mostrar(x, "Este administrativo tiene un sueldo igual al buscado.");

       
    }
}