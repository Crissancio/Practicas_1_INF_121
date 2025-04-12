package ejercicio1;
public class Persona {
	public String nombre,ciudad;
	public int edad;
	public Persona(String nombre, String ciudad, int edad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ciudad=" + ciudad + ", edad=" + edad + "]";
	}
	public void  mostrarSaludo() {
		System.out.println("Hola, soy "+this.nombre+" de "+this.ciudad);
	}
	public boolean verificarMayorEdad() {
		return edad>=18;	
	}
	public void mostraEdad() {
		if (verificarMayorEdad()) {
			System.out.println(this.nombre+ "  es mayor de edad");
		}
		else {
			System.out.println(this.nombre+"  no es mayor de edad");
		}
	}
}
