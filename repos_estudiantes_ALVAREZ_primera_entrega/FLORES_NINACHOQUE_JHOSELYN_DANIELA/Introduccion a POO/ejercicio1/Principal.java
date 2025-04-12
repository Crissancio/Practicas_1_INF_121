package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Persona p1=new Persona("Maria","La Paz",25);
		Persona p2=new Persona("Pepito","Oruro",18);
		Persona p3=new Persona("Alex","Tarija",15);
		p1.mostrarSaludo();
		p2.mostrarSaludo();
		p3.mostrarSaludo();
		
		p1.mostraEdad();
		p2.mostraEdad();
		p3.mostraEdad();
	}
}
