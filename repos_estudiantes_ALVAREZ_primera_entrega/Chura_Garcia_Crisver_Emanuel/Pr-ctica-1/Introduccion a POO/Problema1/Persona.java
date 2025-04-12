// 1. Crea una clase Persona con nombre, edad y ciudad
public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
    public void Saludo() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public void Verificar_edad() {
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }

    public static void main(String[] args) {
        System.out.println("Programa enJava");
        System.out.println("b) Crea tres personas y muestra su saludo");
        Persona persona1 = new Persona("Crisver", 19, "El Alto");
        Persona persona2 = new Persona("Crismar", 18, "La Paz");
        Persona persona3 = new Persona("Samuel", 15, "El Alto");

        persona1.Saludo();
        persona2.Saludo();
        persona3.Saludo();

        System.out.println("c) Agrega un método para verificar si es mayor de edad");
        persona1.Verificar_edad();
        persona2.Verificar_edad();
        persona3.Verificar_edad();
    }
}