package IntroduccionPOO.Ejercicio1;

public class Persona {
    String nombre;
    int edad;
    String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + this.nombre + " de " + this.ciudad);
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    //main
    public static void main(String[] args) {
    
        Persona persona1 = new Persona("Ana", 25, "La Paz");
        Persona persona2 = new Persona("Carlos", 17, "Santa Cruz");
        Persona persona3 = new Persona("Sofia", 30, "Cochabamba");

        persona1.saludar();
        persona2.saludar();
        persona3.saludar();

        System.out.println(persona1.nombre + " es mayor de edad? " + persona1.esMayorDeEdad());
        System.out.println(persona2.nombre + " es mayor de edad? " + persona2.esMayorDeEdad());
        System.out.println(persona3.nombre + " es mayor de edad? " + persona3.esMayorDeEdad());
    }
}