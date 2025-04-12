package persona;

public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;
    
    public Persona(String nombre, int edad, String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void mostrar(){
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public void mayor(){
        if (edad < 18 && edad >= 0)
            System.out.println("Es menor de edad");
        else if (edad >= 18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Edad inválida");
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Jhon", 11, "La Paz");
        Persona p2 = new Persona("Efrain", 18, "Cochabamba");
        p1.mostrar();
        p1.mayor();
        p2.mostrar();
        p2.mayor();
        
    }
}
