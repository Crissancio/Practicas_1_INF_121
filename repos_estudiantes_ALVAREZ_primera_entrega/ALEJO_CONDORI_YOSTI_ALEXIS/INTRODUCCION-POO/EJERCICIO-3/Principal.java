package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1= new Coche("Toyota", "Civic",-7);
		Coche c2= new Coche("Honda", "Jetta", 10);
		c1.Acelerar();
		c2.Acelerar();
		c1.Frenar();
		c2.Frenar();
		c1.mostrarVelocidades();
		c2.mostrarVelocidades();
	}

}
