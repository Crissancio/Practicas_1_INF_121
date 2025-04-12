/*1. Crea una clase Persona con nombre, edad y ciudad
a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
b) Crea tres personas y muestra su saludo
c) Agrega un método para verificar si es mayor de edad */
package persona;
public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    
    public String saludo(){
        return "Hola soy " + nombre + " de " + ciudad ;
    }
    public void verificarEdad(){
        if(edad < 18){
            System.out.println("No es mayor de edad");
        }
        else{
            System.out.println("Es mayor de edad");
        }
    }
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 22, "La Paz");
        Persona persona2 = new Persona("Marcelo", 17,"Santa Cruz");
        Persona persona3 = new Persona("Maria", 23,"Oruro");
        
        System.out.println(persona1.saludo());
        persona1.verificarEdad();
        System.out.println(persona2.saludo());
        persona2.verificarEdad();
        System.out.println(persona3.saludo());
        persona3.verificarEdad();
    }
    
}
