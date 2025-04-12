/*
3.Un restaurante organiza a su personal mediante las siguientes clases:
 
  a)Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
  b)Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole las horas extra, 
    considerando el sueldo por hora y la propina en caso de los meseros. 
  c)Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.

*/
package Ejercicios.ejercicio_3;


public class Main {
    
    public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero("Camila");
        
        Mesero mesero1 = new Mesero("Daniela");
        Mesero mesero2 = new Mesero("Oliver");
        
        Administrativo admi1 = new Administrativo("Alan","Jefe");
        Administrativo admi2 = new Administrativo("Cindy" , "jefe 2");
        
        cocinero1.sueldoTotal(1500, 200, 100);
        
        mesero1.sueldoTotal(1000, 500, 100, 50);
        mesero2.sueldoTotal(1000, 500, 100, 50);
        
        admi1.sueldoTotal(2500);
        admi2.sueldoTotal(2500);
    }
}
