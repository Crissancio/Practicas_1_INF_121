package Ejercicio1;

public class Persona {
    public String nombre;
    public int edad;
    public String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public void Saludad(){
        System.out.println("Hola, soy " +nombre +" de " +ciudad);
    }
    public boolean EsMayorDeEdad(){
    	if(edad>=18) {
    		return true;
    	}
    	return false;
    }
}
