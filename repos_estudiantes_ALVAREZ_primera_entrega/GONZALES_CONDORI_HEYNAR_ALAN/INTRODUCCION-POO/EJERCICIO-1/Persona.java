/*1. Crea una clase Persona con nombre, edad y ciudad
       a)Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
       b)Crea tres personas y muestra su saludo
       c)Agrega un método para verificar si es mayor de edad
**/
package Ejercicios;

public class Persona {
   private String nombre;
   private int edad;
   private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    
    public void saludar(){
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }
    public void esMayorDeEdad(int edad){
        if (edad>=18) {
            System.out.println(nombre+" Es mayor de edad");
        }else{
            System.out.println(nombre+" Es menor de edad");
        }
    }
    public static void main(String[] args) {
        Persona p1=new Persona("Alan", 23, "La paz");
        Persona p2=new Persona("Carla", 15, "Oruro");
        Persona p3=new Persona("Daniela", 21, "Santa Cruz");
        
        p1.saludar();
        p2.saludar();
        p3.saludar();
        
        p1.esMayorDeEdad(23);
        p2.esMayorDeEdad(15);
        p3.esMayorDeEdad(21);
    }
}
