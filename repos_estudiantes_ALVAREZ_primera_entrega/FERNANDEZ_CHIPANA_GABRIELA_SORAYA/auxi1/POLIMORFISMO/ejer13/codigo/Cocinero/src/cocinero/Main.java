/*Un restaurante organiza a su personal mediante las siguientes clases:
a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
sumándole las horas extra, considerando el sueldo por hora y la propina
en caso de los meseros.
c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
SueldoMes igual a X.*/
package cocinero;
public class Main {

    public static void main(String[] args) {
        Cocinero cocinero=new Cocinero("carlos",2000,4,23);
        Mesero mesero=new Mesero("maria",1500,5,10,50);
        Mesero mesero1=new Mesero("pedro",2000,3,23,50);
        Administrativo administrativo= new Administrativo("aurora",3000,"gerente");
        Administrativo administrativo1= new Administrativo("aurora",3000,"gerente");
        cocinero.SueldoTotal(1500);
        mesero.SueldoTotal(1500);
        mesero1.SueldoTotal(1500);
        administrativo.SueldoTotal(1500);
        administrativo1.SueldoTotal(1500);
    }
    
}
