package Ejer1;

public class Persona {
	
	private 
	String nombre;
	int edad;
	String ciudad;

	public Persona(String nombre, int edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
	}
	
	public void mostrarSaludo() {
		System.out.println("Hola, soy " + nombre + " de " + ciudad);
	}

	public void veriEdad(Persona p) {
		if(p.edad>18) {
			System.out.println("Es mayor de edad");
		}
		else {System.out.println("No es mayor de edad");}		
	}
	
	public static void main(String[] args) {
        Persona persona1 = new Persona("Jimmy", 25, "La Paz");
        Persona persona2 = new Persona("Ana", 17, "Cochabamba");
        Persona persona3 = new Persona("Carlos", 30, "Santa Cruz");
        
        persona1.mostrarSaludo();
        persona2.mostrarSaludo();
        persona3.mostrarSaludo();
        
        System.out.println("---------******----------");
        
        System.out.println("¿" + persona1.nombre + " es mayor de edad?");
        persona1.veriEdad(persona1);
        System.out.println("¿" + persona2.nombre + " es mayor de edad?");
        persona2.veriEdad(persona2);
        System.out.println("¿" + persona3.nombre + " es mayor de edad?");
        persona3.veriEdad(persona3);            
    }	
}
