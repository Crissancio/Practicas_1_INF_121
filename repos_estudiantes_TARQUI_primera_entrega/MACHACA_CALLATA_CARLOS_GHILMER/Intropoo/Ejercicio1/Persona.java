/*  1. Crea una clase Persona con nombre, edad y ciudad
a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
b) Crea tres personas y muestra su saludo
c) Agrega un método para verificar si es mayor de edad */






package Intropoo.Ejercicio1;

public class Persona {
    private int edad;
    private String nombre;
    private String ciudad;

    public Persona(int edad, String nombre, String ciudad) {
        this.edad = edad;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public void mostrar() {
       System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }
    
    // c) Verificar si es mayor de edad 
    public void VerificarEdad() {
        if(edad >= 18){
            System.out.println(nombre + " es mayor de edad.");      
        }else {
            System.out.println(nombre + " es menor de edad.");
        }
    }
    


public static void main(String[] args) {
    
            // a) Mostrar el saludo 
    Persona p1 = new Persona(21,"carlos","La Paz");
    p1.mostrar();
    
    // b) Crea 3 personas y crea su saludo 
    Persona p2 = new Persona(10,"Mauricio","Beni");
    Persona p3 = new Persona(18,"Manuel","Santa Cruz");
    Persona p4 = new Persona(10,"Erland","La Paz");
    p2.mostrar();
    p3.mostrar();
    p4.mostrar();
    System.out.println(" ----- EDADES DE LAS PERSONAS -----");
    // c) verificar su edad 
    p1.VerificarEdad();
    p2.VerificarEdad();
    p3.VerificarEdad();
    p4.VerificarEdad();

}
    
}

