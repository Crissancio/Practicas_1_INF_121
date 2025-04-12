/*  3. Un restaurante organiza a su personal mediante las siguientes clases:

a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
sumándole las horas extra, considerando el sueldo por hora y la propina
en caso de los meseros.
c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
SueldoMes igual a X. */




package Polimorfismo.Ejercicio2;

public class Administrativo {
    private String nombre;
     private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public double SueldoTotal(){
        return sueldoMes;
    }
    
    public void mostrar(){
        System.out.println("El sueldo total del Administrativo es " + SueldoTotal());
    }
    
     public float mostrarEmpleados(){
        float x = 2300;
        if(getSueldoMes() == x){
            System.out.println("El mesero " + nombre + " tiene el mismo sueldo que X "); 
        }else{
            System.out.println("no es el mismo");
        }
        return x;
        
    }
    
    public float getSueldoMes(){
        return sueldoMes;
    }

    
    
}
