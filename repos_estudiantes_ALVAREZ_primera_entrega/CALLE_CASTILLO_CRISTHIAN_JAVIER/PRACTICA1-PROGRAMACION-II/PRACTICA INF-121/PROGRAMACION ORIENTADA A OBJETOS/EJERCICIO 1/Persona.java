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
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 22, "La Paz");
        Persona persona2 = new Persona("Luis", 17, "Cochabamba");
        Persona persona3 = new Persona("Maria", 30, "Santa Cruz");

        Persona[] personas = {persona1, persona2, persona3};

        for (Persona p : personas) {
            p.saludar();
            if (p.esMayorDeEdad()) {
                System.out.println(p.nombre + " es mayor de edad.");
            } else {
                System.out.println(p.nombre + " NO es mayor de edad.");
            }
        }
    }
}
