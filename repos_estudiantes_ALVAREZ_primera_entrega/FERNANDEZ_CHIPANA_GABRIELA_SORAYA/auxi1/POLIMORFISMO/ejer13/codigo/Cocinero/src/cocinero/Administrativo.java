/*Un restaurante organiza a su personal mediante las siguientes clases:
a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
sumándole las horas extra, considerando el sueldo por hora y la propina
en caso de los meseros.
c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
SueldoMes igual a X.*/

package cocinero;
public class Administrativo {
    private String nombre;
    private float sueldoMes ;
    private String cargo;
public Administrativo(String nombre,float sueldoMes,String cargo){
    this.nombre=nombre;
    this.sueldoMes=sueldoMes;
    this.cargo=cargo;
}
public void SueldoTotal(int sueldox){
    System.out.println("el suledo total quue gana el administrativo es:"+sueldoMes);
      if (sueldoMes==sueldox){
        System.out.println("el administrativo "+nombre+" que gana lo mismo que el sueldo x");
    }
}
}
