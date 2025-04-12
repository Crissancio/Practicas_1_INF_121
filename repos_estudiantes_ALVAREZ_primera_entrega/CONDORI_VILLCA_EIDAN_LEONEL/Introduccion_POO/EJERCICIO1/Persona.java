package EJERCICIO1;
//Crea una clase Persona con nombre, edad y ciudad
//a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
//b) Crea tres personas y muestra su saludo
//c) Agrega un método para verificar si es mayor de edad
public class Persona {
	private String nombre,ciudad;
	private int edad;
	public Persona(String nombre,String ciudad,int edad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;
	}
	public void saludar() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {

        Persona per1 = new Persona("Analy", "Paris",14);
        Persona per2 = new Persona("Pedro", "Boston",18);
        Persona per3 = new Persona("Cesar", "Buenos Aires",12);

        per1.saludar();
        System.out.println("¿Mayor de edad? " + per1.esMayorDeEdad());

        per2.saludar();
        System.out.println("¿Mayor de edad? " + per2.esMayorDeEdad());

        per3.saludar();
        System.out.println("¿Mayor de edad? " + per3.esMayorDeEdad());
    }
}