
package persona;

public class Persona {
    public String nombre;
    public int edad;
    public String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public void verificarEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " no es mayor de edad");
        }
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", 20, "Lima");
        Persona p2 = new Persona("Ana", 17, "Quito");
        Persona p3 = new Persona("Luis", 25, "Bogota");

        p1.saludar(); p1.verificarEdad();
        p2.saludar(); p2.verificarEdad();
        p3.saludar(); p3.verificarEdad();
    }
}

