
package ejercicio7;

public class Persona {


	
	public String nombre;
	public String ciudad;
	public int edad;
	
	public Persona (String nombre,String ciudad, int edad ) {
		this.ciudad=ciudad;
		this.edad=edad;
		this.nombre=nombre;
	}
	
	public void mostrarSaludo() {
		System.out.println("Hola mi nombre es: " +nombre+ " de la ciudad de :"+ciudad );
	}

	public void mostrarEdad(){
		
		if (this.edad>18) {
			System.out.println("la persona:" +this.nombre + " es mayor de edad"); 
			
		}else {
			System.out.println("la persona:" +this.nombre + "  es menor de edad de edad");
		}
	}

	public static void main(String[] args) {
		Persona p1 = new Persona("Javier", "Lapaz",12);
		Persona p2 = new Persona("Juan", "SantaCruz", 20);
		Persona p3 = new Persona("Eduardo", "Lapaz",14);
		
		p1.mostrarSaludo();
		p2.mostrarSaludo();
		p3.mostrarSaludo();

		p1.mostrarEdad();
		p2.mostrarEdad();
		p3.mostrarEdad();
		
	}

}


