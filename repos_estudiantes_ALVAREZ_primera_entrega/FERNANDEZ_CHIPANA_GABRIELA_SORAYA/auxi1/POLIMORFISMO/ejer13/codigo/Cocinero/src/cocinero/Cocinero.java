/*Un restaurante organiza a su personal mediante las siguientes clases:
a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
sumándole las horas extra, considerando el sueldo por hora y la propina
en caso de los meseros.
c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
SueldoMes igual a X.*/
package cocinero;
public class Cocinero {
    private String nombre;
    private int sueldoMes;
    private int horaExtra;
    private float sueldoHora;
    public Cocinero(String nombre, int sueldoMes,int horaExtra,float sueldoHora){
        this.nombre=nombre;
        this.sueldoMes=sueldoMes;
        this.horaExtra=horaExtra;
        this.sueldoHora=sueldoHora;
    }
   public void SueldoTotal(int sueldox){
    float total=0;
    float extra=0;
    extra=this.horaExtra*this.sueldoHora;
    total=sueldoMes+extra;
    System.out.println("el suledo total quue gana el mesero es:"+total);
    if (sueldoMes==sueldox){
        System.out.println("los cocineros que ganan lo mismo que el sueldo x son:"+nombre);
    }
}
    
}
