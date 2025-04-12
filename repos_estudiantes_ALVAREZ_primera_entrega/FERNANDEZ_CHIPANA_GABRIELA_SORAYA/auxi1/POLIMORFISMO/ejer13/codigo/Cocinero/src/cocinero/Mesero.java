/*Un restaurante organiza a su personal mediante las siguientes clases:
a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
sumándole las horas extra, considerando el sueldo por hora y la propina
en caso de los meseros.
c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
SueldoMes igual a X.*/
package cocinero;
public class Mesero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private float propina;

public Mesero(String nombre, int sueldoMes, int horasExtra,float sueldoHora,float propina){
this.nombre=nombre;
this.sueldoMes=sueldoMes;
this.horasExtra=horasExtra;
this.sueldoHora=sueldoHora;
this.propina=propina;
}
public void SueldoTotal(int sueldox){
    float total=0;
    float extra=0;
    extra=this.horasExtra*this.sueldoHora;
    total=sueldoMes+extra+this.propina;
    System.out.println("el suledo total quue gana el mesero es:"+total);
    if (sueldoMes==sueldox){
        System.out.println("los meseros que ganan lo mismo que el sueldo x son:"+nombre);
    }
}
}