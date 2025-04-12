package ejercicio;

public class AppRestaurant {

	public static void main(String[] args) {
		Cocinero cocinero = new Cocinero("Max",2000,20,20);
		Mesero mesero1 = new Mesero("jorge",1200,5,10,20);
		Mesero mesero2 = new Mesero("Paul",1500,9,10,200);
		Administrativo administrativo1 = new Administrativo("Juan",3000,"gerente");
		Administrativo administrativo2= new Administrativo("Pedro",2500,"contador");
		System.out.println("El sueldo total del cocinero %.s es de: ", cocinero.nombre);
		
	}
	

}
