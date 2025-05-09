package Ejercicio_1;

public class Persona {
	public String nombre;
	public int edad;
	public String ciudad;
	
	//Constructor
	//b) Crea tres personas
	public Persona(String nomx, int edadx, String ciudadx) {
		// TODO Auto-generated constructor stub
		this.nombre=nomx;
		this.edad=edadx;
		this.ciudad=ciudadx;
	}

	//a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
	public void MostarSaludo() {
	        System.out.println("Hola Soy: " + this.nombre + " de: " + this.ciudad);
	   }
	
	//c) Agrega un método para verificar si es mayor de edad
	public void VerificaMayorEdad() {
		if(edad>18){
			System.out.println(this.nombre+ " Si es Mayor de Edad!");
		}
		else {
			System.out.println(this.nombre+" No es mayor de Edad!");
		}
	}

	public String getNombre() {
		return nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
}
