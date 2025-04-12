package humanos;

public class Persona {
	
	private String nombre;
	private int edad;
	private String ciudad;
	
	public Persona(String nombre,int edad,String ciudad) {
		this.nombre=nombre;
		this.edad=edad;
		this.ciudad=ciudad;
	}
	
	public String saludos() {
		return "Hola,soy "+this.nombre+" de "+this.ciudad;
	}
	
	public String compruebaEdadLegal() {
		if (this.edad >= 18) {
            return this.nombre + " es Mayor de Edad";
        } 
		else {
            return this.nombre + " NO es Mayor de Edad";
        }
	}
	public static void main(String[] args) {
		Persona sh1 = new Persona("Fernando",26,"Lima"); 
		Persona sh2 = new Persona("Jazmin",17,"Santa Cruz");
		Persona sh3 = new Persona("Ricardo",42,"Montevideo");
		System.out.println("Introduccion a POO:");
		System.out.println("Exercise 1: ");
		System.out.println("Salida del Codigo: ");
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Algunos Datos de 3 Personas");
		System.out.println("--------------------------------");
		System.out.println(sh1.saludos());
		System.out.println(sh2.saludos());
		System.out.println(sh3.saludos());
		System.out.println("--------------------------------");
		System.out.println(sh1.compruebaEdadLegal());
		System.out.println(sh2.compruebaEdadLegal());
		System.out.println(sh3.compruebaEdadLegal());
		System.out.println("--------------------------------");
		
		
	}

}
