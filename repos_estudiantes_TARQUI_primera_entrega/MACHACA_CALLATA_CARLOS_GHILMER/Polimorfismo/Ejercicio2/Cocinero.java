/*  3. Un restaurante organiza a su personal mediante las siguientes clases:

a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
sumándole las horas extra, considerando el sueldo por hora y la propina
en caso de los meseros.
c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
SueldoMes igual a X. */



package Polimorfismo.Ejercicio2;

public class Cocinero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    
    
    public double SueldoTotal(){
         return sueldoMes + (horasExtra * sueldoHora);
    }
    public void mostrar(){
        System.out.println("El sueldo total del cocinero es " + SueldoTotal());
    }
    
    public double mostrarEmpleados(){
        double x = 2300;
        if(getSueldoMes() == x){
            System.out.println("el cocinero " + nombre + " tiene el mismo sueldo que X "); 
        }else{
            System.out.println("no es el mismo");
        }
        return x;
        
    }
    
    public int getSueldoMes(){
        return sueldoMes;
    }
    
    
}
