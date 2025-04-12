package poo;

public class Persona {
	public String nombre;
	public int edad;
	public String ciudad;

    // Constructor
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // a) Método para mostrar el saludo
    public String saludar() {
        return "Hola, soy " + nombre + " de " + ciudad;
    }

    // c) Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // b) Crear personas y mostrar resultados
    public static void main(String[] args) {
        Persona persona1 = new Persona("Emilia", 21, "Buenos Aires");
        Persona persona2 = new Persona("Mateo", 19, "Bogotá");
        Persona persona3 = new Persona("Valentina", 17, "Santiago");

        Persona[] personas = {persona1, persona2, persona3};

        for (Persona p : personas) {
            System.out.println(p.saludar());
            System.out.println("¿Mayor de edad? " + (p.esMayorDeEdad() ? "Sí" : "No"));
            System.out.println();
        }
    }
}
 