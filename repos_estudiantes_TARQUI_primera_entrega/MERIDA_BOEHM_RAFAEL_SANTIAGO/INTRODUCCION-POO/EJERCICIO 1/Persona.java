package Ejercicio_1;

public class Persona {
    public String nombre;
    public int edad;
    public String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String saludar() {
        return "Hola, soy " + this.nombre + " de " + this.ciudad;
    }

    public boolean esMayor() {
        return edad >= 18;
    }

    public String toString() {
        return "Persona: " + nombre + ", Edad: " + this.edad + ", Ciudad: " + this.ciudad;
    }

}
