package inf121;

public class Coche {
		
		String marca;
		String modelo;
		float velocidad;
		
		
		
public Coche(String marca, String modelo, int velocidad) {
		this.marca=marca;
		this.modelo=modelo;
		this.velocidad=velocidad;
		}
public float acelerar() {
	return velocidad = velocidad+10;
}
public float frenar() {
	return velocidad = velocidad - 5;
}

public void mostrarVelocidad() {
	System.out.println("el coche "+marca+" "+modelo+" tiene una velocidad de  "+ velocidad +"km/h");
}
		
		
		
		
public static void main(String[] args){
		Coche c1 = new Coche("honda","Cavic",60);
		Coche c2 = new Coche("toyota","Corolla",90);
	System.out.println("auto 1");
	
	c1.mostrarVelocidad();
	System.out.println("auto 2");
	c2.mostrarVelocidad();
	
	
	
	}
}
