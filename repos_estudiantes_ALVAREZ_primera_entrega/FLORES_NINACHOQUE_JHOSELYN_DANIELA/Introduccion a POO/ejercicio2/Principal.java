package ejercicio2;
public class Principal {
	public static void main(String[] args) {
		Coche c1=new Coche("Toyota","Hilux");
		Coche c2=new Coche("Nissan","Frontier");
		c1.acelerar();
		c1.mostrar();
		c1.frenar();
		c1.mostrar();
		
		c2.acelerar();
		c2.mostrar();
		c2.frenar();
		c2.mostrar();
		
		
	}
}
	