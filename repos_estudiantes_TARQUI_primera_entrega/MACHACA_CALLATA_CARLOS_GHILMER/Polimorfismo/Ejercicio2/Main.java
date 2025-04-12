/*  3. Un restaurante organiza a su personal mediante las siguientes clases:

a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
sumándole las horas extra, considerando el sueldo por hora y la propina
en caso de los meseros.
c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
SueldoMes igual a X. */




package Polimorfismo.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero("Juan",2300,3,240);
        Mesero mesero1 = new Mesero("Pedro",2500,2,240,12);
        Mesero mesero2 = new Mesero("Maria",2430,2,240,12);
        Administrativo admin1 = new Administrativo("Rick",2250,"jefe");
        Administrativo admin2 = new Administrativo("Carlos",2300,"jefe");
        cocinero1.mostrar();
        cocinero1.mostrarEmpleados();
        System.out.println("-----------------------------");
        mesero1.mostrar();
        mesero1.mostrarEmpleados();
        System.out.println("-----------------------------");
         mesero2.mostrar();
        mesero2.mostrarEmpleados(); 
        System.out.println("-----------------------------");
        admin1.mostrar();
        admin1.mostrarEmpleados();
        System.out.println("-----------------------------");
        admin2.mostrar();
        admin2.mostrarEmpleados();
    }
    }

   
    
}
